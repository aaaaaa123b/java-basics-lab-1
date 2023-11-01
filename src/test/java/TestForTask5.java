import org.example.task5.FindMaxSequenceService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestForTask5 {

    @Test
    public void testFindMaxSequence(){
        int[] inputArray = {1,4,2,20,21,22,25,1,6,8};
        int[] array = {1, 2, 3, 4, 5};

        assertEquals(FindMaxSequenceService.maxLength(inputArray),4);
        assertEquals(FindMaxSequenceService.maxLength(array),0);


    }
}
