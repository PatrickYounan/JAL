package sort;

import jal.sort.BitonicMergeSort;
import jal.util.SortDirection;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @author Patrick
 */
public final class BitonicMergeSortTest {

    @Test
    public void testBitonicMergeSort() {
        int[] unsorted = new int[]{238, 2, 1, 90, 3, 56};
        int[] sorted = new int[]{1, 2, 3, 56, 90, 238};
        BitonicMergeSort.sort(unsorted, 0, unsorted.length, SortDirection.ASCENDING);
        System.out.println(Arrays.toString(unsorted));
        Assertions.assertArrayEquals(unsorted, sorted);
    }

}
