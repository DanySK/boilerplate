/*******************************************************************************
 * Copyright (C) 2009, 2015, Danilo Pianini and contributors
 * listed in the project's build.gradle or pom.xml file.
 *
 * This file is distributed under the terms of the Apache License, version 2.0
 *******************************************************************************/
package org.danilopianini.lang;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Objects;

import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

/**
 * This class wraps {@link String} and provides faster equals() at the expense
 * of possible errors. Internally, it computes a high quality
 * non-cryptographic hash (currently using Murmur 3 128bit), so be aware that
 * collisions may happen.
 * 
 */
public class HashString implements Cloneable, Serializable, Comparable<CharSequence>, CharSequence {

    private static final Charset CHARSET = StandardCharsets.UTF_8;
    private static final byte ENCODING_BASE = 36;
    private static final HashFunction HASHF = Hashing.murmur3_128();
    private static final long serialVersionUID = 1L;
    private String base;
    private byte[] hash;
    private int hash32;
    private final String s;

    /**
     * Clones this object.
     * 
     * @param string
     *            the template for the clone
     */
    public HashString(final HashString string) {
        s = string.s;
        hash = string.hash;
        hash32 = string.hash32;
    }

    /**
     * @param string
     *            the String to wrap
     */
    @SuppressFBWarnings("NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE")
    public HashString(final String string) {
        s = Objects.requireNonNull(string);
    }

    @Override
    public char charAt(final int index) {
        return s.charAt(index);
    }

    @SuppressFBWarnings("CN_IDIOM_NO_SUPER_CALL")
    @Override
    public HashString clone() {
        /*
         * State cannot change, no need to deep copy anything.
         */
        return this;
    }

    @Override
    public int compareTo(final CharSequence o) {
        return s.compareTo(o.toString());
    }

    private void computeHashes() {
        final HashCode hashCode = HASHF.hashBytes(s.getBytes(CHARSET));
        hash32 = hashCode.asInt();
        hash = hashCode.asBytes();
    }

    /**
     * Overloaded method.
     * 
     * @param fs
     *            the FasterString to compare to
     * @return true if equals
     */
    public boolean equalTo(final HashString fs) {
        return hashCode() == fs.hashCode()
                && s.length() == fs.s.length()
                && Arrays.equals(hash, fs.hash);
    }

    @Override
    public boolean equals(final Object o) {
        return this == o || o instanceof HashString && equalTo((HashString) o);
    }

    @Override
    public int hashCode() {
        if (hash == null) {
            computeHashes();
        }
        return hash32;
    }

    /**
     * @return A Base64 encoded version of the hash
     */
    public String hashToString() {
        if (base == null) {
            /*
             * If hash32 is negative, it is necessary to sum 1. This is because
             * -Integer.MIN_VALUE is equal to Integer.MIN_VALUE.
             */
            final int h32 = hashCode() > 0 ? hash32 : -(hash32 + 1);
            base = Integer.toString(h32, ENCODING_BASE);
        }
        return base;
    }

    @Override
    public int length() {
        return s.length();
    }

    @Override
    public CharSequence subSequence(final int start, final int end) {
        return s.subSequence(start, end);
    }

    @Override
    public String toString() {
        return s;
    }

}
