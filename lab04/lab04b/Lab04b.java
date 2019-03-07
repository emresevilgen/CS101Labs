import java.util.Scanner;

/**
 * Calculator of sum, average, count, maximum and minimum 
 * @author Munib Emre Sevilgen
 * @version 1.00 2017-10-24
 */ 
public class Lab04b
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // constants
      final int N = 10;
      
      // variables
      int count;
      int valueFromUser;
      int sum;
      double average;
      int max;
      int min;
      
      // program code
      sum = 0;
      count = 0;
      
      // First input
      valueFromUser = scan.nextInt();
      sum = sum + valueFromUser;
      count++;
      max = valueFromUser;
      min = valueFromUser;
      
      while ( count < N )
      {
         // Calculation of sum and count
         valueFromUser = scan.nextInt();
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
      }
      // Outputs and calculation of average
      average = (double) sum / count;
      System.out.println( "Sum of these values is " + sum);
      System.out.println( "Count is " + N);
      System.out.println( "Average of these values is " + average);
      System.out.println( "Maximum value is " + max);
      System.out.println( "Minimum value is " + min);
   }
}