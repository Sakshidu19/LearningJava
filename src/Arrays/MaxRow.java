package Arrays;

import java.util.Scanner;

public class MaxRow {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the rows:");
        int r=sc.nextInt();
        System.out.println("Enter the columns:");
        int c=sc.nextInt();
        System.out.println("Enter the matrix");
        int [] [] m= new int[r][c];
        for(int i=0; i<r; i++)
        {
            for(int j=0; j<c; j++)
            {
                m[i][j]=sc.nextInt();
            }
        }
        for(int i=0; i<r; i++)
        {
            for(int j=0; j<c; j++)
            {
                System.out.print(m[i][j]);
            }
            System.out.println();
        }
        for(int i=0; i<r; i++)
        {
        int max=0;
        int min=m[i][0];
            for(int j=0; j<c; j++)
            {

                if(max<m[i][j])
                {
                    max=m[i][j];
                }
                if(min>m[i][j])
                {
                    min=m[i][j];
                }
            }
            System.out.println("Max element in a row is " + max);
            System.out.println("Min element in a row is " + min);
        }
    }

}
