public class funcque1 
{
    public static float avg (float a, float b, float c)
    {
        float avg = (a + b + c)/3;
        return avg;
    }

    public static boolean isEven(int x)
    {
        if (x % 2 == 0)
        {
            return true;
        }
        return false;
    }

    public static void main(String args[])
    {
        int z = 20;
        // System.out.println(avg(1,2,4));
        if (isEven(z) == true)
        {
            System.out.println("Number is Even");
        }
        else
        {
            System.out.println("Number is Odd");
        }
    }
}
