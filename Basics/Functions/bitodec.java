import java.util.*;
public class bitodec 
{
    public static void biToDec(int bi)
    {
        int pr=0;
        int ld;
        int dec = 0;
        while (bi > 0)
        {
            ld = bi % 10;
            bi = bi/10;
            dec = dec +(int) (ld * Math.pow(2 , pr));
            pr++;
        }
        System.out.println(dec);
    }
    public static void main(String  args[])
    {
       biToDec(111);
    }
}
