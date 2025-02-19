package hendys.algorithms.stringmanipulation;

import org.junit.Test;
import static org.junit.Assert.*;

public class ReverseStringTest {

    @Test
    public void testReverse() {
        assertEquals("dcba", ReverseStringApp.reverse("abcd"));
        assertEquals("olleh", ReverseStringApp.reverse("hello"));
        assertEquals("987654321", ReverseStringApp.reverse("123456789"));
        assertEquals("", ReverseStringApp.reverse("")); // Edge case: empty string
        assertEquals("a", ReverseStringApp.reverse("a")); // Edge case: single character
    }

    @Test
    public void testReverseManual() {
        assertEquals("dcba", ReverseStringApp.reverseManual("abcd"));
        assertEquals("olleh", ReverseStringApp.reverseManual("hello"));
        assertEquals("987654321", ReverseStringApp.reverseManual("123456789"));
        assertEquals("", ReverseStringApp.reverseManual("")); // Edge case: empty string
        assertEquals("a", ReverseStringApp.reverseManual("a")); // Edge case: single character
    }
}
