import org.example.task1.CalculateService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestForTask1 {

    @Test
    public void test(){
        assertEquals(CalculateService.calculations(2,3),2.4932140506105163);
    }

}
