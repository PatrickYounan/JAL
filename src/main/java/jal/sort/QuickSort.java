package jal.sort;

import static jal.util.IntArrays.swap;

/**
 * @author Patrick
 */
public final class QuickSort {

    private QuickSort() { }

    public static void sort(int[] array, int low, int high) {
        if (low >= high)
            return;
        int index = partition(array, low, high);
        sort(array, low, index - 1);
        sort(array, index + 1, high);
    }

    public static void sort(int[] array) {
        sort(array, 0, array.length - 1);
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int index = (low - 1);
        for (int point = low; point <= high - 1; point++) {
            if (array[point] < pivot) {
                index++;
                swap(array, index, point);
            }
        }
        swap(array, index + 1, high);
        return index + 1;
    }

}
