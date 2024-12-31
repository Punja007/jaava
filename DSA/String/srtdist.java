import java.lang.*;

public class srtdist
{
    public static void main(String args[])
    {
        String path = "WNEESENNNEE";
        int Y = 0;
        int X = 0;

        for(int i = 0; i < path.length();i++)
        {
            if(path.charAt(i) == 'N')
            {
                Y += 1;
            }

            if(path.charAt(i) == 'S')
            {
                Y -= 1;
            }

            if(path.charAt(i) == 'E')
            {
                X += 1;
            }

            if(path.charAt(i) == 'W')
            {
                X -= 1;
            }
        } 
        System.out.println(X + " , " + Y);
        System.out.println((Math.sqrt(X*X +Y*Y)));

    }
}