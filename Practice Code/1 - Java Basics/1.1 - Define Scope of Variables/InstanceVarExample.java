/**
 *
 *
*/

class InstanceVarExample {

  // DOES NOT COMPILE: ILLEGAL FORWARD REFERENCE
  // { System.out.println("inside initializer block, before declaring: " + instanceVar); }   
  // { System.out.println("inside initializer block, before declaring: " + instanceVarInt); }   


  // Now the instance variables will be declared:
  String instanceVarString;
  int instanceVarInt;

  
  // This DOES complile
  { System.out.println("Value of 'instanceVar' inside initializer block, after declaring: " + instanceVarString); }
  { System.out.println("Value of 'instanceVar' inside initializer block, after declaring: " + instanceVarInt); }


  // Constructor: 
  InstanceVarExample() {
    instanceVarString = "aap";
    instanceVarInt = 911;
  }



  public static void main(String args[]) {

    InstanceVarExample i = new InstanceVarExample();
    System.out.println("Value of 'instanceVarString' after creating an object: " + i.instanceVarString);
    System.out.println("Value of 'instanceVarInt' after creating an object: " + i.instanceVarInt);


  }




}