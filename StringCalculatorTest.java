package Calculator.project;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorTest {

    @Test
    public void testAddEmptyString() {
        assertEquals(0, StringCalculator.add(""));
    }

    @Test
    public void testAddSingleNumber() {
        assertEquals(1, StringCalculator.add("1"));
    }

    @Test
    public void testAddTwoNumbers() {
        assertEquals(3, StringCalculator.add("1,2"));
    }

    @Test
    public void testAddNewLinesBetweenNumbers() {
        assertEquals(6, StringCalculator.add("1\n2,3"));
    }

    @Test
    public void testAddWithCustomDelimiter() {
        assertEquals(3, StringCalculator.add("//;\n1;2"));
    }

    @Test
    public void testAddNegativeNumbers() {
        try {
            StringCalculator.add("-1,2,-3");
        } catch (IllegalArgumentException e) {
            assertEquals("Negative numbers not allowed: -1, -3", e.getMessage());
        }
    }
}

