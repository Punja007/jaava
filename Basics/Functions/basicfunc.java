public class basicfunc
{
    public static int fact(int j)
    {
        int fac = 1;
        for (int i =1; i <= j ; i++)
        {
            fac = fac * i;
        }
        return fac;
    }

    public static int comb(int n ,  int r)
    {
        int fn = fact(n);
        int fr = fact(r);
        int fnr = fact(n-r);
        int com = (fn / (fr * fnr));
        return com;
    }
    public static void main(String args[])
    {
        System.out.println(comb(10 , 2));
    }
}
