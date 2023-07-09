package Numbers;
/*import java.util.Scanner;
public class Happy {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        do {
            int sum = 0;
            while (n > 0) {
                int ld = n % 10;
                sum = sum + (ld * ld);
                n = n / 10;

            }
            n = sum;
        }while(!(n==1 || n==4));
        if (n == 1) {
            System.out.println("The given number is happy number");
        }
        else
        {
            System.out.println("The given number is not happy number");
        }


    }

}*/



import java.util.Scanner;
class Happy
{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        while(!(n==1 || n==4))
        {
            int sum=0;
            while(n>0)
            {
                int ld=n%10;
                sum=sum+(ld*ld);
                n=n/10;
            }
            n=sum;
        }
        if(n==1)
        {
            System.out.println("The given number is Happy");
        }
        else{
            System.out.println("The given number is not happy");
        }
    }
}

