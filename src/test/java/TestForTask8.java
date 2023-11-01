import org.example.task8.InsertionPointsService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestForTask8 {

    @Test
    public void testInsertionPoints() {
        int[] a = {1, 3, 5, 7, 9};
        int[] b = {2, 4, 6, 8, 9, 10, 10};

        int[] c = {1, 3, 5, 7, 9};
        int[] d = {2, 4, 6, 8, 10, 12, 15};

        int[] insertionPoints = InsertionPointsService.findInsertionPoints(a, b);

        int[] insertionPointsSecond = InsertionPointsService.findInsertionPoints(c, d);

        assertArrayEquals(new int[]{1, 3, 5, 7, 8, 10, 11}, insertionPoints);
        assertArrayEquals(new int[]{1, 3, 5, 7, 9, 10, 11}, insertionPointsSecond);
    }

}
