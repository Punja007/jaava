import java.util.*;
public class calc 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter A");
         int a = sc.nextInt();
        System.out.println("Enter B");
         int b = sc.nextInt();

        System.out.println("Enter the operation");

        char op = sc.next().charAt(0);

        switch (op)
        {
            case '+' : System.out.println(a + b);
                break;
            case '-' : System.out.println(a - b);
                break;
            case '*' : System.out.println(a * b);
                break;
            case '/' : System.out.println(a / b);
                break;
           default : System.out.println("enter a valid operation");
        }
    }
}
