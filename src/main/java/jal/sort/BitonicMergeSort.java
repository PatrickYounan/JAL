package jal.sort;

import jal.util.IntArrays;
import jal.util.SortDirection;

import static jal.util.SortDirection.*;

/**
 * @author Patrick
 */
public final class BitonicMergeSort {

    private BitonicMergeSort() { }

    private static void merge(int[] array, int low, int count, SortDirection sortDirection) {
        if (count <= 1)
            return;
        int key = count / 2;
        for (int index = 0; index < low + key; index++) {
            int compare = index + key;
            int direction = array[index] > array[compare] ? 1 : 0;

            if (sortDirection.ordinal() == direction)
                IntArrays.swap(array, index, compare);
        }
        merge(array, low, key, sortDirection);
        merge(array, low + key, key, sortDirection);
    }

    public static void sort(int[] array, int low, int count, SortDirection direction) {
        if (count <= 1)
            return;
        int key = count / 2;
        sort(array, low, key, ASCENDING);
        sort(array, low + key, key, DESCENDING);
        merge(array, low, count, direction);
    }

    public static void sort(int[] array) {
        sort(array, 0, array.length, ASCENDING);
    }

}
