import java.util.*;
public class dowhile 
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in); 
/*
        int cnt = 1;
        do
        {
            System.out.println(cnt);
            cnt++;
        } while (cnt <= 10);
*/
        
        System.out.println("Enter a number not multiple of 10");
        do
        {
            int p = sc.nextInt();
            if (p%10 == 0)
            {
                continue;  //use break to end at multiple of 10
            }
            System.out.println(p);
        }while(true);
    }
}
