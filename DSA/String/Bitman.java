public class Bitman 
{
    public static void main(String args[])
    {
        int key = 6;
        int i = 1;

        if ((key & i) == i)
        {
            System.out.println("ODD");
        }
        else
        {
            System.out.println("EVEN");
        }
    }
}
