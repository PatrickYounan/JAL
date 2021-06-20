package jal.search;

/**
 * @author Patrick
 */
public final class ExponentialSearch {

    private ExponentialSearch() { }

    public static int search(int[] array, int value) {
        if (array[0] == value) return 0;
        int size = array.length;

        int index = 1;
        while(index < size && array[index] <= value)
            index *= 2;
        return BinarySearch.search(array, index / 2, Math.min(index, size - 1), value);
    }

}
