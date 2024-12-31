public class array2 
{

    public static void staircasesearch(int key, int matrix[][])
    {
        int i = matrix.length-1;
        int j = 0;
        while(i < matrix.length && j >= 0)
        {
            if(key == matrix[i][j])
            {
                System.out.println("The key is at " + i + " , " + j);
                return;
            }
            else if(key < matrix[i][j])
            {
                i--;
            }
            else
            {
                j++;
            }
        }
    }

    public static void diagonalSum(int matrix[][])
    {
        int prisum = 0;
        int secsum = 0;
        for(int i = 0; i < matrix.length ; i++)
        {
            for(int j = 0; j < matrix[0].length; j++)
            {
                if(i == j)
                {
                    prisum += matrix[i][j];
                }

                else if(i+j == matrix.length-1)
                {
                    secsum += matrix[i][j];

                }
            }

        }
        System.out.println(prisum);
        System.out.println(secsum);
         System.out.println(prisum + secsum);

    }

    public static void spiral(int matrix[][])
    {
        int startrow = 0;
        int startcol = 0;
        int endrow = matrix.length-1;
        int endcol = matrix[0].length-1;

        while(startrow <= endrow && startcol <= endcol)
        {
            for (int j = startcol; j <= endcol; j++)
            {
                System.out.print(matrix[startrow][j] + " ");
            }

            for (int i = startrow + 1; i <= endrow; i++)
            {
                System.out.print(matrix[i][endcol] + " ");
            }

            for (int j = endcol - 1; j >= startcol; j--)
            {
                 if (startrow == endrow)
                {
                    return;
                }
                System.out.print(matrix[endrow][j] + " ");
            }

            for (int i = endrow - 1; i >= startrow+1 ; i--)
            {
                 if (startcol == endcol)
                {
                    return;
                }
                System.out.print(matrix[i][startcol] + " ");
            }
            startcol++;
            startrow++;
            endrow--;
            endrow--;
        }
    }
    public static void main(String args[])
    {
        int k = 1;
        int matrix[] [] = {{10, 20, 30, 40},
                           {15, 25, 35, 45},
                           {27, 29, 37, 48},
                           {32, 33, 39 ,50}};

        for(int i =0; i < matrix.length; i++)
        {
            for(int j =0; j < matrix[0].length; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        diagonalSum(matrix);
        //spiral(matrix);
        // staircasesearch(33, matrix);
    }
}
