package Numbers;
import java.util.Scanner;
public class Emirp {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
       // int c=n;
        boolean pri= true;
        boolean pri2=true;
        for(int i=2; i<n; i++){
            if(n%i==0)
            {
                pri=false;
                break;
            }
        }
        int rev=0;
        if(pri==true) {
            while (n > 0) {
                int ld = n % 10;
                rev = (rev * 10) + ld;
                n = n / 10;
            }
            for(int j=2; j<rev; j++){
                if(rev%j==0){
                    pri2=false;
                    break;
                }
            }
            System.out.println(rev);
        }
        if(pri2==true){
            System.out.println("The number is emirp");
        }
        else{
            System.out.println("The number is not emirp");
        }

    }

}
