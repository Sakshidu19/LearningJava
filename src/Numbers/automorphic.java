package Numbers;

import java.util.Scanner;
public class automorphic {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();
        int ld = n%10;
        int prod=0;
        prod= n * n;

       int prodld=prod%10;
       if(prodld==ld)
       {
           System.out.println("this is automorphic number");
       }
       else
       {
           System.out.println("this is not an automorphic number");
       }


    }
}

