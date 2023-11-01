
import org.example.task4.CheckPrimeService;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestForTask4 {

    @Test
    public void testForPrimeIndexex() {
        int N = 5;
        int[] array = {101, 22, 3, 47, 5};
        int[] primeIndexes;

        primeIndexes = CheckPrimeService.indexexOfPrimeNumbers(N, array).stream().mapToInt(Integer::intValue).toArray();

        assertArrayEquals(primeIndexes, new int[]{0, 2, 3, 4});
    }

    @Test
    public void testForPrimeIndexexWithoutPrimeNumbers() {
        int N = 3;
        int[] array = {25, 22, 21};
        int[] primeIndexes;

        primeIndexes = CheckPrimeService.indexexOfPrimeNumbers(N, array).stream().mapToInt(Integer::intValue).toArray();

        assertArrayEquals(primeIndexes, new int[0]);
    }

    @Test
    public void testIsPrimeWithPrimeNumbers() {
        assertTrue(CheckPrimeService.isPrime(2));
        assertTrue(CheckPrimeService.isPrime(7));
        assertTrue(CheckPrimeService.isPrime(13));
        assertTrue(CheckPrimeService.isPrime(19));
        assertTrue(CheckPrimeService.isPrime(31));
    }

    @Test
    public void testIsPrimeWithNonPrimeNumbers() {
        assertFalse(CheckPrimeService.isPrime(1));
        assertFalse(CheckPrimeService.isPrime(4));
        assertFalse(CheckPrimeService.isPrime(8));
        assertFalse(CheckPrimeService.isPrime(15));
        assertFalse(CheckPrimeService.isPrime(27));
    }

    @Test
    public void testIsPrimeWithNegativeNumbers() {
        assertFalse(CheckPrimeService.isPrime(-2));
        assertFalse(CheckPrimeService.isPrime(-7));
        assertFalse(CheckPrimeService.isPrime(-13));
    }

    @Test
    public void testIsPrimeWithZero() {
        assertFalse(CheckPrimeService.isPrime(0));
    }
}



