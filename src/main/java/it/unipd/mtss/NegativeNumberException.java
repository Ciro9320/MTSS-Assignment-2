////////////////////////////////////////////////////////////////////
// MICHELE BETTIN 2042883
// RICCARDO FAVARON 2042386
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class NegativeNumberException extends Exception {
    /* Exception for negative number */
    public NumberUnderZeroException() {
        super("Negative Roman number are not allowed in this program.");
    }
}