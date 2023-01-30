import java.util.*;


public class KrishnaCalculator 
{

   public static void main(String[] args)
   {
   //declare variables
   int num1=0;
   int num2=0;
   char operator;
   double answer = 0.0;
   
   
   //using scanner to get user input
   Scanner scanObject = new Scanner(System.in);
   
   //asking the user to enter numbers
   System.out.println("Enter 1st number: ");
   num1 = scanObject.nextInt();
   System.out.println("Enter 2nd number: ");
   num2 = scanObject.nextInt();
   //asks the user what operation they want to do
   System.out.println("What operation?");
   operator = scanObject.next().charAt(0);
   
   
   switch (operator) {
        case '+': answer = num1 + num2;
                  break;
        case '-': answer = num1 - num2;
                  break;
        case '*': answer = num1 * num2;
                  break;
        case '/': answer = num1 / num2;
                  break;
                  
        }
        
        System.out.println(num1+" "+operator+" "+num2+" = "+answer);
        
        
         
      
   
   
   
   
   }
   
}