package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPalindrome {
    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        System.out.println("Enter the size of the array");
//        int l= sc.nextInt();
//        System.out.println("Enter the Array");
//        char [] arr = new char[l];
//        for(int i=0; i<l; i++)
//        {
//            arr[i]= sc.next().charAt(0);
//        }
//        for(int i=0; i<l; i++)
//        {
//            System.out.print(arr[i] + " ");
//        }
//        boolean temp = true;
//
//        if(arr.length%2==0){
//
//        }

       //String s = "namans";
        /*int i=0;
       int j= s.length-1;
       boolean flag= false;
       while(i<j){
           if(s[i]!=s[j]){
            flag=true;
               break;
           }
           i++;
           j--;
       }
        if(flag)
        {
            System.out.println("Not a palindrome");
        }
        else{
            System.out.println("Palindrome");
        }*/
//        boolean flag=false;
        int [] s={1,2,4,2,1};
        int [] s2={1,2,3,5,7};
        for(int i=0; i<s.length; i++) {
            boolean flag = false;
            for (int j = 0; j < s2.length; j++){
                if(s[i]==s2[j]) {
                    flag = true;
                    break;
                }
            }
            if(!flag) {
                System.out.println(s[i]);
            }
        }




    }
}
