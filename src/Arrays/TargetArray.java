package Arrays;

import java.util.Scanner;

public class TargetArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int l= sc.nextInt();
        System.out.println("Enter the array");
        int [] arr= new int[l];
        for(int i=0; i<arr.length; i++)
        {
            arr[i]= sc.nextInt();
        }
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i]+arr[j]==l)
                {
                    System.out.println(i+ " " +j);
                }
            }
        }
    }
}
