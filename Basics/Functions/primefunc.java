
public class primefunc 
{
    public static boolean isprime(int n)
    {     
        boolean prime = true;
            for (int i = 2; i <= Math.sqrt(n) ; i++)
            {
                if (n%i ==0)
                {
                   return false;
                }
            }
            return true;
    }  

    public static void printprime(int j)
    {
        for (int i =2 ; i <= j ; i++)
        {
            if (isprime(i) == true)
            {
                System.out.println(i);
            }

        }
    }
    public static void main(String args[])
    {
        printprime(20);
    }
}
