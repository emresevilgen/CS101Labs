/**
 * Includes a method for rolling the die
 * @author Munib Emre Sevilgen
 * @version 1.00 2017-12-12
 */ 

public class Die
{ 
   // properties
   private int faceValue;
   private int numberOfFaces;

   // constructors
   public Die( int numberOfFaces) {
      faceValue = 0;
      this.numberOfFaces = numberOfFaces;
   }
   
   // methods
   
   /**
    * This is the method to generate random integer values within a range.
    * @return result of the roll
    */
   public int roll()
   { 
      faceValue = (int) ( Math.random() * numberOfFaces) +  1;
      return faceValue;
   }
   
   /**
    * Gets the current face value of die.
    * @return current face value of die
    */
   public int getFaceValue() 
   { 
      return faceValue;
   }
   
   /**
    * Returns face of die as a string
    * @return face of die and the number of faces as a string
    */
   public String toString()
   {
      return "Face value: " + faceValue + " Number of faces: " + numberOfFaces;
   }
}
