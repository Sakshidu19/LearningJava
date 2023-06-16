import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Main method starts");
        System.out.println("Enter a number");
        int z = sc.nextInt();
        System.out.println(digit(z));
        System.out.println("Main method ends");
    }
    /*public static void number(z)
    {
        if(n==0){
            return;
        }
        else{
            System.out.println(n);
            number(n-1);
        }
    }*/

    public static int digit(int z){
        int sum=0;
        if (z==0) {
            return 0;
        }
        else {
            int ld = z%10;
            sum = ld + digit(z/10);
            return sum;
        }
    }
}
