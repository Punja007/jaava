import java.util.*;
public class For 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number");
        int n = sc.nextInt();
        int sum = 0;
        for (int i =1; i<=n ; i++)
        {
            sum = sum + i;
        }
        System.out.println(sum);
        

        //SQUARE PATTERN
/*
        for (int lines = 1; lines <= 4 ; lines++)
        {
            System.out.println("****");
        }
*/

    }
}
