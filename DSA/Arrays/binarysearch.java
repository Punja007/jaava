import javax.lang.model.util.ElementScanner14;

public class binarysearch 
{
    public static void main (String args[])
    {
        int num[] = {1, 4, 8, 9, 10, 13, 17, 29, 37};
        int key =14;
       System.out.println(key + " is at index " + biSearch(num, key) + " of the array");
    }

    public static int biSearch(int num[], int key)
    {
        int start = 0;
        int end = num.length-1;

        int mid = (start + end)/2;
        
        while(start <= end)
        {
            if(num[mid] == key)
            {
                return mid;
            }

            else if (mid == start && mid ==end && num[mid] != key)
            {
                return -1;
            }

            else if (num[mid] > key)
            {
                end = mid;
                mid = (start + end)/2;

            }
            else
            {
                start = mid +1;
                mid = (start + end)/2;
            }
        }
        return mid;
    }
}
