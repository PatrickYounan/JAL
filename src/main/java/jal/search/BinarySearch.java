package jal.search;

/**
 * @author Patrick
 */
public final class BinarySearch {

    private BinarySearch() { }

    public static int search(int[] array, int start, int end, int value) {
        int right = end;
        int left = start;

        while (left <= right) {
            int mid = left + (right - 1) / 2;
            if (array[mid] == value)
                return mid;

            if (array[mid] < value) {
                left = mid + 1;
            } else right = mid - 1;
        }

        return -1;
    }

    public static int search(int[] array, int value) {
        return search(array, 0, array.length - 1, value);
    }

}
