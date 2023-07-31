package Arrays;

import java.util.Scanner;

public class OccEven {
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
        int Ecount=0;
        int Ocount=0;
        for(int i=0; i<r; i++)
        {
            for(int j=0; j<c; j++)
            {
                if(m[i][j]%2==0)
                {
                    Ecount++;
                }
                if(m[i][j]%2!=0)
                {
                    Ocount++;
                }
            }
        }
            System.out.println("Occurrence of even element in matrix " + Ecount);
            System.out.println("Occurrence of odd element in matrix " + Ocount);
    }

}

