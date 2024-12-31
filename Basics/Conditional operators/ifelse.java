import java.util.*;
public class ifelse
{
    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);

         

        int A = sc.nextInt();
        int B = sc.nextInt();

        if (A > B)
        {
            System.out.println("A is greater than B");
            System.out.println("value of A is " +A);
        }

        else if (A == B)
        {
            System.out.println("A is equal to B");
            System.out.println("value of A and B is " +A);
        }

        else 
        {
            System.out.println("B is greater than A");
            System.out.println("value of B is " +B);
        }
        

        int num = sc.nextInt();

        if (num%2 == 1)
        {
            System.out.println("Number entered is Odd");
        }

        else 
        {
            System.out.println("Number entered is Even");
        }
    }
}


