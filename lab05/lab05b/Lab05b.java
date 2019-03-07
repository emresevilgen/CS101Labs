import java.util.Scanner;

/**
 * Generate a neatly laid out table 
 * @author Munib Emre Sevilgen
 * @version 1.00 2017-10-31
 */ 
public class Lab05b
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants
      final int COLUMN_WIDTH = 6;
      
      // variables
      int row;
      int col;
      int countOfRow;
      int countOfCol;
      int countOfSpace;
      int product;
      int cellNumber;
      int decimalPlacesOfRowNumber;
      int decimalPlacesOfColNumber;
      int decimalPlacesOfProductNumber;
      int decimalPlacesOfCellNumber;
      
      // program code 
      System.out.print( "Please enter the number of rows and columns: ");
      row = scan.nextInt();
      col = scan.nextInt();
      
      // First part
      System.out.println( "First Part");

      for (countOfRow = 1; countOfRow <= row; countOfRow++ ) {
         for (countOfCol = 1; countOfCol <= col; countOfCol++) {

            // Calculate decimal places
            decimalPlacesOfRowNumber = 1; 
            for ( int k = 1; ( countOfRow / k) > 9; k = k * 10){               
               decimalPlacesOfRowNumber++;         
            } 
            decimalPlacesOfColNumber = 1;
            for ( int k = 1; ( countOfCol / k) > 9; k = k * 10){               
               decimalPlacesOfColNumber++;         
            }
            
            // Calculate number of space and print them
            countOfSpace = COLUMN_WIDTH - decimalPlacesOfColNumber - decimalPlacesOfRowNumber - 1;
            while ( countOfSpace > 0 ) {
               System.out.print( " ");
               countOfSpace--;
            }
            
            // Output
            System.out.print( countOfRow + "," + countOfCol);
         }
         countOfCol = 0;
         System.out.println();
      }
      
      // Second part
      System.out.println( "\nSecond Part");
      product = 0;
      
      for (countOfRow = 1; countOfRow <= row; countOfRow++ ) {
         
         for (countOfCol = 1; countOfCol <= col; countOfCol++) {
            
            // Calculate the product and decimal place
            product = countOfRow + countOfCol;
            decimalPlacesOfProductNumber = 1; 
            for ( int k = 1; ( product / k) > 9; k = k * 10){               
               decimalPlacesOfProductNumber++;         
            } 
            
            // Calculate number of spaces and print them 
            countOfSpace = COLUMN_WIDTH - decimalPlacesOfProductNumber;
            while ( countOfSpace > 0 ) {
               System.out.print( " ");
               countOfSpace--;   
            }
            
            // Output
            System.out.print( product);
         }
         countOfCol = 0;
         System.out.println();
      }
      
      // Third part
      System.out.println( "\nThird Part");
      cellNumber = 0;
      
      for (countOfRow = 0; countOfRow < row; countOfRow++ ) {
         for (countOfCol = 0; countOfCol < col; countOfCol++) {
            
            // Calculate cell number and decimal place
            cellNumber = countOfRow * col + countOfCol;
            decimalPlacesOfCellNumber = 1; 
            for ( int k = 1; ( cellNumber / k) > 9; k = k * 10){               
               decimalPlacesOfCellNumber++;         
            } 
            
            // Calculate number of spaces and print them
            countOfSpace = COLUMN_WIDTH - decimalPlacesOfCellNumber;
            while (countOfSpace > 0 ) {
               System.out.print( " ");
               countOfSpace--;
            }
           
            // Output
            System.out.print( cellNumber);
         }
         System.out.println();
      }
      
      // Fourth part
      System.out.println( "\nFourth Part");
      countOfCol = 0;
      for (countOfRow = 1; countOfRow <= row; countOfRow++ ) {
         countOfCol++;
         
         // Calculate decimal place of row number
         decimalPlacesOfRowNumber = 1; 
         for ( int k = 1; ( countOfRow / k) > 9; k = k * 10){               
            decimalPlacesOfRowNumber++;         
         } 
         
         // Calculate number of spaces and print them
         countOfSpace = COLUMN_WIDTH - decimalPlacesOfRowNumber;
         while ( countOfSpace > 0 ) {
            System.out.print( " ");
            countOfSpace--;   
         }
         
         // Print row number
         System.out.print( countOfRow);

         // Calculate number of spaces and print "-" with spaces
         while ( countOfCol < col ) {
            countOfCol++;
            countOfSpace = COLUMN_WIDTH - 1;
            while ( countOfSpace > 0 ) {
               System.out.print( " ");
               countOfSpace--;   
            }
            System.out.print( "-");
         }
         countOfCol = 0;
         System.out.println();
      }
   }
}