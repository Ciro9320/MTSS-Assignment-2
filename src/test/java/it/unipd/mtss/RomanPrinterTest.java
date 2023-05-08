////////////////////////////////////////////////////////////////////
// MICHELE BETTIN 2042883
// RICCARDO FAVARON 2042386
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;

public class RomanPrinterTest {
    static RomanPrinter printer;

    @BeforeClass
    public static void initializePrinter() {
        printer = new RomanPrinter();
    }

    @Test
    public void testPrintI() throws NegativeNumberException, TooBigNumberException {
        int number = 1;
        String ascii_art_for_I = printer.print(number);
        assertEquals(ascii_art_for_I, new String(
            "8888888\n" +
			"  888  \n" +
			"  888  \n" +
			"  888  \n" +
			"  888  \n" +
			"  888  \n" +
			"  888  \n" +
			"8888888\n"
        ));
    }

    @Test
    public void testPrintV() throws NegativeNumberException, TooBigNumberException {
        int number = 5;
        String ascii_art_for_V = printer.print(number);
        assertEquals(ascii_art_for_V, new String(
            "888     888\n" +
			"888     888\n" +
			"888     888\n" +
			"Y88b   d88P\n" +
			" Y88b d88P \n" +
			"  Y88o88P  \n" +
			"   Y888P   \n" +
			"    Y8P    \n"
        ));
    }

    @Test
    public void testPrintX() throws NegativeNumberException, TooBigNumberException {
        int number = 10;
        String ascii_art_for_X = printer.print(number);
        assertEquals(ascii_art_for_X, new String(
            "Y88b   d88P\n" +
			" Y88b d88P \n" +
			"  Y88o88P  \n" +
			"   Y888P   \n" +
			"   d888b   \n" +
			"  d88888b  \n" +
			" d88P Y88b \n" +
			"d88P   Y88b\n" 
        ));
    }

    @Test
    public void testPrintL() throws NegativeNumberException, TooBigNumberException {
        int number = 50;
        String ascii_art_for_L = printer.print(number);
        assertEquals(ascii_art_for_L, new String(
            "888     \n" +
			"888     \n" +
			"888     \n" +
			"888     \n" +
			"888     \n" +
			"888     \n" +
			"888     \n" +
			"88888888\n" 
        ));
    }

    @Test
    public void testPrintC() throws NegativeNumberException, TooBigNumberException {
        int number = 100;
        String ascii_art_for_C = printer.print(number);
        assertEquals(ascii_art_for_C, new String(
            " .d8888b. \n" +
			"d88P  Y88b\n" +
			"888    888\n" +
			"888       \n" +
			"888       \n" +
			"888    888\n" +
			"Y88b  d88P\n" +
			" °Y8888P° \n" 
        ));
    }

    @Test
    public void testPrintD() throws NegativeNumberException, TooBigNumberException {
        int number = 500;
        String ascii_art_for_D = printer.print(number);
        assertEquals(ascii_art_for_D, new String(
            "8888888b. \n" +
			"888  °Y88b\n" +
			"888    888\n" +
			"888    888\n" +
			"888    888\n" +
			"888    888\n" +
			"888  .d88P\n" +
			"8888888P° \n" 
        ));
    }

    @Test
    public void testPrintM() throws NegativeNumberException, TooBigNumberException {
        int number = 1000;
        String ascii_art_for_M = printer.print(number);
        assertEquals(ascii_art_for_M, new String(
            "888b     d888\n" +
			"8888b   d8888\n" +
			"88888b.d88888\n" +
			"888Y88888P888\n" +
			"888 Y888P 888\n" +
			"888  Y8P  888\n" +
			"888   °   888\n" +
			"888       888\n" 
        ));
    }

    @Test
    public void testNumberZero() throws NegativeNumberException, TooBigNumberException {
        int number = 0;
        String ascii_art_for_zero = printer.print(number);
        assertEquals(ascii_art_for_zero, new String(""));
    }

    @Test
    public void testNumber12() throws NegativeNumberException, TooBigNumberException {
        int number = 12;
        String ascii_art_for_12 = printer.print(number);
        assertEquals(ascii_art_for_12,
            new String(
                "Y88b   d88P" + "8888888" + "8888888\n" +
                " Y88b d88P " + "  888  " + "  888  \n" +
                "  Y88o88P  " + "  888  " + "  888  \n" +
                "   Y888P   " + "  888  " + "  888  \n" +
                "   d888b   " + "  888  " + "  888  \n" +
                "  d88888b  " + "  888  " + "  888  \n" +
                " d88P Y88b " + "  888  " + "  888  \n" +
                "d88P   Y88b" + "8888888" + "8888888\n"
            ));
    }
}