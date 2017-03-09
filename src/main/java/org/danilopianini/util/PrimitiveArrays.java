package org.danilopianini.util;

/**
 * Static utilities for dealing with primitive arrays.
 */
public final class PrimitiveArrays {

    private PrimitiveArrays() {
    }

    /**
     * Copies the input array into a new array, casting the type if necessary.
     * 
     * @param in
     *            the input array
     * @return a new array with the same contents, possibly cast (possibly with
     *         precision loss, depending on types)
     */
    /**
     * Copies the input array into a new array, casting the type if necessary.
     * 
     * @param in
     *            the input array
     * @return a new array with the same contents, possibly cast (possibly with
     *         precision loss, depending on types)
     */
    public static byte[] toByteArray(final short[] in) {
        final byte[] out = new byte[in.length];
        for (int i = 0; i < in.length; i++) {
            out[i] = (byte) in[i];
        }
        return out;
    }

    /**
     * Copies the input array into a new array, casting the type if necessary.
     * 
     * @param in
     *            the input array
     * @return a new array with the same contents, possibly cast (possibly with
     *         precision loss, depending on types)
     */
    public static byte[] toByteArray(final char[] in) {
        final byte[] out = new byte[in.length];
        for (int i = 0; i < in.length; i++) {
            out[i] = (byte) Character.getNumericValue(in[i]);
        }
        return out;
    }

    /**
     * Copies the input array into a new array, casting the type if necessary.
     * 
     * @param in
     *            the input array
     * @return a new array with the same contents, possibly cast (possibly with
     *         precision loss, depending on types)
     */
    public static byte[] toByteArray(final int[] in) {
        final byte[] out = new byte[in.length];
        for (int i = 0; i < in.length; i++) {
            out[i] = (byte) in[i];
        }
        return out;
    }

    /**
     * Copies the input array into a new array, casting the type if necessary.
     * 
     * @param in
     *            the input array
     * @return a new array with the same contents, possibly cast (possibly with
     *         precision loss, depending on types)
     */
    public static byte[] toByteArray(final long[] in) {
        final byte[] out = new byte[in.length];
        for (int i = 0; i < in.length; i++) {
            out[i] = (byte) in[i];
        }
        return out;
    }

    /**
     * Copies the input array into a new array, casting the type if necessary.
     * 
     * @param in
     *            the input array
     * @return a new array with the same contents, possibly cast (possibly with
     *         precision loss, depending on types)
     */
    public static byte[] toByteArray(final float[] in) {
        final byte[] out = new byte[in.length];
        for (int i = 0; i < in.length; i++) {
            out[i] = (byte) in[i];
        }
        return out;
    }

    /**
     * Copies the input array into a new array, casting the type if necessary.
     * 
     * @param in
     *            the input array
     * @return a new array with the same contents, possibly cast (possibly with
     *         precision loss, depending on types)
     */
    public static byte[] toByteArray(final double[] in) {
        final byte[] out = new byte[in.length];
        for (int i = 0; i < in.length; i++) {
            out[i] = (byte) in[i];
        }
        return out;
    }

    /**
     * Copies the input array into a new array, casting the type if necessary.
     * 
     * @param in
     *            the input array
     * @return a new array with the same contents, possibly cast (possibly with
     *         precision loss, depending on types)
     */
    public static byte[] toByteArray(final boolean[] in) {
        final byte[] out = new byte[in.length];
        for (int i = 0; i < in.length; i++) {
            out[i] = (byte) (in[i] ? 1 : 0);
        }
        return out;
    }

    /**
     * Copies the input array into a new array, casting the type if necessary.
     * 
     * @param in
     *            the input array
     * @return a new array with the same contents, possibly cast (possibly with
     *         precision loss, depending on types)
     */
    public static byte[] toByteArray(final Number[] in) {
        final byte[] out = new byte[in.length];
        for (int i = 0; i < in.length; i++) {
            out[i] = in[i].byteValue();
        }
        return out;
    }

    /**
     * Copies the input array into a new array, casting the type if necessary.
     * 
     * @param in
     *            the input array
     * @return a new array with the same contents, possibly cast (possibly with
     *         precision loss, depending on types)
     */
    public static short[] toShortArray(final byte[] in) {
        final short[] out = new short[in.length];
        System.arraycopy(in, 0, out, 0, in.length);
        return out;
    }

    /**
     * Copies the input array into a new array, casting the type if necessary.
     * 
     * @param in
     *            the input array
     * @return a new array with the same contents, possibly cast (possibly with
     *         precision loss, depending on types)
     */
    public static short[] toShortArray(final char[] in) {
        final short[] out = new short[in.length];
        for (int i = 0; i < in.length; i++) {
            out[i] = (short) Character.getNumericValue(in[i]);
        }
        return out;
    }

    /**
     * Copies the input array into a new array, casting the type if necessary.
     * 
     * @param in
     *            the input array
     * @return a new array with the same contents, possibly cast (possibly with
     *         precision loss, depending on types)
     */
    public static short[] toShortArray(final int[] in) {
        final short[] out = new short[in.length];
        for (int i = 0; i < in.length; i++) {
            out[i] = (short) in[i];
        }
        return out;
    }

    /**
     * Copies the input array into a new array, casting the type if necessary.
     * 
     * @param in
     *            the input array
     * @return a new array with the same contents, possibly cast (possibly with
     *         precision loss, depending on types)
     */
    public static short[] toShortArray(final long[] in) {
        final short[] out = new short[in.length];
        for (int i = 0; i < in.length; i++) {
            out[i] = (short) in[i];
        }
        return out;
    }

    /**
     * Copies the input array into a new array, casting the type if necessary.
     * 
     * @param in
     *            the input array
     * @return a new array with the same contents, possibly cast (possibly with
     *         precision loss, depending on types)
     */
    public static short[] toShortArray(final float[] in) {
        final short[] out = new short[in.length];
        for (int i = 0; i < in.length; i++) {
            out[i] = (short) in[i];
        }
        return out;
    }

    /**
     * Copies the input array into a new array, casting the type if necessary.
     * 
     * @param in
     *            the input array
     * @return a new array with the same contents, possibly cast (possibly with
     *         precision loss, depending on types)
     */
    public static short[] toShortArray(final double[] in) {
        final short[] out = new short[in.length];
        for (int i = 0; i < in.length; i++) {
            out[i] = (short) in[i];
        }
        return out;
    }

    /**
     * Copies the input array into a new array, casting the type if necessary.
     * 
     * @param in
     *            the input array
     * @return a new array with the same contents, possibly cast (possibly with
     *         precision loss, depending on types)
     */
    public static short[] toShortArray(final boolean[] in) {
        final short[] out = new short[in.length];
        for (int i = 0; i < in.length; i++) {
            out[i] = (short) (in[i] ? 1 : 0);
        }
        return out;
    }

    /**
     * Copies the input array into a new array, casting the type if necessary.
     * 
     * @param in
     *            the input array
     * @return a new array with the same contents, possibly cast (possibly with
     *         precision loss, depending on types)
     */
    public static short[] toShortArray(final Number[] in) {
        final short[] out = new short[in.length];
        for (int i = 0; i < in.length; i++) {
            out[i] = in[i].shortValue();
        }
        return out;
    }

    /**
     * Copies the input array into a new array, casting the type if necessary.
     * 
     * @param in
     *            the input array
     * @return a new array with the same contents, possibly cast (possibly with
     *         precision loss, depending on types)
     */
    public static char[] toCharArray(final byte[] in) {
        final char[] out = new char[in.length];
        for (int i = 0; i < in.length; i++) {
            out[i] = (char) in[i];
        }
        return out;
    }

    /**
     * Copies the input array into a new array, casting the type if necessary.
     * 
     * @param in
     *            the input array
     * @return a new array with the same contents, possibly cast (possibly with
     *         precision loss, depending on types)
     */
    public static char[] toCharArray(final short[] in) {
        final char[] out = new char[in.length];
        for (int i = 0; i < in.length; i++) {
            out[i] = (char) in[i];
        }
        return out;
    }

    /**
     * Copies the input array into a new array, casting the type if necessary.
     * 
     * @param in
     *            the input array
     * @return a new array with the same contents, possibly cast (possibly with
     *         precision loss, depending on types)
     */
    public static char[] toCharArray(final int[] in) {
        final char[] out = new char[in.length];
        for (int i = 0; i < in.length; i++) {
            out[i] = (char) in[i];
        }
        return out;
    }

    /**
     * Copies the input array into a new array, casting the type if necessary.
     * 
     * @param in
     *            the input array
     * @return a new array with the same contents, possibly cast (possibly with
     *         precision loss, depending on types)
     */
    public static char[] toCharArray(final long[] in) {
        final char[] out = new char[in.length];
        for (int i = 0; i < in.length; i++) {
            out[i] = (char) in[i];
        }
        return out;
    }

    /**
     * Copies the input array into a new array, casting the type if necessary.
     * 
     * @param in
     *            the input array
     * @return a new array with the same contents, possibly cast (possibly with
     *         precision loss, depending on types)
     */
    public static char[] toCharArray(final float[] in) {
        final char[] out = new char[in.length];
        for (int i = 0; i < in.length; i++) {
            out[i] = (char) in[i];
        }
        return out;
    }

    /**
     * Copies the input array into a new array, casting the type if necessary.
     * 
     * @param in
     *            the input array
     * @return a new array with the same contents, possibly cast (possibly with
     *         precision loss, depending on types)
     */
    public static char[] toCharArray(final double[] in) {
        final char[] out = new char[in.length];
        for (int i = 0; i < in.length; i++) {
            out[i] = (char) in[i];
        }
        return out;
    }

    /**
     * Copies the input array into a new array, casting the type if necessary.
     * 
     * @param in
     *            the input array
     * @return a new array with the same contents, possibly cast (possibly with
     *         precision loss, depending on types)
     */
    public static char[] toCharArray(final boolean[] in) {
        final char[] out = new char[in.length];
        for (int i = 0; i < in.length; i++) {
            out[i] = (char) (in[i] ? 1 : 0);
        }
        return out;
    }

    /**
     * Copies the input array into a new array, casting the type if necessary.
     * 
     * @param in
     *            the input array
     * @return a new array with the same contents, possibly cast (possibly with
     *         precision loss, depending on types)
     */
    public static char[] toCharArray(final Number[] in) {
        final char[] out = new char[in.length];
        for (int i = 0; i < in.length; i++) {
            out[i] = (char) in[i].intValue();
        }
        return out;
    }

    /**
     * Copies the input array into a new array, casting the type if necessary.
     * 
     * @param in
     *            the input array
     * @return a new array with the same contents, possibly cast (possibly with
     *         precision loss, depending on types)
     */
    public static int[] toIntArray(final byte[] in) {
        final int[] out = new int[in.length];
        System.arraycopy(in, 0, out, 0, in.length);
        return out;
    }

    /**
     * Copies the input array into a new array, casting the type if necessary.
     * 
     * @param in
     *            the input array
     * @return a new array with the same contents, possibly cast (possibly with
     *         precision loss, depending on types)
     */
    public static int[] toIntArray(final short[] in) {
        final int[] out = new int[in.length];
        System.arraycopy(in, 0, out, 0, in.length);
        return out;
    }

    /**
     * Copies the input array into a new array, casting the type if necessary.
     * 
     * @param in
     *            the input array
     * @return a new array with the same contents, possibly cast (possibly with
     *         precision loss, depending on types)
     */
    public static int[] toIntArray(final char[] in) {
        final int[] out = new int[in.length];
        for (int i = 0; i < in.length; i++) {
            out[i] = Character.getNumericValue(in[i]);
        }
        return out;
    }

    /**
     * Copies the input array into a new array, casting the type if necessary.
     * 
     * @param in
     *            the input array
     * @return a new array with the same contents, possibly cast (possibly with
     *         precision loss, depending on types)
     */
    public static int[] toIntArray(final long[] in) {
        final int[] out = new int[in.length];
        for (int i = 0; i < in.length; i++) {
            out[i] = (int) in[i];
        }
        return out;
    }

    /**
     * Copies the input array into a new array, casting the type if necessary.
     * 
     * @param in
     *            the input array
     * @return a new array with the same contents, possibly cast (possibly with
     *         precision loss, depending on types)
     */
    public static int[] toIntArray(final float[] in) {
        final int[] out = new int[in.length];
        for (int i = 0; i < in.length; i++) {
            out[i] = (int) in[i];
        }
        return out;
    }

    /**
     * Copies the input array into a new array, casting the type if necessary.
     * 
     * @param in
     *            the input array
     * @return a new array with the same contents, possibly cast (possibly with
     *         precision loss, depending on types)
     */
    public static int[] toIntArray(final double[] in) {
        final int[] out = new int[in.length];
        for (int i = 0; i < in.length; i++) {
            out[i] = (int) in[i];
        }
        return out;
    }

    /**
     * Copies the input array into a new array, casting the type if necessary.
     * 
     * @param in
     *            the input array
     * @return a new array with the same contents, possibly cast (possibly with
     *         precision loss, depending on types)
     */
    public static int[] toIntArray(final boolean[] in) {
        final int[] out = new int[in.length];
        for (int i = 0; i < in.length; i++) {
            out[i] = in[i] ? 1 : 0;
        }
        return out;
    }

    /**
     * Copies the input array into a new array, casting the type if necessary.
     * 
     * @param in
     *            the input array
     * @return a new array with the same contents, possibly cast (possibly with
     *         precision loss, depending on types)
     */
    public static int[] toIntArray(final Number[] in) {
        final int[] out = new int[in.length];
        for (int i = 0; i < in.length; i++) {
            out[i] = in[i].intValue();
        }
        return out;
    }

    /**
     * Copies the input array into a new array, casting the type if necessary.
     * 
     * @param in
     *            the input array
     * @return a new array with the same contents, possibly cast (possibly with
     *         precision loss, depending on types)
     */
    public static long[] toLongArray(final byte[] in) {
        final long[] out = new long[in.length];
        System.arraycopy(in, 0, out, 0, in.length);
        return out;
    }

    /**
     * Copies the input array into a new array, casting the type if necessary.
     * 
     * @param in
     *            the input array
     * @return a new array with the same contents, possibly cast (possibly with
     *         precision loss, depending on types)
     */
    public static long[] toLongArray(final short[] in) {
        final long[] out = new long[in.length];
        System.arraycopy(in, 0, out, 0, in.length);
        return out;
    }

    /**
     * Copies the input array into a new array, casting the type if necessary.
     * 
     * @param in
     *            the input array
     * @return a new array with the same contents, possibly cast (possibly with
     *         precision loss, depending on types)
     */
    public static long[] toLongArray(final char[] in) {
        final long[] out = new long[in.length];
        for (int i = 0; i < in.length; i++) {
            out[i] = Character.getNumericValue(in[i]);
        }
        return out;
    }

    /**
     * Copies the input array into a new array, casting the type if necessary.
     * 
     * @param in
     *            the input array
     * @return a new array with the same contents, possibly cast (possibly with
     *         precision loss, depending on types)
     */
    public static long[] toLongArray(final int[] in) {
        final long[] out = new long[in.length];
        System.arraycopy(in, 0, out, 0, in.length);
        return out;
    }

    /**
     * Copies the input array into a new array, casting the type if necessary.
     * 
     * @param in
     *            the input array
     * @return a new array with the same contents, possibly cast (possibly with
     *         precision loss, depending on types)
     */
    public static long[] toLongArray(final float[] in) {
        final long[] out = new long[in.length];
        for (int i = 0; i < in.length; i++) {
            out[i] = (long) in[i];
        }
        return out;
    }

    /**
     * Copies the input array into a new array, casting the type if necessary.
     * 
     * @param in
     *            the input array
     * @return a new array with the same contents, possibly cast (possibly with
     *         precision loss, depending on types)
     */
    public static long[] toLongArray(final double[] in) {
        final long[] out = new long[in.length];
        for (int i = 0; i < in.length; i++) {
            out[i] = (long) in[i];
        }
        return out;
    }

    /**
     * Copies the input array into a new array, casting the type if necessary.
     * 
     * @param in
     *            the input array
     * @return a new array with the same contents, possibly cast (possibly with
     *         precision loss, depending on types)
     */
    public static long[] toLongArray(final boolean[] in) {
        final long[] out = new long[in.length];
        for (int i = 0; i < in.length; i++) {
            out[i] = in[i] ? 1 : 0;
        }
        return out;
    }

    /**
     * Copies the input array into a new array, casting the type if necessary.
     * 
     * @param in
     *            the input array
     * @return a new array with the same contents, possibly cast (possibly with
     *         precision loss, depending on types)
     */
    public static long[] toLongArray(final Number[] in) {
        final long[] out = new long[in.length];
        for (int i = 0; i < in.length; i++) {
            out[i] = in[i].longValue();
        }
        return out;
    }

    /**
     * Copies the input array into a new array, casting the type if necessary.
     * 
     * @param in
     *            the input array
     * @return a new array with the same contents, possibly cast (possibly with
     *         precision loss, depending on types)
     */
    public static float[] toFloatArray(final byte[] in) {
        final float[] out = new float[in.length];
        System.arraycopy(in, 0, out, 0, in.length);
        return out;
    }

    /**
     * Copies the input array into a new array, casting the type if necessary.
     * 
     * @param in
     *            the input array
     * @return a new array with the same contents, possibly cast (possibly with
     *         precision loss, depending on types)
     */
    public static float[] toFloatArray(final short[] in) {
        final float[] out = new float[in.length];
        System.arraycopy(in, 0, out, 0, in.length);
        return out;
    }

    /**
     * Copies the input array into a new array, casting the type if necessary.
     * 
     * @param in
     *            the input array
     * @return a new array with the same contents, possibly cast (possibly with
     *         precision loss, depending on types)
     */
    public static float[] toFloatArray(final char[] in) {
        final float[] out = new float[in.length];
        for (int i = 0; i < in.length; i++) {
            out[i] = Character.getNumericValue(in[i]);
        }
        return out;
    }

    /**
     * Copies the input array into a new array, casting the type if necessary.
     * 
     * @param in
     *            the input array
     * @return a new array with the same contents, possibly cast (possibly with
     *         precision loss, depending on types)
     */
    public static float[] toFloatArray(final int[] in) {
        final float[] out = new float[in.length];
        System.arraycopy(in, 0, out, 0, in.length);
        return out;
    }

    /**
     * Copies the input array into a new array, casting the type if necessary.
     * 
     * @param in
     *            the input array
     * @return a new array with the same contents, possibly cast (possibly with
     *         precision loss, depending on types)
     */
    public static float[] toFloatArray(final long[] in) {
        final float[] out = new float[in.length];
        System.arraycopy(in, 0, out, 0, in.length);
        return out;
    }

    /**
     * Copies the input array into a new array, casting the type if necessary.
     * 
     * @param in
     *            the input array
     * @return a new array with the same contents, possibly cast (possibly with
     *         precision loss, depending on types)
     */
    public static float[] toFloatArray(final double[] in) {
        final float[] out = new float[in.length];
        for (int i = 0; i < in.length; i++) {
            out[i] = (float) in[i];
        }
        return out;
    }

    /**
     * Copies the input array into a new array, casting the type if necessary.
     * 
     * @param in
     *            the input array
     * @return a new array with the same contents, possibly cast (possibly with
     *         precision loss, depending on types)
     */
    public static float[] toFloatArray(final boolean[] in) {
        final float[] out = new float[in.length];
        for (int i = 0; i < in.length; i++) {
            out[i] = in[i] ? 1 : 0;
        }
        return out;
    }

    /**
     * Copies the input array into a new array, casting the type if necessary.
     * 
     * @param in
     *            the input array
     * @return a new array with the same contents, possibly cast (possibly with
     *         precision loss, depending on types)
     */
    public static float[] toFloatArray(final Number[] in) {
        final float[] out = new float[in.length];
        for (int i = 0; i < in.length; i++) {
            out[i] = in[i].floatValue();
        }
        return out;
    }

    /**
     * Copies the input array into a new array, casting the type if necessary.
     * 
     * @param in
     *            the input array
     * @return a new array with the same contents, possibly cast (possibly with
     *         precision loss, depending on types)
     */
    public static double[] toDoubleArray(final byte[] in) {
        final double[] out = new double[in.length];
        System.arraycopy(in, 0, out, 0, in.length);
        return out;
    }

    /**
     * Copies the input array into a new array, casting the type if necessary.
     * 
     * @param in
     *            the input array
     * @return a new array with the same contents, possibly cast (possibly with
     *         precision loss, depending on types)
     */
    public static double[] toDoubleArray(final short[] in) {
        final double[] out = new double[in.length];
        System.arraycopy(in, 0, out, 0, in.length);
        return out;
    }

    /**
     * Copies the input array into a new array, casting the type if necessary.
     * 
     * @param in
     *            the input array
     * @return a new array with the same contents, possibly cast (possibly with
     *         precision loss, depending on types)
     */
    public static double[] toDoubleArray(final char[] in) {
        final double[] out = new double[in.length];
        for (int i = 0; i < in.length; i++) {
            out[i] = Character.getNumericValue(in[i]);
        }
        return out;
    }

    /**
     * Copies the input array into a new array, casting the type if necessary.
     * 
     * @param in
     *            the input array
     * @return a new array with the same contents, possibly cast (possibly with
     *         precision loss, depending on types)
     */
    public static double[] toDoubleArray(final int[] in) {
        final double[] out = new double[in.length];
        System.arraycopy(in, 0, out, 0, in.length);
        return out;
    }

    /**
     * Copies the input array into a new array, casting the type if necessary.
     * 
     * @param in
     *            the input array
     * @return a new array with the same contents, possibly cast (possibly with
     *         precision loss, depending on types)
     */
    public static double[] toDoubleArray(final long[] in) {
        final double[] out = new double[in.length];
        System.arraycopy(in, 0, out, 0, in.length);
        return out;
    }

    /**
     * Copies the input array into a new array, casting the type if necessary.
     * 
     * @param in
     *            the input array
     * @return a new array with the same contents, possibly cast (possibly with
     *         precision loss, depending on types)
     */
    public static double[] toDoubleArray(final float[] in) {
        final double[] out = new double[in.length];
        System.arraycopy(in, 0, out, 0, in.length);
        return out;
    }

    /**
     * Copies the input array into a new array, casting the type if necessary.
     * 
     * @param in
     *            the input array
     * @return a new array with the same contents, possibly cast (possibly with
     *         precision loss, depending on types)
     */
    public static double[] toDoubleArray(final boolean[] in) {
        final double[] out = new double[in.length];
        for (int i = 0; i < in.length; i++) {
            out[i] = in[i] ? 1 : 0;
        }
        return out;
    }

    /**
     * Copies the input array into a new array, casting the type if necessary.
     * 
     * @param in
     *            the input array
     * @return a new array with the same contents, possibly cast (possibly with
     *         precision loss, depending on types)
     */
    public static double[] toDoubleArray(final Number[] in) {
        final double[] out = new double[in.length];
        for (int i = 0; i < in.length; i++) {
            out[i] = in[i].doubleValue();
        }
        return out;
    }

    /**
     * Copies the input array into a new array, casting the type if necessary.
     * 
     * @param in
     *            the input array
     * @return a new array with the same contents, possibly cast (possibly with
     *         precision loss, depending on types)
     */
    public static boolean[] toBooleanArray(final byte[] in) {
        final boolean[] out = new boolean[in.length];
        for (int i = 0; i < in.length; i++) {
            out[i] = in[i] != 0;
        }
        return out;
    }

    /**
     * Copies the input array into a new array, casting the type if necessary.
     * 
     * @param in
     *            the input array
     * @return a new array with the same contents, possibly cast (possibly with
     *         precision loss, depending on types)
     */
    public static boolean[] toBooleanArray(final short[] in) {
        final boolean[] out = new boolean[in.length];
        for (int i = 0; i < in.length; i++) {
            out[i] = in[i] != 0;
        }
        return out;
    }

    /**
     * Copies the input array into a new array, casting the type if necessary.
     * 
     * @param in
     *            the input array
     * @return a new array with the same contents, possibly cast (possibly with
     *         precision loss, depending on types)
     */
    public static boolean[] toBooleanArray(final char[] in) {
        final boolean[] out = new boolean[in.length];
        for (int i = 0; i < in.length; i++) {
            out[i] = Character.getNumericValue(in[i]) != 0;
        }
        return out;
    }

    /**
     * Copies the input array into a new array, casting the type if necessary.
     * 
     * @param in
     *            the input array
     * @return a new array with the same contents, possibly cast (possibly with
     *         precision loss, depending on types)
     */
    public static boolean[] toBooleanArray(final int[] in) {
        final boolean[] out = new boolean[in.length];
        for (int i = 0; i < in.length; i++) {
            out[i] = in[i] != 0;
        }
        return out;
    }

    /**
     * Copies the input array into a new array, casting the type if necessary.
     * 
     * @param in
     *            the input array
     * @return a new array with the same contents, possibly cast (possibly with
     *         precision loss, depending on types)
     */
    public static boolean[] toBooleanArray(final long[] in) {
        final boolean[] out = new boolean[in.length];
        for (int i = 0; i < in.length; i++) {
            out[i] = in[i] != 0;
        }
        return out;
    }

    /**
     * Copies the input array into a new array, casting the type if necessary.
     * 
     * @param in
     *            the input array
     * @return a new array with the same contents, possibly cast (possibly with
     *         precision loss, depending on types)
     */
    public static boolean[] toBooleanArray(final float[] in) {
        final boolean[] out = new boolean[in.length];
        for (int i = 0; i < in.length; i++) {
            out[i] = in[i] != 0;
        }
        return out;
    }

    /**
     * Copies the input array into a new array, casting the type if necessary.
     * 
     * @param in
     *            the input array
     * @return a new array with the same contents, possibly cast (possibly with
     *         precision loss, depending on types)
     */
    public static boolean[] toBooleanArray(final double[] in) {
        final boolean[] out = new boolean[in.length];
        for (int i = 0; i < in.length; i++) {
            out[i] = in[i] != 0;
        }
        return out;
    }

    /**
     * Copies the input array into a new array, casting the type if necessary.
     * 
     * @param in
     *            the input array
     * @return a new array with the same contents, possibly cast (possibly with
     *         precision loss, depending on types)
     */
    public static boolean[] toBooleanArray(final Number[] in) {
        final boolean[] out = new boolean[in.length];
        for (int i = 0; i < in.length; i++) {
            out[i] = in[i].doubleValue() != 0;
        }
        return out;
    }

}
