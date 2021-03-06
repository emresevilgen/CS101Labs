/**
 * Creates a library with four books
 * @author Munib Emre Sevilgen
 * @version 1.00 2017-12-05
 */ 

public class Library
{
   // properties
   private LibraryBook b1;
   private LibraryBook b2;
   private LibraryBook b3;
   private LibraryBook b4;
   
   
   // constructors
   public Library()
   {
      this.b1 = null;
      this.b2 = null;
      this.b3 = null;
      this.b4 = null;
   }
   
   //methods
   
   /**
    * Returns true if there are no books in the library
    * @return whether or not the library is empty
    */
   public boolean isEmpty()
   { 
      return ( b1 == null && b2 == null && b3 == null && b4 == null);
   }
   
   /**
    * Returns true if the library is full
    * @return whether or not the library is full
    */
   public boolean isFull()
   {
      return ( b1 == null || b2 == null || b3 == null ||  b4 == null);
   }
   
   /**
    * Returns a String representation of the library or no book error
    * @return String representation of the library or no book error
    */
   public String toString()
   {   
      if ( isEmpty())
         return ( "There is no book to show.");
      
      String result = "";
      if ( b1 != null)
         result = result + b1 + "\n";
      if ( b2 != null)
         result = result + b2 + "\n";
      if ( b3 != null)
         result = result + b3 + "\n";                    
      if ( b4 != null)
         result = result + b4 + "\n"; 
      return result;
   }
   
   /**
    * Adds a new book --with the given title and author-- to the first available (null) property
    * @param title of the book
    * @param author of the book
    */
   public void add( String title, String author)
   {
      if ( b1 == null)
         b1 = new LibraryBook( title, author);
      else if ( b2 == null )
         b2 = new LibraryBook( title, author);
      else if ( b3 == null)
         b3 = new LibraryBook( title, author);
      else if ( b4 == null)
         b4 = new LibraryBook( title, author);
   }
   
   
   /**
    * Removes the specified book from the library by setting the property to null, returns false if book not in library
    * @param book that will be removed
    * @return false if the book not in library
    */
   public boolean remove( LibraryBook book)
   { 
      // Check nulls
      if ( book.equals( b1))
         b1 = null;
      else if ( book.equals( b2))
         b2 = null;
      else if ( book.equals( b3))
         b3 = null;
      else if ( book.equals( b4))
         b4 = null;
      else 
         return false;
      return true;
   }
   
   
   /**
    * Returns the first book with the given title or null if no such book is found.
    * @param title that will be used for finding the book
    * @return the first book with the given title or null if no such book is found
    */
   public LibraryBook findByTitle( String title)
   { 
      if ( b1 != null && title.equals( b1.getTitle()))
         return b1;
      else if ( b2 != null && title.equals( b2.getTitle()))
         return b2;
      else if ( b3 != null && title.equals( b3.getTitle()))
         return b3;
      else if ( b4 != null && title.equals( b4.getTitle()))
         return b4;
      return null;
   }
   
}


