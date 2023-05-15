////////////////////////////////////////////////////////////////////
// MICHELE BETTIN 2042883
// RICCARDO FAVARON 2042386
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class IntegerToRomanTest {
    static IntegerToRoman converter = null;

    @BeforeClass
    public static void initializeConverter() {
        converter = new IntegerToRoman();
    }

    @Test
    public void testZeroNumber() throws NegativeNumberException, TooBigNumberException {
        int number = 0;
        String expected = "";
        String roman_number = converter.convert(number);
        assertEquals(expected, roman_number);
    }

    @Test(expected = NegativeNumberException.class)
    public void testNegativeNumber() throws NegativeNumberException, TooBigNumberException {
        int number = -1;
        converter.convert(number);
    }

    @Test(expected = TooBigNumberException.class)
    public void testTooBigNumber() throws NegativeNumberException, TooBigNumberException {
        int number = 1001;
        converter.convert(number);
    }
}