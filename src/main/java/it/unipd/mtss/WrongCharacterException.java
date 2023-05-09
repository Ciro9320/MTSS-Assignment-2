////////////////////////////////////////////////////////////////////
// MICHELE BETTIN 2042883
// RICCARDO FAVARON 2042386
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class WrongCharacterException extends Exception {
    /* Exception for wrong input */
    public WrongCharacterException(char c) {
        super("The letter " + c + " is not allowed in this program.");
    }
}
