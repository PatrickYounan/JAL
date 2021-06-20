package jal.search;

/**
 * @author Patrick
 */
public final class InterpolationSearch {

    private InterpolationSearch() { }

    public static int search(int[] array, int value) {
        return search(array, 0, array.length - 1, value);
    }

    public static int search(int[] array, int low, int high, int value) {
        int position;
        if (low <= high && value >= array[low] && value <= array[high]) {
            position = low + (((high - low) / (array[high] - array[low])) * (value - array[low]));

            if (array[position] == value)
                return position;
            if (array[position] < value)
                return search(array, position + 1, high, value);
            if (array[position] > value)
                return search(array, low, position - 1, value);
        }
        return -1;
    }

}
