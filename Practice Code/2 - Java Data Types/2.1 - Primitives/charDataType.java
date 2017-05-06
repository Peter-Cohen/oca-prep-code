/**
 *
 *
*/

class charDataType {

  public static void main(String[] args) {

    // Assigning an int value to a char:
    char ch = 77;
    System.out.println(ch);

    // Assigning a character value: 
    ch = 'A';
    System.out.println(ch);

    // Assigning a unicode value to a char:
    ch = '\u0122';
    System.out.println(ch);


    // It is possible to perform calculations on chars:
    ch = 'A';
    ch += 1;
    System.out.println(ch);
    ch *= 1.1;
    System.out.println(ch);
    
    ch = 0;
    ch += 'a' + 2;
    System.out.println(ch);

    // A calculation may result in a negative value, which will be ....xxx yyy
    System.out.println("\n");
    ch -= 5000;
    System.out.println(ch);    

    // ..... but a char cannot be assigned a negative value!!
    //ch = -100;
    //System.out.println(ch);

    // .... but a negative value can be CAST to a char:
    ch = (char) -122;
    System.out.println(ch);




    // this is weird:
    System.out.println("\nWeird:");
    ch = 'b';
    System.out.println(ch);

    ch = 'b' + 'b';
    System.out.println(ch);
    ch = 'b' + 5;
    System.out.println(ch + ch);
    System.out.println('b' + ch);
    ch += 'b';
    System.out.println(ch);
    ch = 196;
    System.out.println(ch);



    
    
  }
}