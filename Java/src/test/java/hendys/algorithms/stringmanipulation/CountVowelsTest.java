package hendys.algorithms.stringmanipulation;

import org.junit.Test;
import static org.junit.Assert.*;

public class CountVowelsTest {

    @Test
    public void testCountVowels() {
        assertEquals(3, CountVowels.countVowels("Hello World"));
        assertEquals(5, CountVowels.countVowels("aeiou"));
        assertEquals(0, CountVowels.countVowels("bcdfg"));
        assertEquals(10, CountVowels.countVowels("AaEeIiOoUu"));
        assertEquals(0, CountVowels.countVowels(""));
        assertEquals(2, CountVowels.countVowels("Java"));
    }
}
