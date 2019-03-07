/**
 * Tests DiceGame
 * @author Munib Emre Sevilgen
 * @version 1.00 2017-11-28
 */ 
public class TestDiceGame
{
   public static void main (String[] args)
   {
      // constants
      final int NUMBER_OF_FACES = 6;
      // variables
      int result;
      DiceGame playGame;
      
      // program code
      playGame = new DiceGame( NUMBER_OF_FACES);
      playGame.play();
      System.out.println( playGame.toString());
   }
}