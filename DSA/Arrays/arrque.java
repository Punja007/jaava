public class arrque 
{
    public static void main(String args[])
    {
        int arr [] [] = {{7, 7, 8},
                         {8, 8, 7},
                         {11, 4, 3}};

        int  total = 0;
        for (int i = 0; i < arr.length;i++)
        {
            for (int j = 0; j < arr[0].length; j++)
            {
                if (arr[i][j] == 7)
                {
                    total += 1;
                }
            }
        }
        System.out.println(total);


        int sum = 0;
        for(int j = 0; j < arr[1].length;j++)
        {
            sum += arr[1][j];
        }
        System.out.println(sum);

        int inverse [] [] = new int[3][3];
        for(int i = 0;i < arr.length; i++)
        {
            for (int j = 0; j < arr[0].length; j++)
            {
                inverse[i][j] = arr[j][i];
            }
        }

        for(int i = 0;i < arr.length; i++)
        {
            for (int j = 0; j < arr[0].length; j++)
            {
                System.out.print(inverse[i][j] + " ");
            }
            System.out.println();
        }
    }
}
