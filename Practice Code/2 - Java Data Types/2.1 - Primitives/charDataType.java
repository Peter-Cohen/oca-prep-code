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



    // It is possible to perform calculations on chars:
    ch = 'A';
    ch += 1;
    System.out.println(ch);
    ch *= 1.1;
    System.out.println(ch);
    
    ch = 0;
    ch += 'a' + 2;
    System.out.println(ch);
    ch += 'b';
    System.out.println(ch);

    
  }
}