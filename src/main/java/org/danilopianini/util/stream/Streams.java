package org.danilopianini.util.stream;

import static java.util.stream.Stream.of;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Path;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.danilopianini.util.InputStreamIterator;

import static java.util.stream.Stream.concat;

/**
 * Complementary utilities for the Java 8 Stream library.
 */
public final class Streams {

    private Streams() {
    }

    /**
     * @param in
     *            input resource
     * @param onFailure
     *            executed in case of {@link IOException}
     * @return a Stream reading through the bytes of the file
     */
    public static Stream<Byte> fileToByteStream(final File in, final Consumer<IOException> onFailure) {
        return iteratorToStream(new InputStreamIterator(in, onFailure));
    }

    /**
     * @param in
     *            input resource
     * @param onFailure
     *            executed in case of {@link IOException}
     * @return a Stream reading through the bytes of the file
     */
    public static Stream<Byte> fileToByteStream(final Path in, final Consumer<IOException> onFailure) {
        return iteratorToStream(new InputStreamIterator(in, onFailure));
    }

    /**
     * @param in
     *            input resource
     * @param onFailure
     *            executed in case of {@link IOException}
     * @return a Stream reading through the bytes of the file
     */
    public static Stream<Byte> fileToByteStream(final URL in, final Consumer<IOException> onFailure) {
        return iteratorToStream(new InputStreamIterator(in, onFailure));
    }

    /**
     * Flattens a recursive, tree-like, non circular data structure into a
     * {@link Stream}.
     * 
     * @param target
     *            the root element of the structure
     * @param extractor
     *            the function that maps a node of the structure to a stream of
     *            its children
     * @param <E>
     *            the type of object
     * @return a {@link Stream} walking through the data structure
     */
    public static <E> Stream<E> flatten(
            final E target,
            final Function<? super E, ? extends Stream<? extends E>> extractor) {
        return concat(of(target), extractor.apply(target).flatMap(el -> flatten(el, extractor)));
    }

    /**
     * @param in
     *            the input {@link Iterator}
     * @param <T>
     *            iterator type
     * @return a Stream wrapper onto it
     */
    public static <T> Stream<T> iteratorToStream(final Iterator<T> in) {
        return StreamSupport.stream(Spliterators.spliteratorUnknownSize(in, Spliterator.ORDERED), false);
    }

}
