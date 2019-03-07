/**
 * Tests Die
 * @author Munib Emre Sevilgen
 * @version 1.00 2017-11-28
 */ 
public  class TestDie
{
   public static void main (String [] args)
   {
      // constants

      // variables
      Die die1;
      Die die2;
      int firstRoll;
      int secondRoll;
      
      // program code
      die1 = new Die(7);
      die2 = new Die(7);
      
      firstRoll = die1.roll();
      System.out.println( die1.toString() );
      secondRoll = die2.roll();
      System.out.println( die2.toString() );
   }
}