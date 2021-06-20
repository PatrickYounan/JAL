package sort;

import jal.sort.AdaptiveHeapSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @author Patrick
 */
public final class AdaptiveHeapSortTest {

    @Test
    public void testAdaptiveHeapSort() {
        int[] unsorted = new int[]{238, 2, 1, 90, 3, 56};
        int[] sorted = new int[]{1, 2, 3, 56, 90, 238};
        AdaptiveHeapSort.sort(unsorted);
        System.out.println(Arrays.toString(unsorted));
        Assertions.assertArrayEquals(unsorted, sorted);
    }

}
