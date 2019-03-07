import java.util.Scanner;

/**
 * While tasks
 * @author Munib Emre Sevilgen
 * @version 1.00 2017-10-24
 */ 
public class Lab04a
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // constants
      
      // variables
      int n;
      int count;
      int countValuesInLine;
      int squareOfValue;
      double oneOverValue;
      
      // program code
      System.out.print("Enter a positive integer value: ");
      n = scan.nextInt();    
      if( n > 0 ){
         
         // First part
         System.out.println( "\n" + "\n" + "First Part" );
         count = 1;
         while ( count < n )
         {
            System.out.print( count + " ");
            count++;
         } 
         
         // Second part
         System.out.println( "\n" + "\n" + "Second Part");
         count = 1;
         countValuesInLine = 0;
         while ( count < n )
         {
            if ( countValuesInLine == 5 ){
               countValuesInLine = 0;
               System.out.println();
            }
            System.out.print(count + " ");
            count++;
            countValuesInLine++;
         }
         
         // Third part
         System.out.println( "\n" + "\n" + "Third Part");
         count = n;
         while ( count >= 0 )
         {
            System.out.print( count + " ");
            count--;
         } 

         // Fourth part
         System.out.println( "\n" + "\n" + "Fourth Part");
         count = -n;
         while ( count <= n )
         {
            if ( count % 2 == 0 ){
               System.out.print( count + " ");
            }
            count++;
         } 

         // Fifth part
         System.out.println( "\n" + "\n" + "Fifth Part");
         count = 0;
         countValuesInLine = 0;
         while ( count <= n )
         {
            if ( count % 2 == 0 ){
               squareOfValue = count * count;
               if ( countValuesInLine == 5 ){
                  countValuesInLine = 0;
                  System.out.println();
               }
                  System.out.print( squareOfValue + " ");
                  countValuesInLine++;
               }
            count++;
         }
         
         // Sixth part
         System.out.println("\n" + "\n" + "Sixth Part");
         count = n;
         countValuesInLine = 0;
         while ( count >= 3 )
         {
            if ( ( count % 3 == 0 && count % 4 != 0) ||  ( count % 4 == 0 && count % 3 != 0) ){
               if ( countValuesInLine == 5 ){
                  System.out.println();
                  countValuesInLine = 0;
               }
               System.out.print(+ count + " ");
               countValuesInLine++;
            }
            count--;
         }
         
         // Seventh part
         System.out.println( "\n" + "\n" + "Seventh Part");
         count = 2;
         while ( count <= n )
         {
            if ( n % count == 0 ){
               System.out.print( count + " ");
            }
            count++;
         }
         
         // Eighth part
         System.out.println( "\n" + "\n" + "Eighth Part");
         count = n;
         while ( count >= 1 )
         {
            oneOverValue = (double) 1 / count;
            if ( oneOverValue > 0.01 ){
               System.out.printf( "%.2f", oneOverValue);
               System.out.print(" ");
            }
            count--;
         }
      }
      else {
         System.out.println("Please, enter a positive value.");
      } 
   }
}