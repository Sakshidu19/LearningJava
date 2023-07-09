package Numbers;
import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int n=sc.nextInt();
        int a=n;
        int count=0;
        while(n>0){
            count++;
            n=n/10;
        }
        System.out.println(count);
        n=a;
        int sum=0;
        while(n>0)
        {
            int ld=n%10;
            int pow=1;
            for(int i=1; i<=count; i++){
                pow*=ld;
            }
            sum+=pow;
            n=n/10;
        }
        if (a==sum){
            System.out.println("The given number is Armstrong number");
        }
        else {
            System.out.println("The given number is not Armstrong number");
        }
    }
}
