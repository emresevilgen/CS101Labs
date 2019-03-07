import java.util.Scanner;

/**
 * Print a pattern
 * @author Munib Emre Sevilgen
 * @version 1.00 2017-10-31
 */ 

public class Lab05a
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // constants

      // variables
      int width;
      int height;
      int wallThickness;
      boolean inputCheck;
      char respond;
      int numberOfSpacesInLine;
      int numberOfStarsInLine;
      int sideLenght;
      int triangleLineNumber;
      
      // program code
      width = 0;
      height = 0;
      wallThickness = 0;
      
      // Respond check 
      do {
         do {

            // Input
            System.out.print( "Enter width, height & thickness: ");
            width = scan.nextInt();
            height = scan.nextInt();
            wallThickness = scan.nextInt();
            
            // Input Check
            inputCheck = true;
                        
            if ( width <= 0 || height <= 0 || wallThickness <= 0 ) {
               inputCheck = false;
               System.out.println( "Error: all values must be positive!");
            }
            if ( ( width % 2) != 1 || ( height % 2) != 1 || ( wallThickness % 2) != 1) {
               inputCheck = false;
               System.out.println( "Error: all values must be odd!");
            }
         }
         while ( !inputCheck);
         
         sideLenght = width - ( wallThickness * 2);
         triangleLineNumber = (sideLenght + 1) / 2;
         
         if ((height - ( wallThickness * 2)) * 2 - 1 < sideLenght) {
            sideLenght = (height - ( wallThickness * 2)) * 2 - 1;
            triangleLineNumber = (sideLenght + 1) / 2; 
         }
         // Print "No hole" message
         if ( sideLenght <= 0) {
            System.out.println( "Oops... no triangle!");
         }
         else {
            for( int k = 0; k < height; k++) {
               
               // Print the lines which are out of the triangle
               if( ( k < ( height - triangleLineNumber) / 2 || ( k >= ( height + triangleLineNumber) / 2))) {
                  for ( int i = 0; i < width; i++) {
                     System.out.print( "*");
                  }
                  System.out.println();
               }
               
               // Print the lines which are in the triangle
               else {
                  numberOfSpacesInLine = 2 * (k - ( height - triangleLineNumber) / 2) + 1;
                  numberOfStarsInLine = (width - numberOfSpacesInLine) / 2;
                  for (int i = 0; i < numberOfStarsInLine; i ++) {
                     System.out.print( "*"); 
                  }
                  for (int i = 0; i < numberOfSpacesInLine; i++) {
                     System.out.print( " ");
                  }
                  for (int i = 0; i < numberOfStarsInLine; i ++) {
                     System.out.print( "*");
                     
                  }
                  System.out.println();
               }
            }
         }
         
         // Ask the user if they wish to create another pattern
         System.out.print("Do you want to create another pattern? (If you want, please enter \"Y\" or \"y\")");
         respond = scan.next().charAt(0);
      }
      while( respond == 'Y' || respond == 'y' );
      
      // Print "Goodbye" message
      System.out.println("Goodbye...");
   }
   
}