package org.danilopianini.util.stream;

import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Stream;

import com.google.common.collect.MinMaxPriorityQueue;
import com.google.common.collect.Ordering;
import com.google.common.collect.Sets;

/**
 * A fast {@link Collector} that returns the desired number of the smallest
 * elements of a {@link Stream} into a Guava's {@link MinMaxPriorityQueue}.
 *
 * @param <T>
 */
public class SmallestN<T> implements Collector<T, MinMaxPriorityQueue<T>, MinMaxPriorityQueue<T>> {

    private static final Set<Characteristics> CHARACT = Collections.unmodifiableSet(Sets.newHashSet(Characteristics.IDENTITY_FINISH));
    private final int max;
    private final Comparator<T> comparator;

    /**
     * No comparator supplied: natural ordering is used.
     * 
     * @param maxElements
     *            the maximum number of desired elements
     */
    @SuppressWarnings("unchecked")
    public SmallestN(final int maxElements) {
        this(maxElements, (Comparator<T>) Ordering.natural());
    }

    /**
     * @param maxElements
     *            the maximum number of desired elements
     * @param comparator
     *            the comparator to be used
     */
    public SmallestN(final int maxElements, final Comparator<T> comparator) {
        max = maxElements;
        this.comparator = comparator;
    }

    @Override
    public Supplier<MinMaxPriorityQueue<T>> supplier() {
        return () -> MinMaxPriorityQueue
                .orderedBy(comparator)
                .maximumSize(max).create();
    }

    @Override
    public BiConsumer<MinMaxPriorityQueue<T>, T> accumulator() {
        return (queue, e) -> queue.add(e);
    }

    @Override
    public BinaryOperator<MinMaxPriorityQueue<T>> combiner() {
        return (a, b) -> {
            a.addAll(b);
            return a;
        };
    }

    @Override
    public Function<MinMaxPriorityQueue<T>, MinMaxPriorityQueue<T>> finisher() {
        return Function.identity();
    }

    @Override
    public Set<java.util.stream.Collector.Characteristics> characteristics() {
        return CHARACT;
    }

}
