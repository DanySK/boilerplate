package org.danilopianini.util.stream;

import static java.util.stream.Stream.of;

import java.util.function.Function;
import java.util.stream.Stream;

import static java.util.stream.Stream.concat;

/**
 * Complementary utilities for the Java 8 Stream library.
 */
public final class Streams {

    private Streams() {
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

}
