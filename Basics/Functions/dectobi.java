public class dectobi 
{
    public static void decToBi(int n)
    {
        int numb = n;
        int pow = 0;
        int bi = 0;
        int rem;
        while (n > 0)
        {
            rem = n%2;
            n = n/2;
            bi = bi + (rem * (int) Math.pow(10, pow));
            pow++;
        }
        System.out.println("Binary form of " + numb + " is " + bi);
    }

    public static void main(String args[])
    {
        decToBi(7);
    }
}
