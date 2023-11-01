import org.example.task2.ShadedAreaService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestForTask2 {

    @Test
    public void test(){
        assertTrue(ShadedAreaService.check(1, -1));
        assertTrue(ShadedAreaService.check(0, 0));
        assertFalse(ShadedAreaService.check(5, 5));
    }
}
