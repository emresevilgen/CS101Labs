import java.util.Scanner;
/**
 * Computes the maximum number of flowers that can be planted in a triangular-shaped garden
 * @author Munib Emre Sevilgen
 * @version 1.00 2017-10-17
 */
public class Lab03b
{
   public static void main (String[] args)
   {
      
      // constants
      final int EACH_SQUARE_METER = 17;
      
      // variables
      Scanner in;
      int a;
      int b;
      int c;
      double s;
      double x;
      double area;
      int totalNumberOfFlowers; 
      int sumAB;
      int sumAC;
      int sumBC;
      double sumOfAAndBSquare;
      double sumOfAAndCSquare;
      double sumOfBAndCSquare;
      double aSquare;
      double bSquare;
      double cSquare;
      boolean rightTraingleCheck;
      
      // program code
      
      in = new Scanner( System.in);
      
      // Getting the lenght of sides 
      System.out.print( "Please enter the first side: ");
      a = in.nextInt();
      
      System.out.print( "Please enter the second side: ");
      b = in.nextInt();
      
      System.out.print( "Please enter the third side: ");
      c = in.nextInt();
      
      // Check that triangle is right triangle
      rightTraingleCheck = false;
      
      aSquare = Math.pow( a, 2);
      bSquare = Math.pow( b, 2);
      cSquare = Math.pow( c, 2);
      
      sumOfAAndBSquare = aSquare + bSquare;
      sumOfAAndCSquare = aSquare + cSquare;
      sumOfBAndCSquare = bSquare + cSquare;
      
         
      if ( sumOfAAndBSquare == cSquare || sumOfAAndCSquare == bSquare || sumOfBAndCSquare == aSquare )
      {
         rightTraingleCheck = true;
      }
      
      // Calculating sums
      sumAB = a + b;
      sumAC = a + c;
      sumBC = b + c;
      
      // Checking whether the values entered do indeed form a triangle
      if ( sumAB > c && sumAC > b && sumBC > a)
      {
         // Calculation
         s = ( a + b + c) / 2;
         x = ( ( s) * ( s - a) * ( s - b) * ( s - c));
         area = Math.sqrt(x); 
         totalNumberOfFlowers = (int)( area * 17);
         
         // Output
         System.out.print( "Total number of flowers is ");
         System.out.println( totalNumberOfFlowers);
         
         if ( rightTraingleCheck )
         {
            System.out.println ( "The triangle is right.");
         }  
      }
      else
      {
         // Error message
         System.out.println( "The values are invalid. They do not form a triangle.");
      }
   }
}