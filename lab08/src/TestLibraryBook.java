import java.util.Scanner;
/**
 * Testing LibraryBook
 * @author Munib Emre Sevilgen
 * @version 1.00 2017-12-05
 */ 

public class TestLibraryBook
{ 
   public static void main (String[] args)
   {
      // constants
      
      // variables
      LibraryBook testBook;
      LibraryBook testBook2;
      LibraryBook testBook3 ;
      LibraryBook testBook4 ;
           
      // program code
      
      // Initilize the book title, authors name and create LibraryBook objects
      testBook = new LibraryBook( "Tutunamayanlar" , "Oguz Atay" );
      testBook2 = new LibraryBook ( "Yeraltindan Notlar", "Dostoyevski" );
      testBook3 = testBook;
      testBook4 = new LibraryBook( testBook2);
      
      // Loan books
      testBook.loanBook( "1");
      testBook2.loanBook( "2");
      testBook3.loanBook( "3");
      testBook4.loanBook( "4");
      
      // Print books      
      System.out.println( testBook.toString());
      System.out.println( testBook2.toString());
      System.out.println( testBook3.toString());
      System.out.println( testBook4.toString() + "\n");
      
      
      // Two references to one object

      if ( testBook.equals( testBook3))
         System.out.println( "Two references to one object compared with .equals gives true");
      else
         System.out.println( "Two references to one object compared with .equals gives false");
      if ( testBook == testBook3)
         System.out.println( "Two references to one object compared with == gives true");
      else
         System.out.println( "Two references to one object compared with == gives false");
      
      // Two references to two different objects with different properties
      if ( testBook.equals( testBook2))
         System.out.println( "Two references to two different objects with different properties compared with .equals gives true");
      else
         System.out.println( "Two references to two different objects with different properties compared with .equals gives false");
      if (testBook == testBook2)
         System.out.println( "Two references to two different objects with different properties compared with == gives true");
      else
         System.out.println( "Two references to two different objects with different properties compared with == gives false");
      
      // Two references to two individual objects with identical relevant properties
      if ( testBook2.equals( testBook4))
         System.out.println("Two references to two individual objects with identical relevant properties compared with .equals gives true");
      else
         System.out.println("Two references to two individual objects with identical relevant properties compared with .equals gives false");
      
      if ( testBook2 == testBook4)
         System.out.println( "Two references to two individual objects with identical relevant properties compared with == gives true");
      else
         System.out.println( "Two references to two individual objects with identical relevant properties compared with == gives false");   
   }
}