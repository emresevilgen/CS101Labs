/**
 * Tests methods for DiceGame
 * @author Munib Emre Sevilgen
 * @version 1.00 2017-12-12
 */ 

public class Dice
{ 
   // properties
   private int face1;
   private int face2;
   private Die die1;
   private Die die2;
   private int numberOfFaces;
   
   // constructor
   public Dice( int numberOfFaces)
   {
      this.numberOfFaces = numberOfFaces;
      die1 = new Die(numberOfFaces);
      die2 = new Die(numberOfFaces);
      face1 = 0;
      face2 = 0;
   }
   public Dice () 
   {
      numberOfFaces = 6;
      die1 = new Die(numberOfFaces);
      die2 = new Die(numberOfFaces);
      face1 = 0;
      face2 = 0;
   }
   
   // methods
   /**
    * Rolls two die
    */
   public void roll()
   { 
      face1 = die1.roll();
      face2 = die2.roll();
   }
   /**
    * Gets face value of first die.
    * @return face value of the first dice
    */
   public int getDie1FaceValue()
   { 
      return face1;
   }
   /**
    * Gets face value of second die.
    * @return face value of the second dice
    */
   public int getDie2FaceValue()
   { 
      return face2;
   }
   /**
    * Gets total value of two die
    * @return total value of two die
    */
   public int getDiceTotal()
   { 
      return face1 + face2;
   }
   /**
    * Gets the string of total
    * @return string of total
    */
   public String toString()
   {
      return "For first die --> " + die1.toString() + "\nFor second die --> " + die2.toString();
   }
} 
