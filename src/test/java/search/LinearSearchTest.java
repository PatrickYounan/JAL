package search;

import jal.search.LinearSearch;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Patrick
 */
public final class LinearSearchTest {

    @Test
    public void testLinearSearch() {
        int[] array = new int[]{1, 2, 3, 56, 90, 238};
        int index = LinearSearch.search(array, 2);
        assertEquals(index, 1);
    }

}
