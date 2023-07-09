package Numbers;
import java.util.Scanner;
public class Strong {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number :");
        int n= sc.nextInt();
        int a=n;
        int fact=1;
        int sum=0;
        while(n>0){
            int ld=n%10;
            n=n/10;
            for(int i=1; i<=ld; i++){
                fact*=i;
            }
            sum+=fact;
            fact=1;
        }
        System.out.println(sum);
        if(sum==a)
        {
            System.out.println("Number is strong");
        }
        else{
            System.out.println("Number is not strong");
        }


    }
}
