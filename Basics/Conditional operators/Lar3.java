import java.util.*;
public class Lar3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter A");
        int a = sc.nextInt();

        System.out.println("Enter B");
        int b = sc.nextInt();

        System.out.println("Enter C");
        int c = sc.nextInt();

        if ( (a > b) && (a > c))
        {
            System.out.println("the greatest integer is A and its value is ");
            System.out.println(a);
        }

        else if ((b > a) && (b > c))
        {
            System.out.println("the greatest integer is B and its value is ");
            System.out.println(b);
        }

        else 
        {
            System.out.println("the greatest integer is C and its value is ");
            System.out.println(c);
        }
        


        Terniary operator

        System.out.println("Enter your marks");
        int marks = sc.nextInt();

        String Result = (marks >= 33) ? "Pass" : "Fail";

        System.out.println(Result);

        
    }
}
