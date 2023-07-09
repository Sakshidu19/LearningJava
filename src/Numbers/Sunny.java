package Numbers;
import java.util.Scanner;
public class Sunny {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number :");
        int n= sc.nextInt();
        int a=n+1;
        int b=1;
        for (int i=0; i<=a/2; i++)
        {
            b=i*i;
            if (b==a){
                System.out.println("The number is sunny");
            }
        }

    }
}
