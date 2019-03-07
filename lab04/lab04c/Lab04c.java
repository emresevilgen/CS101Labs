import java.util.Scanner;

/**
 * Average, maximum and minimum finder
 * @author Munib Emre Sevilgen
 * @version 1.00 2017-10-24
 */ 
public class Lab04c
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // constants
      
      // variables
      double average;
      int sum;
      int max;
      int min;
      int count;
      int valueFromUser;
      
      // program code
      count = 0;
      sum = 0;
      
      // First input
      // System.out.print( "Please enter an integer value: ");
      valueFromUser = scan.nextInt();
      max = valueFromUser;
      min = valueFromUser;

      while ( valueFromUser > 0 )
      {
         // Calculation of sum
         sum = sum + valueFromUser;
         count++;
         
         // Check maximum
         if ( valueFromUser > max){
            max = valueFromUser;
         }
         
         // Check minimum
         if ( valueFromUser < min){
            min = valueFromUser;
         } 
         // Other inputs
         // System.out.print( "Please enter an integer value: (If you want to finish the program, enter a negative value)");
         valueFromUser = scan.nextInt();
      }
      // Calculation of average an outputs
      average = (double) sum / count;
      System.out.println( "Average of these values is " + average);
      System.out.println( "Maximum value is " + max);
      System.out.println( "Minimum value is " + min);
         
   }
   
}