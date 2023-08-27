package MultiThreading;

import java.util.Scanner;

public class MyArray extends Thread{
    public void run(int a[]){
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        MyArray m=new MyArray();
        m.start();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        /*for(int i=0; i<n; i++){
            System.out.print(a[i]+ " ");
        }*/
    }
}
