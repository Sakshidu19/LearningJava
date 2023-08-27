package Arrays;

import java.util.Scanner;

public class ZigZag {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int l= sc.nextInt();
        System.out.println("Enter the array");
        int [] arr= new int[l];
        for(int i = 0; i<l; i++)
        {
            arr[i]= sc.nextInt();
        }
        for(int i=0; i<l; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Enter the 2nd Array");
        int [] arr2= new int[l];
        for(int i = 0; i<l; i++)
        {
            arr2[i]= sc.nextInt();
        }
        for(int i=0; i<l; i++)
        {
            System.out.print(arr2[i] + " ");
        }

        //int [] arr = {10,20,30,40,50};
        //int [] arr2 = {22, 33, 44};
        int [] arr3 = new int[arr.length+ arr2.length];
        int p=0;
        int q=0;
        for(int i = 0; i<arr3.length;)
        {
            if(p<arr.length)
            {
                arr3[i]=arr[p];
                p++;
                i++;
            }
            if(q<arr2.length)
            {
                arr3[i]=arr2[q];
                q++;
                i++;
            }
        }
        for(int i=0; i<arr3.length; i++)
        {
            System.out.println(arr3[i]);

        }
    }
}



