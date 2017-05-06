/**
 *
 *
*/



class Foo {

  int a = 5;

  //int getA() { return a; }

}


class Bar extends Foo {
    
  Bar() { 
  
  }
 
  int getA() { return 10; }

}


public class Fields {
  
  public static void main(String[] args) {

    Foo class1 = new Bar();
    System.out.println("> " + class1.getA() );
    System.out.println("> " + class1.a );

    Bar class2 = new Bar();
    System.out.println("> " + class2.getA() );
    System.out.println("> " + class2.a );
  }
}