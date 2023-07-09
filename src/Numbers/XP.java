package Numbers;
import java.util.Scanner;
public class XP {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();
        int sumFL=0;
        int sumMD=0;
        sumFL=n%10;
        n=n/10;
        while(n>9){
            sumMD=sumMD+(n%10);
            n=n/10;
        }
        sumFL+=n;
        if(sumFL==sumMD){
            System.out.println("The given number is XP");
        }
        else{
            System.out.println("The given number is not XP");
        }

    }
}
