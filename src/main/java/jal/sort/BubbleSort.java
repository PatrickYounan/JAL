package jal.sort;

import jal.util.IntArrays;

/**
 * @author Patrick
 */
public final class BubbleSort {

    private BubbleSort() { }

    public static void sort(int[] array) {
        int size = array.length;
        for (int index = 0; index < size - 1; index++) {
            for (int newIndex = 0; newIndex < size - index - 1; newIndex++) {
                if (array[newIndex] > array[newIndex + 1]) {
                    IntArrays.swap(array, newIndex, newIndex + 1);
                }
            }
        }
    }

}
