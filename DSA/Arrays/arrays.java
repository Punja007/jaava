import java.util.*;
public class arrays
{
    public static void rain(int nums[])
    {
        int left[] = new int[nums.length];
        left[0] = nums[0];

        int right[] = new int[nums.length];
        right[nums.length-1] = nums[nums.length-1];


        for (int i = 0; i < nums.length ; i++)
        {
            left[i] = Math.max(left[i], nums[i]);
        }
        for (int j = nums.length-2 ; j>=0 ; j--)
        {
            right[j] = Math.max(right[j], nums[j]);
        }

        int sum = 0;
        for (int k = 0; k<nums.length ; k++)
        {
            int wtrlvl = 0;
            wtrlvl = Math.min(left[k], right[k]);
            int water = 0;
            water = wtrlvl  - nums[k];
            sum += water;
        }
        System.out.println(sum);
    }


    public static int profit (int price[])
    {
        int buyprice = price[0];
        int maxprofit = 0;
        for (int i =0; i < price.length; i++)
        {
            if (price[i] < buyprice)
            {
                buyprice = price[i];
            }
            for (int j = i; j < price.length; j++)
            {
                if((price[j]-buyprice) > maxprofit)
                {
                    maxprofit = price[i] - buyprice;
                }
            }
        }
        return maxprofit;
    }


    public static boolean same(int nums[])
    {
        for (int i = 0; i < nums.length ; i++)
        {
            for (int j = 0; j < i ; j++)
            {
                if (nums[j] == nums[i])
                {
                    return true;
                }
            }
        }
        return false;
    }

    public static void subarrays(int numbs[])
    {
        int ts =0;
        for (int i = 0 ; i < numbs.length ; i++)
        {
            for (int j = i; j < numbs.length; j++)
            {
                for (int k = i ; k <= j ; k++)
                {
                    System.out.print(numbs[k] + " " );
                }
                ts++;
                System.out.print("    ");
            }
            System.out.println();       
        }
        System.out.println("total subarrays = " + ts);
    }



    public static void subarraysmaxsum(int numbs[])
    {
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;
        for (int i = 0 ; i < numbs.length ; i++)
        {
            for (int j = i; j < numbs.length; j++)
            {
                currsum = 0;
                for (int k = i ; k <= j ; k++)
                {
                   currsum = currsum + numbs[k];
                }
                if (currsum > maxsum)
                {
                    maxsum = currsum;
                }
            }
                 
        }
        System.out.println("maximum of the subarrays is " + maxsum);
    }

    public static void kedanemaxsum(int numbs[])
    {
        int maxsum = 0;
        int currsum = 0;
        for (int i = 0 ; i < numbs.length ; i++)
        {
            if (currsum >= 0)
            {
                currsum += numbs[i];
            }
            else
            {
                currsum = 0;
            }
            maxsum = Math.max(currsum, maxsum);
        }
        System.out.println("maximum sum of subarrays is " + maxsum);
    }

    public static void pairup(int numbs[])
    {
        for (int i = 0; i < numbs.length ; i++)
        {
            for (int j = i+1; j < numbs.length ; j++)
            {
                if (i == j)
                {

                }

                else 
                {
                    System.out.print(numbs[i] + " , " + numbs[j] + "   " );
                }
            }
            System.out.println();        }
    }

    public static void reverse(int num[])
    {
        int last = num.length - 1;
        for (int i = 0; i <= (num.length/2) ; i++)
        {
            int temp = num[i];
            num[i] = num [last];
            num[last] = temp;
            last--;
        }
            System.out.println();
        for (int i = 0 ; i < num.length ; i++)
        {
            System.out.print(num[i] + " ");
        }
    }
    public static int linearsearch(int num[], int key)
    {
        for (int i =0; i<num.length ;i++)
        {
            if (num[i] == key)
            {
                return i;
            }
        }
        return -1;
    }

    public static void arrays_update(int marks[])
    {
        for (int i = 0; i < marks.length ; i ++)   // Arrays pass to function by reference
        {                                          // changes in function also changes actual array 
            marks[i] = marks[i] + 1;               // opposite to a variable
        }
    }
    public static void main(String args[])
    {
       


        int marks[] = new int[50];                                 //creation
        int nums[] = {1, 2, 3, 4, 5, 3, 12, 17, 25, 39};
        int numbs[] = {2, 4, 6, 8, 10};
        int asc[] = {4, 5, 6, 7, 0, 1, 2, 3};
        int price[] = {7, 1, 3, 2, 5, 4};

        Scanner sc = new Scanner(System.in);

        marks[0] = 99; // chem
        marks[1] = 98; // phy                                     //input
        marks[2] = 97; // maths

        // System.out.println("marks of chem is " + marks[0]);
        // System.out.println("marks of physics is " + marks[1]);    //output
        // System.out.println("marks of maths is " + marks[2]);

        // // marks[1] = 100;                                            //update
        // // System.out.println("new marks of phy is " + marks[1]);


        // int per = (marks[0] + marks[1] + marks[2]) / 3;
        // System.out.println("percentage is " + per);
        // System.out.println(marks.length);

        // arrays_update(marks);

        // for (int i = 0; i < 3 ; i++)
        // {
        //     System.out.println(marks[i]);
        // }\


//LINEAR SEARCH
    //     int key = 39;
    //     int index = linearsearch(num , key);
    //     if (index == -1)
    //     {
    //         System.out.println("not found");
    //     }
    //     else
    //     {
    //         System.out.println("key is at index " + index);
    //     }

    //     int largest = Integer.MIN_VALUE;
    // System.out.println(largest);
    // for (int i = 0; i< num.length ; i++)
    // {
    //     if(num[i] > largest)
    //     {
    //         largest = num[i];
    //     }
    // }
    // System.out.println(largest);

        //reverse(num);
        //pairup(numbs);
        //subarrays(numbs);
        //kedanemaxsum(numbs);
        //System.out.println(same(nums));
        //System.out.println(profit(price));
        rain(numbs);
    }
}