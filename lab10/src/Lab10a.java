/**
 * Tests the BigNum class
 * @author Munib Emre Sevilgen
 * @version 1.00 2017-12-19
 */ 

public class Lab10a 
{
   public static void main(String[] args) 
   {
      // constants
      
      // variables
      
      BigNum b1;
      BigNum b2;
      BigNum b3;
      
      // program code
      b1 = new BigNum();
      b2 = new BigNum("11111111");
      b3 = new BigNum( b2);
      
      System.out.println( "b1: " + b1);
      System.out.println( "b2: " + b2);
      System.out.println( "b3: " + b3);
      
      // equals method
      System.out.println( "b1.equals(b2): " + b1.equals(b2));
      System.out.println( "b2.equals(b3): " + b2.equals(b3));
      
      // isZero method
      System.out.println( "b1.isZero(): " + b1.isZero());
      System.out.println( "b2.isZero(): " + b2.isZero());
      
      // shift method
      b2.shift( true);
      System.out.println( "b2 after shift( true): " + b2);
      b2.shift( false);
      System.out.println( "b2 after shift( false): " + b2);
      
      // add method
      System.out.println( "b2.add( b3) ---> " + " Overflow: " + b2.add(b3) + " b2: " + b2);
      
   }
}
