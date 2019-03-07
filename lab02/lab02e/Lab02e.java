import java.util.Scanner;

/**
 * Create the html code
 * @author Munib Emre Sevilgen
 * @version 1.00 2017-10-10
 */ 
public class Lab02e
{
   public static void main( String[] args)
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
      final String SALARY_TEXT = "Salary: ";
      final String COMMENTS_TEXT = "Comments: ";
      
      // variables
      Scanner in;
      int age;
      double salary;
      
      String name;
      String comments;
      
      // program code
      in = new Scanner( System.in);
      
      // System.out.println("Enter the new employee's name: ");
      name = in.nextLine();
      // System.out.println("Enter the new employee's age: ");
      age = in.nextInt();
      // System.out.println("Enter the new employee's salary: ");
      salary = in.nextDouble();
      in.nextLine();
      // System.out.println("Enter the comments about new employee : ");
      comments = in.nextLine();
      
      System.out.println(DOC_TYPE);
      System.out.println(HTML);
      System.out.println(HEAD_STARTS);
      System.out.println(TITLE_STARTS + name  + HOME_PAGE + TITLE_ENDS);
      System.out.println(HEAD_ENDS);
      System.out.println(BODY_STARTS);
      System.out.println(HR);
      System.out.println(HL + name + HL);
      System.out.println(P_STARTS + AGE_TEXT + age + P_ENDS);
      System.out.println(P_STARTS + SALARY_TEXT + salary + P_ENDS);
      System.out.println(P_STARTS + COMMENTS_TEXT + comments + P_ENDS);
      System.out.println(HR);
      System.out.println(BODY_ENDS);
      System.out.println(HTML);


     
   }

}