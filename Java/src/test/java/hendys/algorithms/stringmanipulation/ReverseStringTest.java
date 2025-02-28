package hendys.algorithms.stringmanipulation;

import org.junit.Test;
import static org.junit.Assert.*;

public class ReverseStringTest {

    @Test
    public void testReverse() {
        assertEquals("dcba", ReverseString.reverse("abcd"));
        assertEquals("olleh", ReverseString.reverse("hello"));
        assertEquals("987654321", ReverseString.reverse("123456789"));
        assertEquals("", ReverseString.reverse("")); // Edge case: empty string
        assertEquals("a", ReverseString.reverse("a")); // Edge case: single character
    }

    @Test
    public void testReverseManual() {
        assertEquals("dcba", ReverseString.reverseManual("abcd"));
        assertEquals("olleh", ReverseString.reverseManual("hello"));
        assertEquals("987654321", ReverseString.reverseManual("123456789"));
        assertEquals("", ReverseString.reverseManual("")); // Edge case: empty string
        assertEquals("a", ReverseString.reverseManual("a")); // Edge case: single character
    }
}
