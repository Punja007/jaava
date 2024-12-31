import java.util.Arrays;

public class ques 
{
    public static boolean anagram(String str1, String str2)
    {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        char[] st1 = str1.toCharArray();
        char[] st2 = str2.toCharArray();

        Arrays.sort(st1);
        Arrays.sort(st2);

        if(Arrays.equals(st1, st2))
        {
            return true;
        }
        else
        {
            return false;
        }

    }


    public static int count(String str)
    {
        int cnt = 0;
        for (int i = 0 ; i < str.length()-1 ; i++)
        {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
            {
                cnt++;
            } 
        }
        return cnt;
    }

    public static void main (String args[])
    {
        // String str = "My Favourite Team Is Mumbai Indians";

        // System.out.println(count(str));

        System.out.println((anagram("race", "car")));
    }
}
