import java.util.*;
public class prime
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int div = 2;
        boolean isprime = true;

      for (div = 2; div <= Math.sqrt(n) ; div++)
      {
        if (n%div == 0)
        {
            isprime = false;
            break;
        }
      }
      if (isprime == true)
      {
        System.out.println("Prime  number");
      }
       else
      {
        System.out.println("Not  a prime  number");
      }

    }   
}
