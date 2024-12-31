import java.util.*;
public class itc
{
       public static void main(String args[])
       {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter your income in Lakhs");

            double income = sc.nextDouble();

            if(income <= 5)
            {
                System.out.print("your income is ");
                System.out.print( income);
                System.out.print(" Lakhs");
            }

            else if(income > 5 && income <10)
            {
                double tax = 0.20 * income;

                System.out.print("your income is ");
                System.out.print( income - tax);
                System.out.print(" Lakhs");
            }

            else 
            {
                double tax = 0.30 * income;

                System.out.print("your income is ");
                System.out.print( income - tax);
                System.out.print(" Lakhs");
            }


       }
}
