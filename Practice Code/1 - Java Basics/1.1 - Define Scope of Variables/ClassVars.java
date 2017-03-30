/**
 *	
 *
 */
class ClassVars {
	
	// Class variable
	static int statvar = 5;

	// Constructor
	public ClassVars() {
		statvar += 1;
	}

	// Initializer block
	{ statvar = 100; }



	public static void main(String args[]) {
		
		System.out.println("i = " + ClassVars.statvar);

		ClassVars i = new ClassVars();	
		System.out.println("i = " + ClassVars.statvar);

		i.statvar = 2;
		System.out.println("i = " + ClassVars.statvar);

		ClassVars.statvar = 3;
		System.out.println("i = " + i.statvar);

		ClassVars j = new ClassVars();
		System.out.println("i = " + i.statvar);

	}
}