// Create an int array take length from the user and take all the data from the user then print.
package Arrays;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Ludo {
    /*public static int[] inputArray()
    {

    }*/
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
       /* int n = sc.nextInt();
        int[] len = new int[n];
        for (int i = 0; i < n; i++) {
            len[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++)
        {
            System.out.print(" " + len[i] + " ");
        }*/

        /*int n= sc.nextInt();
        String[] len=new String[n];
        sc.nextLine();
        for(int i=0; i<n; i++)
        {
            len[i]=sc.next();
        }
        for(int i=0; i<n; i++)
        {
            System.out.println( " " + len[i] + " ");
        }*/
        int n=sc.nextInt();
        System.out.println("Enter the value");
        int[] arr=new int[n];
        for(int i =0 ; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        /*int sum=0;
        for(int i=0; i<n; i++)
        {
            sum+=arr[i];
        }
        System.out.println(sum);*/
        /*int prod=1;
        for(int i=0; i<n; i++)
        {
            prod*=arr[i];
        }
        System.out.println(prod);*/

       /* int avg=0;
        int sum=0;

        for(int i=0; i<n; i++)
        {
            sum+=arr[i];
        }
        System.out.println(" The average of the given " + sum/n);*/

        /*int sum=0;
        for(int i=0; i<arr.length; i++)
        {
            if(i%2==0)
            {
                sum+=arr[i];
            }
        }
        System.out.println(sum);*/

        /*int sum=0;
        for(int i=0; i<arr.length; i++)
        {
            if(i%2!=0)
            {
                sum+=arr[i];
            }
        }
        System.out.println(sum);*/

       /* int sum=1;
        for(int i=0; i<arr.length; i++)
        {
            if(i%2==0)
            {
                sum*=arr[i];
            }
        }
        System.out.println(sum);*/

        /*int []rev=new int[n];
        for(int i=arr.length-1; i>=0; i--)
        {
            for( int j=0;j<n;j++)
            {
                rev[j]=arr[i];
            }
            System.out.println(arr[i]);
        }*/
//        int last = n-1;
//        for(int i=0; i<=n/2; i++)
//        {
//            int temp = arr[i];
//            arr[i]= arr[last];
//            arr[last]= temp;
//            last--;
//        }
//        for(int i=0; i<n; i++)
//        {
//            System.out.println(arr[i]);
//        }
//        System.out.println("enter the search element");
//        int fnd = sc.nextInt();
//        for(int i = 0 ;i<n;i++)
//        {
//            if(fnd==arr[i])
//            {
//                System.out.println(i);
//                System.out.println("Element is present");
//            }
//
//        }
      /*  int big=0;
        int small = arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]>=big)
            {
                big=arr[i];
            }
            if(arr[i]<=small)
            {
                small=arr[i];
            }
        }
        System.out.println(big);
        System.out.println(small);*/

       /* int max=arr[0];
        int secmax=arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]>=max)
            {
                max=arr[i];
            }
        }
        for(int i =0;i<n;i++)
        {
            if(arr[i]>=secmax && arr[i]<max)
            {
                secmax=arr[i];
            }
        }

        System.out.println(max);
        System.out.println(secmax);*/

        
    }
}
