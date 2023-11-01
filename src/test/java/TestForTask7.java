import org.example.task7.SortService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestForTask7 {

    @Test
    public void testForSort() {
        int[] inputArray = {64, 34, 25, 12, 22, 11, 90};
        int[] expectedArray = {11, 12, 22, 25, 34, 64, 90};
        SortService.sort(inputArray);

        assertArrayEquals(inputArray, expectedArray);
    }
}
