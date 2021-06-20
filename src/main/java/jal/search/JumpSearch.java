package jal.search;

/**
 * @author Patrick
 */
public final class JumpSearch {

    private JumpSearch() { }

    public static int search(int[] array, int key) {
        int size = array.length;
        int step = (int) Math.floor(Math.sqrt(size));
        int previous = 0;

        while (array[Math.min(step, size) - 1] < key) {
            previous = step;
            step += Math.floor(Math.sqrt(size));
            if (previous >= size)
                return size;
        }
        while (array[previous] < key) {
            if (previous++ == Math.min(step, size))
                return -1;
        }
        return array[previous] == key ? previous : -1;
    }

}
