import org.example.task6.SquareMatrixService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestForTask6 {

    @Test
    public void testMatrix() {
        double[] inputArray = new double[]{2.0, 1.0, 3.0, 4.0};

        double[][] expectedMatrix = {
                {2.0, 1.0, 3.0, 4.0},
                {1.0, 3.0, 4.0, 2.0},
                {3.0, 4.0, 2.0, 1.0},
                {4.0, 2.0, 1.0, 3.0},

        };

        double[][] resultMatrix = SquareMatrixService.createMatrix(inputArray);

        assertArrayEquals(resultMatrix,expectedMatrix);

    }

}
