package Arrays;

import java.util.Scanner;

public class SparseMatrix {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the rows ");
        int r=sc.nextInt();
        System.out.println("Enter the columns");
        int c= sc.nextInt();
        System.out.println("Enter the matrix");
        int [][] s= new int[r][c];
        for (int i=0; i<r; i++)
        {
            for(int j=0; j<c; j++)
            {
                s[i][j]=sc.nextInt();
            }
        }
        for (int i=0; i<r; i++)
        {
            for(int j=0; j<c; j++)
            {
                System.out.print(s[i][j] + "");
            }
            System.out.println();
        }
        int x=(r*c*2)/3;
        int count=0;
        for (int i=0; i<r; i++)
        {
            for(int j=0; j<c; j++) {
                if (s[i][j] == 0){
                    count++;
                }
            }
        }
        if(count>=x)
        {
            System.out.println("This is sparse matrix");
        }
        else{
            System.out.println("This is Dense matrix");
        }

    }
}
