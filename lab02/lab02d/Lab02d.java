import java.util.Scanner;
/**
 * Computes the maximum number of flowers that can be planted in a triangular-shaped garden
 * @author Munib Emre Sevilgen
 * @version 1.00 2017-10-10
 */
public class Lab02d
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
     double Area;
     int totalNumberOfFlowers; 
     
     // program code
     in = new Scanner( System.in);
     
     System.out.print("Please enter the first side: ");
     a = in.nextInt();
     
     System.out.print("Please enter the second side: ");
     b = in.nextInt();
     
     System.out.print("Please enter the third side: ");
     c = in.nextInt();
     
     s = (a + b + c)/2;
     x = ((s) * (s-a) * (s-b) * (s-c));
     Area = Math.sqrt(x);
     totalNumberOfFlowers = (int)(Area * 17);
     
     System.out.print("Total number of flowers is ");
     System.out.println(totalNumberOfFlowers);
        
  }
}