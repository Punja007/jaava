import java.util.*;
public class While
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        /*
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int cnt = 1;
        int sum = 0;
        while (cnt <= n)
        {
            sum = (sum + cnt);
            cnt++;
        }
        System.out.println(sum);
        */

        //print Reverse of number
         int no = sc.nextInt();
         int m;
         while (no > 0)
         {
            m = no%10;
            no = no/10;
            System.out.print(m);
         }



         //Reverse of a number IN Variable
/*
         System.out.println("enter a number to reverse");
        
         int num = sc.nextInt();
         int rev = 0;
         while (num>0)
         {
             int ld = num%10;
             num = num/10;
             rev = (rev * 10) + ld;
         }
         System.out.println(rev);
*/
    }
}
