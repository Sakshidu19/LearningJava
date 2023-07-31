package pattern;

import java.util.Scanner;

public class NumPyramid {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();
        int sp=n-1;
        int str=1;
        for(int i=0; i<n; i++)
        {
            int x=1;
            for(int j=0; j<sp; j++)
            {
                System.out.print(" ");
            }
            for(int j=0; j<str; j++)
            {
                System.out.print(x);
                if(j<str/2)
                {
                    x++;
                }
                else{
                    x--;
                }
            }
                sp--;
                str+=2;
                System.out.println();
        }
    }
}
