import org.example.task3.CalculateFunctionService;
import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class TestForTask3 {


    @Test
    public void testCreateTable() {
        double a = 0.1;
        double b = 0.2;
        double h = 0.01;

        LinkedHashMap<Double, Double> result = CalculateFunctionService.createTable(a, b, h);

        assertFalse(result.isEmpty());

        double x = a;
        for (Double key : result.keySet()) {
            assertEquals(x, key, 1e-10);
            x += h;
        }

        for (Double key : result.keySet()) {
            double expectedY = Math.tan(key);
            double actualY = result.get(key);
            assertEquals(expectedY, actualY, 1e-10);
        }
    }
}


