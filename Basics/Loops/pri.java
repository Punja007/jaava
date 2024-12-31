import java.util.*;
public class pri 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        boolean isPrime = true;

        for(int div = 2; div <= Math.sqrt(n) ; div++)
        {
            if (n%div == 0)
            {
                isPrime = false;
                break;
            }
            else 
            {
                isPrime = true;
                continue;
            }
        }
        if (isPrime == true)
        {
            System.out.println("Prime Number");
        }
        if (isPrime == false)
        {
            System.out.println("Not a Prime Number");
        }
    }
}
