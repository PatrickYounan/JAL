package sort;

import jal.sort.StraightInsertionSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @author Patrick
 */
public final class StraightInsertionSortTest {

    @Test
    public void testStraightInsertionSort() {
        int[] unsorted = new int[]{238, 2, 1, 90, 3, 56};
        int[] sorted = new int[]{1, 2, 3, 56, 90, 238};
        StraightInsertionSort.sort(unsorted);
        System.out.println(Arrays.toString(unsorted));
        Assertions.assertArrayEquals(unsorted, sorted);
    }
}
