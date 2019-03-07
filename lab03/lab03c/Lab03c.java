import java.util.Scanner;
import java.nio.file.*;   
import java.io.*;

/**
 * Create a webpage
 * @author Munib Emre Sevilgen
 * @version 1.00 2017-10-17
 */ 
public class Lab03c
{
   public static void main( String[] args) throws FileNotFoundException
   {
 
      // constants
      final String DOC_TYPE = "<!DOCTYPE html>";
      final String HTML = "<html>";
      final String HEAD_STARTS = "<head>";
      final String HEAD_ENDS = "</head>"; 
      final String TITLE_STARTS = "<title>";
      final String TITLE_ENDS = "</title>"; 
      final String HOME_PAGE = "'s Home Page";
      final String BODY_STARTS = "<body>";
      final String BODY_ENDS = "</body>"; 
      final String HR = "<hr>";
      final String HL = "<h1>";
      final String P_STARTS = "<p>";
      final String P_ENDS = "</p>"; 
      final String AGE_TEXT = "Age: ";
      final String SALARY_TEXT = "Net Salary: ";
      final String TAX_RATE_TEXT_STARTS = " (Tax Rate: ";
      final String TAX_RATE_TEXT_ENDS = ")";
      final String COMMENTS_TEXT = "Comments: ";
      final String IMG_TEXT_STARTS = "<img src=\"";
      final String IMG_TEXT_ENDS = ".jpg\">";
      final double TAX_RATE_5 = 5;
      final double TAX_RATE_15 = 15;
      final double TAX_RATE_25 = 25;
      final double SUBSTRACT_AMOUNT = 100;
      final int MAXIMUM_SALARY = 10000;
      
      // variables
      int age;
      double grossSalary;
      double netSalary;
      String name;
      String comments;
      int taxRate;
      boolean ageCheck;
      boolean salaryCheck;
      
      // program code
      Scanner scan = new Scanner( System.in);
      PrintStream originalStdOut = System.out;
      ageCheck = false;
      salaryCheck = false;
      
      // Get informations from the user
      
      System.out.println( "Enter the new employee's name: ");
      name = scan.nextLine();
      System.out.println( "Enter the new employee's age: ");
      age = scan.nextInt();
      System.out.println( "Enter the new employee's salary: ");
      grossSalary = scan.nextDouble();
      scan.nextLine();
      System.out.println( "Enter the comments about new employee : ");
      comments = scan.nextLine();
      
      // Age and salary check
      if ( age > 0)
         ageCheck = true;
      
      if ( grossSalary > 100 && grossSalary < MAXIMUM_SALARY)
         salaryCheck = true;
      
      if ( ageCheck && salaryCheck)
      {
         // Tax rate decision
         if ( grossSalary > 5000)
         {
            netSalary = ( grossSalary - SUBSTRACT_AMOUNT) * ( ( 100 - TAX_RATE_25) / 100);
            taxRate = (int) TAX_RATE_25;
         }
         else if ( grossSalary < 1000)
         {
            netSalary = ( grossSalary - SUBSTRACT_AMOUNT) * ( ( 100 - TAX_RATE_5) / 100);
            taxRate = (int) TAX_RATE_5;
         }
         else
         {
            netSalary = ( grossSalary - SUBSTRACT_AMOUNT) * ( ( 100 - TAX_RATE_15) / 100);
            taxRate = (int) TAX_RATE_15;
         }
         System.setOut( new PrintStream( name + ".htm" ) );
         
         // Output
         System.out.println( DOC_TYPE);
         System.out.println( HTML);
         System.out.println( HEAD_STARTS);
         System.out.println( TITLE_STARTS + name  + HOME_PAGE + TITLE_ENDS);
         System.out.println( HEAD_ENDS);
         System.out.println( BODY_STARTS);
         System.out.println( HR);
         
         if ( Files.exists( Paths.get( name + ".jpg")))  // Image check
            System.out.println( IMG_TEXT_STARTS + name + IMG_TEXT_ENDS);
         
         System.out.println( HL + name + HL);
         System.out.println( P_STARTS + AGE_TEXT + age + P_ENDS);
         System.out.println( P_STARTS + SALARY_TEXT + netSalary + TAX_RATE_TEXT_STARTS + taxRate + TAX_RATE_TEXT_ENDS + P_ENDS);
         System.out.println( P_STARTS + COMMENTS_TEXT + comments + P_ENDS);
         System.out.println( HR);
         System.out.println( BODY_ENDS);
         System.out.println( HTML);
         
         System.out.close();
         System.setOut( originalStdOut);
         System.out.println( "Webpage created.");
      }
      
      // Error messages
      if ( !ageCheck)
         System.out.println( "Please enter a positive value for the age.");
      if ( !salaryCheck)
         System.out.println( "Please enter a value that is between 100 and " + MAXIMUM_SALARY + " inclusive for the salary.");
      
   }

}