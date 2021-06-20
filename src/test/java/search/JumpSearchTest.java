package search;

import jal.search.JumpSearch;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Patrick
 */
public final class JumpSearchTest {

    @Test
    public void testJumpSearch() {
        int[] array = new int[]{1, 2, 3, 56, 90, 238};
        int index = JumpSearch.search(array, 3);
        assertEquals(index, 2);
    }

}
