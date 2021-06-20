package jal.search;

/**
 * @author Patrick
 */
public final class LinearSearch {

    private LinearSearch() { }

    public static <T> int search(T[] array, T key) {
        for (int index = 0; index < array.length; index++)
            if (array[index].equals(key)) return index;
        return -1;
    }

    public static int search(int[] array, int key) {
        for (int index = 0; index < array.length; index++)
            if (array[index] == key) return index;
        return -1;
    }

}
