package Numbers;
import java.util.*;


public class Recursion {
   /* public static int naturalNo(int n)
    {
        if(n<=0)
        {
            return 0;
        }
        else
        {
            return n+naturalNo(n-1);

        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();

        System.out.println(naturalNo(n));
    }*/
//    public static int fact(int n)
//    {
//        if (n<=0){
//            return 1;
//        }
//        else{
//            return n*fact(n-1);
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter the number");
//        int n=sc.nextInt();
//        System.out.println(fact(n));
//    }
//    public static int sumofAlldigit(int n)
//    {
//        int ld=n%10;
//
//        if(n<=0)
//        {
//            return 0;
//        }
//        else
//        {
//            return ld+sumofAlldigit(n/10);
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter the number");
//        int n=sc.nextInt();
//        System.out.println(sumofAlldigit(n));
//    }
//    public static int productofDigit(int n)
//    {
//        int ld=n%10;
//        if(n<1)
//        {
//            return 1;
//        }
//        else{
//            return ld*productofDigit(n/10);
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter the number");
//        int n=sc.nextInt();
//        System.out.println(productofDigit(n));
//    }
//    public static int fibbonaci(int n)
//    {
//        if(n==0 || n==1)
//            return n;
//        return fibbonaci(n-1)+fibbonaci(n-2);
//    }
//
//    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter the number");
//        int n=sc.nextInt();
//        System.out.println(fibbonaci(n));
//
//    }
    public static int gcd(int n1, int n2){
        if(n2%n1==0)
            return n1;
        else
            return gcd(n2%n1,n1);

    }
        public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n1=sc.nextInt();
        System.out.println("Enter the number");
        int n2=sc.nextInt();
        System.out.println((gcd(n1,n2)));

    }
}
