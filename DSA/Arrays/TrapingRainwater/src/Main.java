import java.util.*;
public class Main
{
    

    public static int trappedwater(int arr[])
    {
        int sum = 0;
        //int leftmax = arr[0];
        int leftmax[] = new int[arr.length];
        leftmax[0] = arr[0];

        //int rightmax = arr[arr.length-1];
        int rightmax[] = new int[arr.length];
        rightmax[arr.length-1] = arr[arr.length-1];

        for (int i = 1; i < arr.length ; i++)
        {
            leftmax[i] = Math.max(leftmax[i-1], arr[i]);
        }
        for (int i = arr.length-2; i>=0 ; i--)
        {
            rightmax[i] = Math.max(rightmax[i+1], arr[i]);
        }
        for (int i = 0; i < arr.length; i++)
        {
            int wtrlvl = 0;
            wtrlvl = Math.min(leftmax[i], rightmax[i]);
            int water = wtrlvl - arr[i];
            sum += water;
        }
        System.out.println("total water is " + sum);
        return sum;
    }
    public static void main(String[] args)
    {
        //
        int arr[] = {4, 2, 0, 6, 3, 2, 5};
        //int arr[] = {4, 2, 6};
        trappedwater(arr);
    }
}