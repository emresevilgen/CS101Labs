import java.util.Scanner;

/**
 * Design, implement and test the simple methods
 * @author Munib Emre Sevilgen
 * @version 1.00 2017-11-07
 */ 
public class Lab06
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // constants
      final int COLUMN_LENGTH = 25;
      // variables
      int result;
      int countOfSpace;
      String firstBinary;
      String secondBinary;
      String text;
      String word;
      int spaceBeforeWord;
      double sum;
      double term;
      double firstColumn;
      double secondColumn;
      double thirdColumn;
      double x;
      double resultOfSinMethod;
      double resultOfMathSinMethod;
      boolean check;
      
      // program code
      
      // First part
      System.out.println("First Part\n");
      result = 0;
      for ( int i = -1; i <= 10; i++ ) {
         for ( int k = 1; k <= 4; k++) {
            result = (int) power( i, k);
            text = "" + result;
            printSpace( text , COLUMN_LENGTH);
            System.out.print( result);
         }
         System.out.println();
      }
      
      // Second part
      System.out.println("\n\nSecond Part\n");
      result = 0;
      for ( int i = 1; i <= 15; i++ ) {     
         text = "" + i;
         printSpace( text , COLUMN_LENGTH);
         System.out.print( i);
         result = factorial( i);
         text = "" + result;
         printSpace( text , COLUMN_LENGTH);
         System.out.print( result);
         System.out.println();
      }
      
      // Third part
      System.out.println( "\n\nThird Part\n");
      result = 0;
      System.out.print( "Please enter two binary number: ");
      firstBinary = scan.next();
      secondBinary = scan.next();
      result  = toDecimal( firstBinary) + toDecimal( secondBinary);
      System.out.println( "The result is " + toBinaryString( result));
      
      // Fourth part
      System.out.println( "\n\nFourth Part\n");
      System.out.print( "Please enter the text: ");
      text = scan.nextLine();
      text = scan.nextLine();
      spaceBeforeWord = -1;
      word = "";
      for ( int i = 0; i < text.length(); i++) {
         // Finish adding chars to word and print reversed version
         if ( text.charAt(i) == ' ') {
            System.out.print( reverse(word) + " ");
            word = "";
         }
         // Add char to word string
         else {
            word = word + text.charAt(i);
         }  
      }
      System.out.print( reverse(word));
      
      // Fifth part
      System.out.println( "\n\nFifth Part\n");
      System.out.print( "Please enter the degree of angle: ");
      // Read valur and conver degree to radius
      x = scan.nextInt();
      x = x * ( Math.PI / 180);
      sum = 0;
      for (int n = 0; n <= 10; n++) {
         // Calculate each term and add it to sum
         firstColumn = power( -1 , n);
         secondColumn = power( x , 2*n + 1);
         thirdColumn = factorial( 2*n + 1);
         term = ( firstColumn * secondColumn) / thirdColumn;
         sum = sum + term;
         // Print all items
         text = "" + n;
         printSpace( text, COLUMN_LENGTH);
         System.out.print(n);
         text = "" +  firstColumn;
         printSpace( text, COLUMN_LENGTH);
         System.out.print(firstColumn);
         text = "" + secondColumn;
         printSpace( text, COLUMN_LENGTH);
         System.out.print(secondColumn);
         text = "" + thirdColumn;
         printSpace( text, COLUMN_LENGTH);
         System.out.print(thirdColumn);
         text = "" + term;
         printSpace( text, COLUMN_LENGTH);
         System.out.print(term);
         text = "" + sum;
         printSpace( text, COLUMN_LENGTH);
         System.out.println(sum);
      }
      
      // Sixth part
      System.out.println( "\n\nSixth Part\n");
      System.out.print( "Please enter the degree of angle: ");
      // Calculate results by both sin and Math.sin methods
      x = scan.nextDouble();
      resultOfSinMethod = sin ( x);
      resultOfMathSinMethod = Math.sin(x * ( Math.PI / 180));
      // Print results and the deviation
      System.out.println("The result of sin method " + resultOfSinMethod);
      System.out.println("The result of Math.sin method " + resultOfMathSinMethod);
      if (resultOfSinMethod - resultOfMathSinMethod > 0) {
         System.out.println("The deviation is " + (resultOfSinMethod -resultOfMathSinMethod));
      }
      else  {
         System.out.println("The deviation is " + (resultOfMathSinMethod - resultOfSinMethod));
      }
      
      // Seventh part
      System.out.println( "\n\nSixth Part\n");
      System.out.print( "Please enter the text: ");
      // Calculate results by both sin and Math.sin methods
      text = scan.nextLine();
      text = scan.nextLine();
      check = checkPalindrome( text);
      if (check) {
         System.out.println( "Text is palindrome");
      }
      else {
         System.out.println( "Text is not palindrome");
      }
      
   }
   
   /**
 * Computes x to the power y
 * @param x is the base number
 * @param y is the exponent used to raise the base
 * @return the result of x taken to the power of y.
 */
   public static double power( double x, int y)
   {
      double result;
      result = 1;
      for ( int i = 0; i < y; i++) {
         result = result * x;
      }
      return result;
   }
   
   /**
 * Computes the factorial
 * @param n is the value for computing n factorial
 * @return result of n factorial
 */
   public static int factorial( int n)
   {
      int result;
      result = 1;
      for ( int i = n; i > 0; i--) {
         result = result * i;
      }
      return result;
   }
   
   /**
 * Reverses the string
 * @param s is the string that will be reversed
 * @return the reversed string
 */
   public static String reverse( String s)
   {
      String result;
      result = "";
      for ( int i = s.length() - 1; i >= 0; i--) {
         result = result + s.charAt( i);
      }
      return result;
   }
   
   /**
 * Converts binary string to decimal
 * @param base2 is the binary string which will be converted to decimal
 * @return the decimal value of the binary string
 */
   public static int toDecimal( String base2)
   {
      int result;
      int exponent;
      result = 0;
      exponent = 1;
      for ( int i = base2.length() - 1; i >= 0; i--) {
         result = result + (Character.getNumericValue( base2.charAt( i)))* exponent;
         exponent = exponent * 2;

      }
      return result;
   }
   
   /**
 * Converts the decimal to binary string
 * @param value is the decimal which will be converted to binary
 * @return the binary string which is calculated from decimal
 */
   public static String toBinaryString( int value)
   {
      String result;
      result = "";
      while ( value > 0 ) {
         result = result + ( value % 2);
         value = value / 2;
      }
      return reverse(result);
   }
   
   /**
 * Calculates and prints the number of space
 * @param text is the text for printing
 * @param COLUMN_LENGTH is the length of the column
 * @return No return
 */
   public static void printSpace( String text, int COLUMN_LENGTH)
   {
      int decimalPlacesOfValue;
      int countOfSpace;
      decimalPlacesOfValue = text.length(); 
      countOfSpace = COLUMN_LENGTH - decimalPlacesOfValue;
      while ( countOfSpace > 0 ) {
         System.out.print( " ");
         countOfSpace--;
      }
   }
   
   /**
 * Calculates the value of sinx
 * @param x is the double input that user wants to calculate sin function  
 * @return the result of the sin function
 */
   public static double sin( double x)
   {
      double termForTaylor;
      double sumForTaylor;
      double sumForTaylorBefore;
      boolean taylorCheck;
      int count;
      double result;
      final double ACCURACY = 0.000000000001;
      x = Math.PI / 180 * x;
      x = x % (2 * Math.PI);
      termForTaylor = 1.0;
      sumForTaylor  = 0.0;
      sumForTaylorBefore = 0.0;
      taylorCheck = false;
      count = 1;
      do {
         termForTaylor = termForTaylor * (x / (double) count);
         if (count % 4 == 1) {
            sumForTaylorBefore = sumForTaylor;
            sumForTaylor = sumForTaylor + termForTaylor;
         }
         if (count % 4 == 3) {
            sumForTaylorBefore = sumForTaylor;
            sumForTaylor = sumForTaylor - termForTaylor;
         }
         // Compare results both after and before adding the last term
         if ( sumForTaylorBefore - sumForTaylor <= ACCURACY && sumForTaylor - sumForTaylorBefore <= ACCURACY ) {
            taylorCheck = true;
            result = sumForTaylor;
         }          
         count++;
      }
      while ( !taylorCheck );
      return sumForTaylor;
   }

   /**
 * Checks the string is whether palindrome or not
 * @param s is the string that will be checked
 * @return string is polyndrome is true or not
 */
   public static boolean checkPalindrome( String s)
   {
      if ( s.equals( reverse( s))) {
         return true;
      }
      return false;
   }
   
}