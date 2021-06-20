package jal.sort;

/**
 * @author Patrick
 */
public final class StraightInsertionSort {

    private StraightInsertionSort() { }

    public static void sort(int[] array) {
        sort(array, 1, array.length);
    }

    public static void sort(int[] array, int min, int max) {
        for (int index = min; index < max; index++) {
            int start = array[index];
            int last = index;
            while (last > 0 && array[last - 1] > start) {
                array[last] = array[last - 1];
                last = last - 1;
            }
            array[last] = start;
        }
    }
}
