/**
 *	Hoi
 *
 */

class Something {
	{ System.out.println("Hi, I am Initializer Block 1"); }
	
	public Something() { 
		System.out.println("Hi, I am the Constructor"); 
	}
	
	{ System.out.println("Hi, I am Initializer Block 2"); }

}


public class InitializerBlocks {
		
	public static void main(String args[]) {
		Something s = new Something();

		System.out.println("Hi, I am the main method");
		
	}
		
}