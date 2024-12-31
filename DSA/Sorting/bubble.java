import java.util.*;
public class bubble 
{

    //SELECTION SORT
    public static void selection(int arr[])
    {
        for(int i = 0; i<arr.length-1; i++)
            {
                int min = i;
                for(int j = i+1; j < arr.length; j++)
                {
                    if (arr[j] < arr[min])
                    {
                        min = j;
                    }
                }
                //swap here
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
            for(int i = 0; i < arr.length; i++)
            {
                System.out.print(arr[i] + ",");
            }
    }

    //BUBBLE SORT
    public static void bubble(int arr[])
    {
        for (int i = 0; i < arr.length-1; i++)
        {
            for (int j = 0; j < arr.length-1-i; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + ",");
        }

    }

    //INSERTION SORT (I HAVE NO CUE HOW IS THIS CODE RUNNING)
    public static void insertion(int arr[])
    {
        for(int i = 1; i < arr.length; i++)
        {
            int curr = arr[i];
            int prev = i-1;
            for(prev = i-1; prev >= 0 && curr < arr[prev]; prev--)
            {
                arr[prev+1] = arr[prev];

            }
            arr[prev+1] = curr;
        }
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

    public static void counting(int arr[])
    {
        int largest = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length; i++)
        {
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest+1];

        for (int i = 0; i < arr.length; i++)
        {
            count[arr[i]]++;
        }

        //sorting
        int j = 0;
        for(int i = 0; i < count.length; i++)
        {
            while(count[i] > 0)
            {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }


    public static void main(String args[])
    {
        int arr[] = {1,2,4,5,2,1,1,3,7,5};
        //Arrays.sort(arr, Collections.reverseOrder(null));
        //insertion(arr)
        counting(arr);
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
