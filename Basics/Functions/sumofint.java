public class sumofint 
{
    
    public static int sumOfInt(int n)
    {
        int ld = 0;
        int sum = 0;
        while (n > 0)
        {
            ld = n % 10;
            sum =  sum + ld;
            n = n /10;
        }
        
        return sum;
    }
    public static void main(String args[])
    {
        System.out.println(sumOfInt(12345));
    }
}
