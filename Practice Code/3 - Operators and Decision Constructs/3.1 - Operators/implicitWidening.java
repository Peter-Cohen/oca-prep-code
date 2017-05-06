/**
 *
 *
*/


class implicitWidening {

  public static void main(String[] args) {

    byte a = 1, b=2, c;
    //c = a + b;                   //  DOES NOT COMPILE: operands implicitly widened to ints!
    //c = (byte) a + b;            //  DOES NOT COMPILE: idem, and cast apparantly only applies to a
    c = (byte) (a + b);            //  OK   
    //c = (byte) a + (byte) b;     //  DOES NOT COMPILE: operands still implicitly widened to ints!

    a += 1;
    System.out.println(a);
    //a = a + 1;                   //  DOES NOT COMPILE
    
    a = 1;
    a += a;
    System.out.println(a);

    a = 1;
    //a = a + a;                   //  DOES NOT COMPILE
    //System.out.println(a);
    




    // Move to separate file "precedence" or similar:
    a = 1;
    a += a *= 2;                   //  OK
    System.out.println(a);
    
    a = 1;
    a += a *= 2 + 7;               //  OK
    System.out.println(a);







    short s;
    //s = a + b;                 //  DOES NOT COMILE; same issues as above
    //... etc

  }
}