public class swap 
{
    public static void swap(int a , int b)
    {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("value of a is now " + a);
        System.out.println("value of b is now " + b);
    }
    public static void main(String args[])
    {
        int a = 5;
        int b = 10;
        swap(a, b);
    }
}
