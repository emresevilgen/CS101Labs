/**
 * Includes methods for loaning a book
 * @author Munib Emre Sevilgen
 * @version 1.00 2017-11-28
 */ 
public class LibraryBook
{   
   // properties
   private String title;
   private String author;
   private String dueDate;
   private int timesLoaned;
   
   // constructors
   public LibraryBook(String title, String author)
   {
      this.title = title;
      this.author = author;
      this.dueDate = "";
      this.timesLoaned = 0;
   }
   
   public LibraryBook( String title, String author, String dueDate, int timesLoanes)
   {
      this.title = title;
      this.author = author;
      this.dueDate = dueDate;
      this.timesLoaned = timesLoanes;
   }
   // methods 
   
   /**
    * Returns string
    * @return the string to print
    */
   public String toString()
   {
      if ( dueDate.equals( "") ) {
         return "Title: " + title + "\n" + "Author: " + author + "\n" + "Times Loaned: " + timesLoaned + "\n" + "It's free.";
      }
      return "Title: " + title + "\n" + "Author: " + author + "\n" + "Due Date: " + dueDate +"\n" + "Times Loaned: " + timesLoaned;
   }
   
   // methods 
   /**
    * Returns true if book is loaned, returns false if book is already loaned
    * @param due the due date of the book
    * @return true if book is loaned, false if book is already loaned
    */
   public boolean loanBook( String due)
   { 
      if ( dueDate.equals( "")) {
         dueDate = due;
         timesLoaned++;
         return true;
      }
      return false;
   }
   
   /**
    * Returns true if book is returned, returns false if book is already free
    * @return true if book is returned, false if book is already free
    */
   public boolean returnBook()
   { 
      if ( dueDate.equals( "")) {
        return false;
      }
      dueDate = "";
      return true;
   }
   
   /**
    * Gives number of times loaned
    * @return times of loaned
    */
   public int getTimesLoaned()
   { 
      return timesLoaned;
   }
   
   /**
    * Gives boolean on whether or not the bookis loaned.
    * @return the loan check
    */
   public boolean onLoan()
   { 
      if ( dueDate.equals("")) {
         return true;
      }
      return false;  
   }
}