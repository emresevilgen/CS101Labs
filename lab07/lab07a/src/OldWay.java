/**
 * Old way of rolling two dices
 * @author Munib Emre Sevilgen
 * @version 1.00 2017-11-28
 */ 
public class OldWay
{ 
   public static void main (String [] args)
   { 
      // variables
      int max;
      int min;
      int range;
      int firstDie;
      int secondDie;
      int count;
      int faceOfDice;
      
      // program code
      max = 6;
      min = 1;
      count = 0;
      range = ( max - min) + 1;
      
      do { 
         faceOfDice = ( int)( Math.random() * range) + min;
         firstDie = faceOfDice;
         faceOfDice = ( int)( Math.random() * range) + min;
         secondDie = faceOfDice;
         count++;
         System.out.println (firstDie + " - " + secondDie);
      } while ( firstDie != 6 || secondDie != 6);
      
      System.out.print("Number of times = " + count);
   }
}
