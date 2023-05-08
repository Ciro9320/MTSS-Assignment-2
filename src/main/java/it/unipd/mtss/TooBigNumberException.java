////////////////////////////////////////////////////////////////////
// MICHELE BETTIN 2042883
// RICCARDO FAVARON 2042386
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class TooBigNumberException extends Exception {
    /* Exception for too big number */
    public TooBigNumberException() {
        super("Number that exceed the 1000 are not allowed in this program.");
    }
}