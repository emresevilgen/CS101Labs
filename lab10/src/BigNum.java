/**
 * Represents a positive number by storing its digits in an int array by defined size and base
 * @author Munib Emre Sevilgen
 * @version 1.00 2017-12-19
 */ 

public class BigNum implements Comparable<BigNum>{
   
   //properties
   public final static int SIZE = 10;
   public final static int BASE = 50;
   private int[] arrayOfNumber;
   
   //constructors
   public BigNum()
   {
      arrayOfNumber = new int[SIZE];
   }
   
   public BigNum( String number){
      arrayOfNumber = new int[SIZE];
      for( int i = 0; i < SIZE; i++) {
         if( number.length() - 1 - i >= 0)
            arrayOfNumber[i] = (int) (number.charAt( number.length() - 1 - i) - '0');
         else
            arrayOfNumber[i] = 0;
      }
   }
   
   public BigNum ( BigNum other)
   {
      arrayOfNumber = new int[SIZE];
      for( int i = 0; i < SIZE; i++) {
         arrayOfNumber[i] = other.arrayOfNumber[i];
      }
   }
   
   /**
    * Returns the string of value
    * @return s the string of value
    */
   public String toString()
   {      
      String s = "";
      for( int i = 0; i < SIZE; i++) {
         s = (char) ('0' + arrayOfNumber[i]) + s;
      }
      return s;
   }
   
   /**
    * Checks two BigNums whether they are equal or not
    * @param other BigNum value
    * @return true if values are equal or false if they are not equal
    */
   public boolean equals( BigNum other)
   {
      for( int i = 0; i < SIZE ; i++){
         if( arrayOfNumber [i] != other.arrayOfNumber [i]){
            return false;
         }
      }
      return true;
   }
   
   /**
    * Checks BigNum is zero or not.
    * @return true if BigNum is zero, false if BigNum is not zero
    */
   public boolean isZero() {
      for(int i = 0; i < SIZE; i++){
         if(arrayOfNumber [i] != 0)
            return false; 
      }
      return true;
   }
   
   /**
    * Divides if paramater is false or multiplies if parameter is true.
    * @param left true for multiplying, false for dividing
    */
   public void shift ( boolean left)
   {
      if ( left) {
         for( int i = SIZE - 1; i > 0; i--) {
            arrayOfNumber [i] = arrayOfNumber [i - 1];
         }
         arrayOfNumber [0] = 0;
      }
      else {
         for(int i = 0; i < SIZE - 1; i++) {
            arrayOfNumber [i] = arrayOfNumber [i + 1];
         }
         arrayOfNumber [SIZE - 1] = 0;
      }
   }
   
   /**
    * Adds other BigNum value to BigNum value
    * @param other BigNum
    * @return owerflow
    */
   public int add( BigNum other)
   {
      int temp;
      int carry;
      
      temp = 0;
      carry = 0;
      
      for( int i = 0; i < SIZE; i++)
      {
         temp = carry + other.arrayOfNumber [i] + arrayOfNumber [i];  
         if(temp >= BASE) {
            carry = temp / BASE ;
            temp = temp %  BASE; 
         }   
         else {
            carry = 0; 
         }
         arrayOfNumber [i] = temp; 
      }
      return carry;
   }
   
   /**
    * Checks that is BigNum less than other BigNum
    * @param other BigNum
    * @return true if BigNum is less than other BigNum or false if it is not
    */
   public boolean isLessThan(BigNum other)
   {
      for( int i = SIZE - 1; i >= 0; i--)
      {
         if( arrayOfNumber [i] < other.arrayOfNumber [i])
            return true;
         else if (arrayOfNumber [i] > other.arrayOfNumber [i])
            return false;
      }
      return false;
   }
   
   /**
    * Compare the BigNum to other BigNum
    * @param other BigNum
    * @return -1 if BigNum is less than other BigNum, 0 if they are equal, 1 if BigNum is bigger than other BigNum
    */
   public int compareTo(BigNum other)
   {
      for( int i = SIZE - 1; i >= 0; i--)
      {
         if( arrayOfNumber [i] < other.arrayOfNumber [i])
            return -1;
         else if (arrayOfNumber [i] > other.arrayOfNumber [i])
            return 1;
      }
      return 0;
   }
}