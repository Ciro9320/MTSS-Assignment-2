////////////////////////////////////////////////////////////////////
// MICHELE BETTIN 2042883
// RICCARDO FAVARON 2042386
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class RomanPrinter {
	
	private static HashMap<Character, String[]> converter = null;
	
	static {
        HashMap<Character, String[]> conMap = new HashMap<Character, String[]>();
        conMap.put('I', new String[] { 
			"8888888",
			"  888  ",
			"  888  ",
			"  888  ",
			"  888  ",
			"  888  ",
			"  888  ",
			"8888888" 
		});
		
        conMap.put('V', new String[] {
			"888     888",
			"888     888",
			"888     888",
			"Y88b   d88P",
			" Y88b d88P ",
			"  Y88o88P  ",
			"   Y888P   ",
			"    Y8P    " 
		});
		
        conMap.put('X', new String[] {
			"Y88b   d88P",
			" Y88b d88P ",
			"  Y88o88P  ",
			"   Y888P   ",
			"   d888b   ",
			"  d88888b  ",
			" d88P Y88b ",
			"d88P   Y88b" 
		});
		
        conMap.put('L', new String[] {
			"888     ",
			"888     ",
			"888     ",
			"888     ",
			"888     ",
			"888     ",
			"888     ",
			"88888888" 
		});
		
        conMap.put('C', new String[] { 
			" .d8888b. ",
			"d88P  Y88b",
			"888    888",
			"888       ",
			"888       ",
			"888    888",
			"Y88b  d88P",
			" °Y8888P° " 
		});
		
        conMap.put('D', new String[] {
			"8888888b. ",
			"888  °Y88b",
			"888    888",
			"888    888",
			"888    888",
			"888    888",
			"888  .d88P",
			"8888888P° " 
		});
        conMap.put('M', new String[] {
			"888b     d888",
			"8888b   d8888",
			"88888b.d88888",
			"888Y88888P888",
			"888 Y888P 888",
			"888  Y8P  888",
			"888   °   888",
			"888       888" 
		});
		
        converter = conMap;
    }
	
    public static String print(int num)
	{
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber) {
        if (romanNumber.equals("")) {
            return "";
        }
        StringBuilder asciiArt = new StringBuilder();
        // Cycle to print the rows
        for (int i = 0; i < 8; i++) {
            // Cycle to print the i-th row of the single character
            for (int c = 0; c < romanNumber.length(); c++) {
                asciiArt.append(converter.get(romanNumber.charAt(c))[i]);
            }
            asciiArt.append('\n');
        }
        return asciiArt.toString();
    }
}