/**
 *	Hoi
 *
 */
class WrapperClasses {
	public static void main(String args[]) {
		
		Byte byte1 = 12;
		Byte byte2 = new Byte( (byte) 12);

		//Float float1 = 12.34;                    // does not compile
		Float float1 = (float) 12.34;				       // using a cast does compile
		Float float2 = new Float( (float) 12.34);
    Float float3 = 12.34f;

	}

}