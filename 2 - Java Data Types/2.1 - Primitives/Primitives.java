/**
 *	Hoi
 *
 */
class Primitives {
	public static void main(String args[]) {
		

    /* 
      Assigning literals using prefixes; using underscores:
    */
		int decimal1 = 123;
    //int decimal2 = _123;         // does not compile: no underscore at the start of a literal
    // int decimal3 = 123_;        // does not compile: no underscore at the end

    int binary1 = 0b010101;
    // int binary2 = 0b_010101;    // does not compile: no underscore directly after 0b
    int binary3 = 0b0101_01;
    // int binary4 = 0b010101_;    // does not compile: no underscore at the end

    int octal1 = 0123;
    int octal2 = 0_123;            // !!! DOES compile: underscore allowed directly following 0 (octal)
    int octal3 = 012_3;
    //  int octal4 = 0123_;        // does not compile: no underscore at the end

    int hex1 = 0xabcd;
    //int hex2 = 0x_000_00abc;     // does not compile: no underscore directly after 0x
    
    double double1 = 1_000.23_500; //
    //double double2 = 100_.23_5;  // does not compile: no underscore before decimal point

    
    /*
      Assigning literals using suffixes:
    */


    
	}

}