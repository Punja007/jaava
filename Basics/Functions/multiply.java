import java.util.*;
public class multiply
{
    public static int prod(int a , int b)
    {  
        return a*b;
    }
    public static int prod(int a, int b, int c)
    {
        return (a*b*c);
    }
    
    public static float prod(float  a, float  b)
    {
        return (a*b);
    }
    public static void  main(String args[])
    {
        Scanner sc = new Scanner(System.in);
/*
        System.out.println(prod("Enter A"));
        int a = sc.nextInt();
        System.out.println(prod("Enter B"));
        int b = sc.nextInt();
        System.out.println(prod("Enter C"));
        int c = sc.nextInt();
*/ 

        System.out.println(prod(5,2));
        System.out.println(prod(2,3,4));
        System.out.println(prod(2.5f,2.5f));
    }
}
