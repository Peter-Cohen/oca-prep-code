/**
 *	Hoi
 *
 */
class Aap {
	String aVar = "aap";

	String tellAap() {
		aVar = "no aap";
		//aVar = "aapaap";
		return aVar;
	}

}
public class Scope1 {
	
	public static void main(String args[]) {
		Aap aap = new Aap();
		System.out.println("aVar in object is : " + aap.aVar);
		System.out.println("aVar in tellAap is : " + aap.tellAap());
		

		// int var = 0;
		// if(true) {
		// 	int var = 2;
		// 	System.out.println(var);
		// }
		// System.out.println(var);

		


	}
}