import java.util.Scanner;
import java.util.Arrays;
/**
 * Creates array of 10 random BigNums and prints them
 * @author Munib Emre Sevilgen
 * @version 1.00 2017-12-19
 */ 

public class Lab10b 
{
   public static void main (String args[])
   { 
      Scanner scan = new Scanner(System.in);
      
      // constants
      
      // variables
      int n;
      BigNum max;
      int indexMax;
      
      // program code
      
      // Creates 10 random BigNums and prints them
      BigNum[] bigNums = new BigNum[10];
      for (int i = 0; i < 10; i++)
      {
         String s = "";
         for (int j = 0; j < BigNum.SIZE; j++)
         {
            s = s + (char)('0' + Math.random() * BigNum.BASE);
         }
         bigNums[i] = new BigNum( s);
         System.out.println( i + ") " + bigNums[i]);
      }
      
      // Finds max BigNum and swaps that with n'th BigNum
      do {
         System.out.println( "Enter the value n: ");
         n = scan.nextInt();
         if( n >= 0){
            
            /**
            max = bigNums[0];
            indexMax = 0;
            for( int i = 0; i <= n; i++) {
               if( max.isLessThan( bigNums[i])) {
                  max = bigNums[i];
                  indexMax = i;
               }
            }
            System.out.println( "\n" + "Biggest BigNum in the first " + n + " elements : " + max + "\n");
            bigNums[indexMax] = bigNums[n];
            bigNums[n] = max;
            */
            Arrays.sort( bigNums, 0, n + 1);
            System.out.println( "The result is: ");
            for (int i = 0; i < 10; i++) {
               System.out.println( i + ") " + bigNums[i]);
            }
         }
      } while (n >= 0);
   }
}
