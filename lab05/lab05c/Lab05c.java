import java.util.Scanner;

/**
 * Simple Calculator 
 * @author Munib Emre Sevilgen
 * @version 1.00 2017-10-31
 */ 
public class Lab05c
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants
      final double ACCURACY = 0.0001;
      // variables
      boolean quit;
      double result;
      double number;
      String operation;
      boolean clearOperation;
      boolean quitOperation;
      double sumForTaylor;
      double sumForTaylorBefore;
      double termForTaylor;
      boolean taylorCheck;
      int count;

      // program code

      clearOperation = true;
      quitOperation = true;
      quit = false;
      result = 0.0;
      number = 0.0;
      System.out.println( "Welcome to \"SimpleCalc\"...");
      do {
         
         // Outputs and inputs
         System.out.println( "------------------");
         System.out.println( "[" + result + "]");
         System.out.println( "------------------");
         System.out.println( "  +,-,*,/ value\n  Clear\n  Quit");
         System.out.println( "------------------");
         System.out.print( "Select : ");
         operation = scan.next();
         
         // Clear and quit check
         if ( operation.equals( "Clear") || operation.equals( "clear") || operation.equals( "C") || operation.equals( "c")){
            clearOperation = false;
         }
         if ( operation.equals( "Quit") || operation.equals( "quit") || operation.equals( "Q") || operation.equals( "q")) {
            quitOperation = false;
         }
         
         // Number input
         if ( clearOperation && quitOperation ) {
            number = scan.nextDouble();
         }
         
         // Operation check
         if ( operation.equals( "+") ) {
            result = result + number;
         }
         else if ( operation.equals( "-") ) {
            result = result - number;
         }
         else if ( operation.equals( "*") ) {
            result = result * number;
         }
         else if ( operation.equals( "/") ) {
            result = result / number;
         }
         else if ( operation.equals( "sin")){

            // Calculate sinus by Taylor Series
            number = Math.PI / 180 * number;
            number = number % (2 * Math.PI);
            termForTaylor = 1.0;
            sumForTaylor  = 0.0;
            sumForTaylorBefore = 0.0;
            taylorCheck = false;
            count = 1;
            do {
               termForTaylor = termForTaylor * (number / count);
               
               if (count % 4 == 1) {
                  sumForTaylorBefore = sumForTaylor;
                  sumForTaylor = sumForTaylor + termForTaylor;
               }
               if (count % 4 == 3) {
                  sumForTaylorBefore = sumForTaylor;
                  sumForTaylor = sumForTaylor - termForTaylor;
               }
               
               // Compare sinus results
               if ( sumForTaylorBefore - sumForTaylor <= ACCURACY && sumForTaylor - sumForTaylorBefore <= ACCURACY ) {
                  taylorCheck = true;
                  result = sumForTaylor;
               }          
               count++;
            }
            while ( !taylorCheck );
         }
         else if ( !clearOperation ) {
            result = 0.0;
            clearOperation = true;
         }
         else if ( !quitOperation ) {
            quit = true;
         }
         // Error for invalid input
         else {
            System.out.println("Error: You entered invalid operation.");
         }
         System.out.println("\n");
      }
      while (!quit);
      System.out.println( "Thanks for using \"SimpleCalc\", goodbye.");
   }

}