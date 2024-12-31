import java.util.*;
public class palindrome 
{
    public static boolean isPalin(int n)
    {
        int ld;
        int rev = 0;
        int j = 0;
        int num = n;
        int numb = n;
        while(num > 0)
        {
            ld = num % 10;
            num = num/10;
            rev = rev + ld *(int) Math.pow(10, j);
            j++;
        }

        int palin = 0;
        int last = 0;
        int k = 0;
        while(rev > 0)
        {
            last = rev % 10;
            rev = rev / 10;
            palin = (palin * 10) + last;
            k++;
        }
        System.out.println(palin);

        if(palin == numb)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String args[])
    {
        if (isPalin(121) == true)
        {
            System.out.println("Number is Palindrome");
        }
        else
        {
            System.out.println("Number is Not a Palindrome");
        }
    }
}
