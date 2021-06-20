package search;

import jal.search.BinarySearch;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Patrick
 */
public final class BinarySearchTest {

    @Test
    public void testBinarySearch() {
        int[] array = new int[]{1, 2, 3, 56, 90, 238};
        int index = BinarySearch.search(array, 2);
        assertEquals(index, 1);
    }

}
