import java.util.Scanner;

/**
 * Print a triangle using characters
 * @author Munib Emre Sevilgen
 * @version 1.00 2017-10-24
 */ 
public class Lab04d
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // constants
      
      // variables
      char ch;
      int width;
      int count;
      int countOfCharsInLine;
      int countOfSpaces;
      
      // program code
      
      // First part
      // Inputs
      System.out.print( "Enter a character: ");
      ch = scan.next().charAt(0);
      
      System.out.print( "Enter the width: ");
      width = scan.nextInt();
      
      count = 0;
      countOfCharsInLine = 0;
      
      while ( count < width)
      {
         countOfSpaces = count + 1; 
         while ( countOfSpaces < width )
         {
            System.out.print( " ");
            countOfSpaces++;
         }
         count++; 
         while ( countOfCharsInLine <  count + count - 1 )
         {
            System.out.print(ch);
            countOfCharsInLine++;
         }
         System.out.println();
         countOfCharsInLine = 0;
      }
     
      // Second part
      System.out.println("\n");
      double d;
      d = 0.1;
      while ( d <= 1.0 )
      {
         System.out.println( d);
         d = d + 0.1;
      }
      System.out.println( d + " <- final value after loop!");
      
   }
   
}