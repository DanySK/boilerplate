package org.danilopianini.util;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Iterates over an InputStream, using a 128KB buffer to achieve decent performance.
 */
public class InputStreamIterator implements Iterator<Byte> {

    private static final int BUFFER_SIZE = 128 * 1024;
    private final InputStream in;
    private final byte[] buffer = new byte[BUFFER_SIZE];
    private int read, index;
    private boolean isClosed;
    private final Consumer<IOException> ifFails;

    /**
     * @param in
     *            the {@link InputStream} to wrap
     * @param ifFails
     *            {@link IOException} handler
     */
    protected InputStreamIterator(final InputStream in, final Consumer<IOException> ifFails) {
        this.in = Objects.requireNonNull(in);
        this.ifFails = ifFails;
    }

    /**
     * @param in
     *            an {@link InputStream} will be created from the provided {@link Path}
     * @param ifFails
     *            {@link IOException} handler
     */
    public InputStreamIterator(final Path in, final Consumer<IOException> ifFails) {
        this(silenceException(in), ifFails);
    }

    /**
     * @param in
     *            an {@link InputStream} will be created from the provided {@link URL}
     * @param ifFails
     *            {@link IOException} handler
     */
    public InputStreamIterator(final URL in, final Consumer<IOException> ifFails) {
        this(silenceException(in), ifFails);
    }

    /**
     * @param in
     *            an {@link InputStream} will be created from the provided {@link URL}
     * @param ifFails
     *            {@link IOException} handler
     */
    public InputStreamIterator(final File in, final Consumer<IOException> ifFails) {
        this(in.toPath(), ifFails);
    }

    private static InputStream silenceException(final Path p) {
        try {
            return Files.newInputStream(p);
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
    }

    private static InputStream silenceException(final URL in) {
        try {
            return in.openStream();
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
    }

    private void readNext() {
        if (!isClosed) {
            try {
                read = in.read(buffer);
                if (read < BUFFER_SIZE) {
                    isClosed = true;
                    in.close();
                }
            } catch (IOException e) {
                ifFails.accept(e);
            }
        } else {
            read = -1;
        }
        index = 0;
    }

    @Override
    public boolean hasNext() {
        if (index == read) {
            readNext();
        }
        return read != -1;
    }

    @Override
    public Byte next() {
        if (index < read) {
            return buffer[index++];
        }
        throw new NoSuchElementException();
    }

}
