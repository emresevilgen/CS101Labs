import java.util.Scanner;

/**
 * Some practice about if statements 
 * @author Munib Emre Sevilgen
 * @version 1.00 2017-10-16
 */ 
public class Lab03a
{
   public static void main( String[] args)
   {
      // constants

      // variables
      
      Scanner scan;
      int x;
      int even;
      int odd;
      int n;
      int sum;
      int resultOfFormula;
      
      // program code
      
      even = 0;
      odd = 0;
      n = 0;
      sum = 0;
      resultOfFormula = 0;
      
      // Getting n and calculating formula
      scan = new Scanner( System.in);    
      System.out.print("Please enter a number: ");
      n = scan.nextInt();
      
      resultOfFormula = ( n * ( n + 1)) / 2;
      
      for ( x = 0; x <= 50; x++ ) 
      {
         // Whenever x is not between 12 and 25 inclusive, 
         // it prints the message "out of range 12-25"  next to the value of x.
         if( x < 12 || x > 25 )
            System.out.println( x + " is out of range 12-25 inclusive.");
         
         // Count the number of even and the number of odd values, that x takes.
         if ( ( x % 2) == 0 )
            even++;
         else
            odd++;
         
         // If x is multiple of 5 print the message "Hi Five", 
         // Else if it is divisible by 2 print the message "Hi Two",
         // Else if it is divisible by 3 or 7 print the message "Hi ThreeOrSeven", 
         // Else print the message "Hi Others!".
         if ( x != 0)
         {
            if ( ( x % 5) == 0 )
               System.out.println( "Hi Five");
            else if ( ( x % 2) == 0 )
               System.out.println( "Hi Two");
            else if ( (( x % 3) == 0) || ((x%7) == 0))
               System.out.println( "Hi ThreeOrSeven");
            else
               System.out.println( "Hi Others");
         }
         // Sum the values of x between 1 and n inclusive.
         if ( x <= n && 1 <= x )
            sum = sum + x;
      }
      
      // Outputs
      System.out.println( "The number of odd values is " + odd);
      System.out.println( "The number of even values is " + even);
      
      System.out.println( "The sum that is computed inside the loop is " + sum);
      System.out.println( "The result of the formula is " + resultOfFormula);
      
      // Comparing the sum and the result of the formula
      if ( resultOfFormula == sum)
         System.out.println( "The sum that is computed inside the loop and the result of the formula are same.");
      else
         System.out.println( "The sum that is computed inside the loop and the result of the formula are not same.");
      
      
   }
   
}