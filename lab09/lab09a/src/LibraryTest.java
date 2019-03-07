import java.util.Scanner;

/**
 * Testing methods of Library class
 * @author Munib Emre Sevilgen
 * @version 1.00 2017-12-12
 */ 

public class LibraryTest {
   public static void main ( String args[] )
   {
      // constants
      
      // variables
      Library library = new Library();
      int selection; 
      int selection2;
      String title;
      String title2;
      String author;
      String dueDate;
      String studentName;
      Scanner scan = new Scanner ( System.in);
      
      // program code
      
      do {
         System.out.println( "Choose an option:( 1, 2, 3, 4)" + "\n" + "1)Show" + 
                            "\n" + "2)Find" + "\n" + "3)Add" + "\n" + "4)Create SubLibrary" + "\n" + "5)Exit" + "\n");
         selection = scan.nextInt();
         
         // Show selection;
         if ( selection == 1)
            System.out.println( library.toString());
         
         // Find selection
         else if ( selection == 2)
         { 
            // Scan the book title
            System.out.print( "Enter the title: ");
            title = scan.nextLine();
            title = scan.nextLine();
            
            if ( library.findByTitle( title) != null) { 
               System.out.println( library.findByTitle( title));
               do {
                  System.out.println( "Choose the option that you want to do: ( 1, 2, 3, 4) " + 
                                     "\n" + "1)Loan the book" + "\n" + "2)Return the book" + "\n" + 
                                     "3)Remove the book" + "\n" + "4)Read the book at Library" + "\n" + "5)Return to Main Menu");
                  selection2 = scan.nextInt(); 
                  
                  // Loan Selection
                  if ( selection2 == 1) {
                     if (library.findByTitle( title).onLoan()) {
                        System.out.print( "Please enter the due date: ");
                        dueDate = scan.next();
                        library.findByTitle( title).loanBook(dueDate);
                        System.out.println( "The book is successfully loaned.");
                     }
                     else 
                        System.out.println( "The book is already loaned.");
                  }
                  
                  // Return selection
                  else if ( selection2 == 2) {
                      if (library.findByTitle( title).returnBook()) {
                         System.out.println( "The book is successfully returned.");
                         library.findByTitle( title).changeStudentName( "");
                      }
                      else {
                         System.out.println( "The book is already returned.");
                      }
                  }
                  
                  // Remove selection
                  else if ( selection2 == 3) {
                     library.remove( library.findByTitle( title));
                     System.out.println( "The book is successfully removed.");
                     selection2 = 4;
                  }
                  // Read the book at Library selection
                  else if ( selection2 == 4) {
                     System.out.print( "Enter the student name: ");
                     studentName = scan.nextLine();
                     studentName = scan.nextLine();
                     library.findByTitle( title).changeStudentName( studentName);
                     library.findByTitle( title).loanBook( "None");
                  }
                  // Invalid selection
                  else if ( selection2 != 5)
                     System.out.println( "You entered an invalid number.");
               } while ( selection2 != 5);
               // Return to main menu selection
            }
            
            // When not exists
            else 
               System.out.println( "Book does not exist in the library");
         }
         
         // Add selection
         else if ( selection == 3)
         {
            System.out.print( "Enter the title: ");
            title = scan.nextLine();
            title = scan.nextLine();
            System.out.print( "Enter the author: ");
            author = scan.nextLine();
            library.add(title, author);
            System.out.println( "The book is successfully added.");
         }
         else if ( selection == 4) {
            System.out.print( "Enter the first title: ");
            title = scan.nextLine();
            title = scan.nextLine();
            System.out.print( "Enter the second title: ");
            title2 = scan.nextLine();
            
            System.out.println( library.returnBetweenTwoBook(title, title2).toString() );
         }
         // Invalid selection
         else if ( selection != 5)
            System.out.println( "You entered an invalid number.");
      } while( selection != 5);
      //Closing the program if input is exit selection
   }
}