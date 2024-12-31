public class star 
{
    public static void main(String args[])
    {

/*
        for (int line = 1; line <= 5 ; line++)
        {
            for (int star = 1; star <= line ; star++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
*/

/*                 //INVERTED STAR PATTERN
        int n = 5;
        for (int line = 1; line <= n ; line++)
        {
            for (int star = 1; star <= (n - line + 1) ; star++)     //(stars = n - line + 1)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
*/

/*
int n = 5;
        for(int lines = 1; lines <= n ; lines++)
        {
            for (int i =1; i <= lines ; i++)
            {
            System.out.print(i);
            }
            System.out.println("");
        }
*/



        int m = 5;
        char ch = 'A';
        for (int line =1; line <= m ; line++)
        {
            for (int chars = 1;chars <= line ; chars++)
            {
                System.out.print(ch);
                ch++;
            }
            System.out.println("");
        }
    }
}
