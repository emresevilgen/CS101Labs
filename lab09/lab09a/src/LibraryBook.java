/**
 * Includes methods for loaning a book
 * @author Munib Emre Sevilgen
 * @version 1.00 2017-12-12
 */ 
public class LibraryBook
{   
   // properties
   private String title;
   private String author;
   private String dueDate;
   private String studentName;
   private int timesLoaned;
   
   // constructors
   public LibraryBook(String title, String author)
   {
      this.title = title;
      this.author = author;
      this.studentName = "";
      this.dueDate = "";
      this.timesLoaned = 0;
   }
   public LibraryBook( String title, String author, int timesLoaned)
   {
      this.title = title;
      this.author = author;
      this.studentName = "";
      this.dueDate = "";
      this.timesLoaned = timesLoaned;
   }
   public LibraryBook( String title, String author, String dueDate, int timesLoaned)
   {
      this.title = title;
      this.author = author;
      this.dueDate = dueDate;
      this.studentName = "";
      this.timesLoaned = timesLoaned;
   }
   public LibraryBook( String title, String author, String studentName)
   {
      this.title = title;
      this.author = author;
      this.dueDate = "";
      this.timesLoaned = 0;
      this.studentName = studentName;
   }
   public LibraryBook( LibraryBook book)
   {
      this.title = book.title;
      this.author = book.author;
      this.dueDate = book.dueDate;
      this.timesLoaned = book.timesLoaned;
      this.studentName = studentName;
   }
   // methods 
   
   /**
    * Returns string
    * @return the string to print
    */
   public String toString()
   {
      if ( !studentName.equals( "")) {
         return "Title: " + title + "   " + "Author: " + author + "   " + "   " + "Times Loaned: " + timesLoaned + "   " + "Student Name: " + studentName;
      }
      if ( dueDate.equals( "") ) {
         return "Title: " + title + "   " + "Author: " + author + "   " + "Times Loaned: " + timesLoaned + "   " + "It's free";
      }
      return "Title: " + title + "   " + "Author: " + author + "   " + "Due Date: " + dueDate + "   " + "Times Loaned: " + timesLoaned;
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
   
   /**
    * Gives boolean on whether or not the books are the same looking at the title and author.
    * @param test object that will be compared
    * @return whether or not the books are the same
    */
   public boolean equals( LibraryBook test)
   {
      return ( this.title.equals( test.title) && this.author.equals( test.author));
   }
   
   /**
    * Gives boolean on whether or not the books are the same looking at the title.
    * @param test object that will be compared
    * @return whether or not the books are the same
    */
   public boolean hasSameTitle( LibraryBook test)
   {
      return ( this.title.equals( test.title));
   }
   
   /**
    * Gives boolean on whether or not the books are the same looking at the author.
    * @param test object that will be compared
    * @return whether or not the books are the same
    */
   public boolean hasSameAuthor( LibraryBook test)
   { 
      return ( this.author.equals( test.author));
   }
   
   /**
    * Returns title
    * @return title
    */
   public String getTitle()
   {
      return title;
   }
   
   /**
    * Returns author
    * @return author
    */
   public String getAuthor()
   {
      return author;
   }
   
   /**
    * Changes the student name
    * @param studentName the name that will be changed
    */
   public void changeStudentName( String studentName )
   {
      this.studentName = studentName;
   }
}