import java.util.*;
public class leapyear 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the year");
        int year = sc.nextInt();

        if (year%4 == 0)
        {
            if (year%100 == 0)
            {
                if (year%400 == 0)
                {
                    System.out.println("Leap year");
                }
                else 
                {
                    System.out.println("Not a leap year");
                }
            }
            else 
            {
                System.out.println("Leap Year");
            }
        }
        else
        {
            System.out.println("Not a leap year");
        }
    }
}
