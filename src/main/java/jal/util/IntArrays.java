package jal.util;

/**
 * @author Patrick
 */
public final class IntArrays {

    private IntArrays() {}

    public static void swap(int[] array, int start, int end) {
        int first = array[start];
        array[start] = array[end];
        array[end] = first;
    }

}
