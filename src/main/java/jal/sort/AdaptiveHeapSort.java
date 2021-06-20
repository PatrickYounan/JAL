package jal.sort;

import jal.util.IntArrays;

/**
 * @author Patrick
 */
public final class AdaptiveHeapSort {

    private AdaptiveHeapSort() { }

    public static void sort(int[] array) {
        sort(array, array.length - 1);
    }

    public static void sort(int[] array, int length) {
        for (int i = length / 2; i >= 0; i--)
            heapify(array, i, length);
        for (int i = length; i >= 0; i--) {
            IntArrays.swap(array, 0, i);
            heapify(array, 0, i - 1);
        }
    }

    private static void heapify(int[] array, int start, int end) {
        int parent = start;
        int child = parent * 2 + 1;
        while (child <= end) {
            if (child + 1 <= end) {
                if (array[child + 1] > array[child]) child++;
            }
            if (array[parent] > array[child])
                return;
            if (array[parent] < array[child]) {
                IntArrays.swap(array, parent, child);
                parent = child;
                child *= 2 + 1;
            }
        }
    }

}
