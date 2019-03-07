import java.util.ArrayList;
/**
 * Creates a library by array list
 * @author Munib Emre Sevilgen
 * @version 1.00 2017-12-12
 */ 

public class Library
{
   // properties
   ArrayList<LibraryBook>  booksInLibrary;
     
   // constructors
   public Library()
   {
      booksInLibrary = new ArrayList<LibraryBook>();
   }
   
   //methods
   
   /**
    * Returns true if there are no books in the library
    * @return whether or not the library is empty
    */
   public boolean isEmpty()
   { 
      return booksInLibrary.size() == 0;
   }
   
   /**
    * Returns a String representation of the library or no book error
    * @return String representation of the library or no book error
    */
   public String toString()
   {   
      if ( isEmpty())
         return ( "There is no book to show.");
      
      return booksInLibrary.toString();
   }
   
   /**
    * Adds a new book with the given title and author
    * @param title of the book
    * @param author of the book
    */
   public void add( String title, String author)
   {
      booksInLibrary.add( new LibraryBook( title, author));
   }
   
   
   /**
    * Removes the specified book from the library, returns false if book not in library
    * @param book that will be removed
    * @return false if the book not in library
    */
   public boolean remove( LibraryBook book)
   { 
      if ( findByTitle( book.getTitle()) == null) {
         return false;
      }
      int i;
      i = 0; 
      while ( i < booksInLibrary.size() ){
         if ( book.hasSameTitle( booksInLibrary.get(i))){
            booksInLibrary.remove(i);
            return true;
         }
      }
      return false;
   }
   
   
   /**
    * Returns the first book with the given title or null if no such book is found.
    * @param title that will be used for finding the book
    * @return the first book with the given title or null if no such book is found
    */
   public LibraryBook findByTitle( String title)
   { 
      LibraryBook book = new LibraryBook ( title, "");
      for (int i = 0; i < booksInLibrary.size(); i++){
         if ( book.hasSameTitle( booksInLibrary.get(i)))
                return booksInLibrary.get(i);
      }
      return null;
   }
   
    /**
    * Returns a new sublibrary with the given two titles
    * @param title1 title of the first book
    * @param title2 title of the second book
    * @return new sublibrary
    */
   public ArrayList<LibraryBook> returnBetweenTwoBook( String title1, String title2) {
      ArrayList<LibraryBook> newLibrary;
      LibraryBook book1;
      LibraryBook book2;
      int firstIndex;
      int lastIndex;
      
      newLibrary = new ArrayList<LibraryBook>();
      book1 = findByTitle( title1);
      book2 = findByTitle( title2);
      firstIndex = 0;
      lastIndex = 0;
      for (int i = 0; i < booksInLibrary.size(); i++){
         if ( book1.hasSameTitle( booksInLibrary.get(i)))
            firstIndex = i;
      }
      for (int i = 0; i < booksInLibrary.size(); i++){
         if ( book2.hasSameTitle( booksInLibrary.get(i))){
            if ( i >= firstIndex) {
               lastIndex = i;
            }
            else {
               lastIndex = firstIndex;
               firstIndex = i;
            }
         }
      }
      while( firstIndex <= lastIndex) {
         newLibrary.add( booksInLibrary.get(firstIndex));
         firstIndex++;
      }
      return newLibrary;
   }
   
}


