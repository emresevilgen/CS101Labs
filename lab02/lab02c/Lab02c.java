import java.util.Scanner;
/**
 * Calculation of two numbers
 * @author Munib Emre Sevilgen
 * @version 1.00 2017-10-10
 */
public class Lab02c
{
  public static void main (String[] args)
  {
     // variables
     Scanner in;
     int firstNumber;
     int secondNumber;
     int sum;
     int difference;
     int product;
     int division;
     int max;
     int min;
     
     // program code
     in = new Scanner(System.in);
     
     System.out.print("Please enter the first number: ");
     firstNumber = in.nextInt();
                      
     System.out.print("Please enter the second number: ");
     secondNumber = in.nextInt();
     
     sum = firstNumber + secondNumber;
     
     if ( firstNumber > secondNumber)
     {
        difference = firstNumber - secondNumber;
     }
     else
     {
        difference = secondNumber - firstNumber;
     }
     
     product = firstNumber * secondNumber;
         
     System.out.print("Sum of these numbers is ");
     System.out.println(sum);
     
     System.out.print("Difference of these numbers is ");
     System.out.println(difference);  
     
     System.out.print("Product of these numbers is ");
     System.out.println(product); 
     
     
     if (secondNumber != 0)
     {
     division = (int)(firstNumber)/(secondNumber);
     System.out.print("The result of dividing these numbers is ");
     System.out.print(division);
     System.out.println();
     }
     
     else
     {
     System.out.println("You entered 0 for3 the second number so the program cannot calculate the division.");
     }
     
     max = Math.max(firstNumber, secondNumber);
     System.out.print("Maximum of these numbers is ");
     System.out.println(max);
     
     min = Math.min(firstNumber, secondNumber);
     System.out.print("Minimum of these numbers is ");
     System.out.println(min);
      
  }
}