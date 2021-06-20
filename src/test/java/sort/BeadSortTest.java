package sort;

import jal.sort.BeadSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @author Patrick
 */
public final class BeadSortTest {

    @Test
    public void testBeadSort() {
        int[] unsorted = new int[]{238, 2, 1, 90, 3, 56};
        int[] sorted = new int[]{1, 2, 3, 56, 90, 238};
        BeadSort.sort(unsorted);
        System.out.println(Arrays.toString(unsorted));
        Assertions.assertArrayEquals(unsorted, sorted);
    }

}
