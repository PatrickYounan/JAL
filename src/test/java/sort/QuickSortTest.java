package sort;

import jal.sort.QuickSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @author Patrick
 */
public final class QuickSortTest {

    @Test
    public void testQuickSort() {
        int[] unsorted = new int[]{238, 2, 1, 90, 3, 56};
        int[] sorted = new int[]{1, 2, 3, 56, 90, 238};
        QuickSort.sort(unsorted);
        System.out.println(Arrays.toString(unsorted));
        Assertions.assertArrayEquals(unsorted, sorted);
    }

}
