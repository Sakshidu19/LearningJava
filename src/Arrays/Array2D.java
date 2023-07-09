package Arrays;
import java.util.Scanner;
public class Array2D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows :");
        int m = sc.nextInt();
        System.out.println("Enter the columns");
        int n=sc.nextInt();
        int [][] p=new int [m] [n];
        //int sum=0;
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                p[i][j]=sc.nextInt();
            }
        }
        for(int i=0; i<m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(p[i][j]);
            }
            System.out.println();
        }
       /* for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                sum+=p[i][j];
            }
            System.out.println("sum of row");
            System.out.println(sum);
            sum=0;
        }*/
        /*int prod=1;
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                prod*=p[i][j];
            }
            System.out.println("prod of row");
            System.out.println(prod);
            prod=1;
        }*/
        /*int max=0;
        int min=0;
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                min=p[i][0];
                if(p[i][j]>max)
                {
                    max=p[i][j];
                }
                if(p[i][j]<min)
                {
                    min=p[i][j];
                }

            }
            System.out.println("The min of one row");
            System.out.println(min);
            System.out.println("The max of another row");
            System.out.println(max);
                max=0;
        }*/
        /*int count=0;
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(p[i][j]%2==0)
                {
                    count++;
                }
            }
            System.out.println(count);
            count=0;
        }*/
        // Second matrix
        /*int [][] q=new int[m][n];
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                q[i][j]=sc.nextInt();
            }
        }
        for(int i=0; i<m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(p[i][j]);
            }
            System.out.println();
        }
        int [][]t = new int[m][n];
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                t[i][j]=p[i][j]+q[i][j];
                System.out.print(t[i][j]);
            }
            System.out.println();
        }*/
        /*for(int i=0; i<m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                t[i][j] = p[i][j] - q[i][j];
                System.out.print(t[i][j]);
            }
            System.out.println();
        }*/
        /*boolean idc = true;
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(p[i][j]!=q[i][j])
                {
                    idc=false;
                    break;
                }
            }
        }
        if(idc==true )
        {
            System.out.println("this is an identical matrix");
        }
        else
        {
            System.out.println("this is not an identical matrix");
        }*/
       /* boolean flag=true;
        for(int i=0; i<m; i++){
            if(p[i][i]!=1)
            {
               flag=false;
               break;
            }
        }
        if(flag==true){
            System.out.println("Identity matrix");
        }
        else {
            System.out.println("Not Identity matrix");
        }*/

        /*for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(j<=i)
                {
                    System.out.print(p[i][j]);
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/


    }
}
