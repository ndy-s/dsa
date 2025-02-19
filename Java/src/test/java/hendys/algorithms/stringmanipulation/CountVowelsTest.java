package hendys.algorithms.stringmanipulation;

import org.junit.Test;
import static org.junit.Assert.*;

public class CountVowelsTest {

    @Test
    public void testCountVowels() {
        assertEquals(3, CountVowelsApp.countVowels("Hello World"));
        assertEquals(5, CountVowelsApp.countVowels("aeiou"));
        assertEquals(0, CountVowelsApp.countVowels("bcdfg"));
        assertEquals(10, CountVowelsApp.countVowels("AaEeIiOoUu"));
        assertEquals(0, CountVowelsApp.countVowels(""));
        assertEquals(2, CountVowelsApp.countVowels("Java"));
    }
}
