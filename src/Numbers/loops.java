package Numbers;
import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        /*int i=1;
        do{
            if(i%2==1)
                System.out.println(i);
            i++;
        }while(i<=n*2);*/
        /*int i=1;
        while(i<=2*n){
            if(i%2==0)
            {
                System.out.println(i);
            }
            i++;
        }*/
       /* int fact=1;
        for(int i=1; i<=n;i++){
            fact=fact*i;
        }
        System.out.println(fact);*/
        /*int sum=0;
        int i=1;
        while(i<=n)
        {
            sum=sum+i;
            i++;
        }
        System.out.println(sum);*/
        /*int i=20;
        long prod=1;
        while(i<=40){
            prod=prod*i;
            i++;
        }
        System.out.println(prod);*/
        /*char i=65;
        while(i<=n)
        {
            System.out.println(i);
            i++;
        }*/
        /*int i=1;
        int count=0;
        while(n>0)
        {
            int ld=n%10;
            count++;
            n=n/10;
        }
        System.out.println(count);*/
        /*int i=1;
        int sum=0;
        while(n>0)
        {
            int ld=n%10;
            sum=sum+ld;
            n=n/10;
        }
        System.out.println(sum);*/
        /*int prod=1;
        while(n>0)
        {
            int ld=n%10;
            if(ld%2!=0)
            {
                prod=prod*ld;
            }
            n=n/10;
        }
        System.out.println(prod);*/
        /*int rev=0;
        while(n>0)
        {
            int ld=n%10;
            rev=rev*10+ld;
            n=n/10;
        }
        System.out.println(rev);*/
        /*int a=n;
        int rev=0;
        while(a>0)
        {
            int ld=a%10;
            rev=rev*10+ld;
            a=a/10;
        }
        if (n==rev)
        {
            System.out.println("Number is pallindrome");
        }
        else{
            System.out.println("Number is not pallindrome");
        }*/
        /*int prod=1;
        do{
            int ld=n%10;
            if(ld%2!=0)3
            {
                prod=prod*ld;
            }
            n=n/10;
        }while(n>0);
        System.out.println(prod);*/

        /*int rev=0;
        int ld=0;
        while(n>0)
        {
            ld=n%10;
            rev=rev*10+ld;
            n=n/10;
        }
        if (rev%2==0){
            System.out.println("the first number is even");
        }
        else{
            System.out.println("The first number is not even");
        }*/

        /*int a= 'a';
        while(a<=n){
            System.out.println(a);
            a++;
        }*/
        /*System.out.println("Enter the range");
        int ld=sc.nextInt();
        int prod=1;
        do{
            prod*=ld;
            System.out.println(prod);
            ld++;
        }while(n>=ld);*/

      /*  for(int i=1; i<=n; i++)
        {
            if (n%i==0){
                System.out.println(i);
            }
        }*/

        /*int count=0;
        for(int i=1; i<=n; i++)
        {
            if (n%i==0){
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);*/
        /*int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0){
                System.out.println(i);
                sum = sum + i;
            }
        }
        System.out.println(sum);*/

        /*int a=n;
        int sum=0;
        for(int i=1; i<n; i++){
            if (n%i==0){
                sum=sum+i;
            }
        }
        if(sum==a){
            System.out.println("The number is perfect");
        }
        else{
            System.out.println("The number is not perfect");
        }*/
        /*int fact=0;
        for(int i=2; i<n; i++){
            if(n%i==0){
                fact=i;
                break;
            }
        }
        if(fact==0){
            System.out.println("The given number is prime");
        }
        else{
            System.out.println("The given number is not prime");
        }*/

       /* for(int j=1; j<100; j++) {
            boolean fact = false;
            for (int i = 2; i < j/2; i++) {
                if (j % i == 0) {
                    fact = true;
                    break;
                }
            }
            if (fact == false) {
                System.out.println(j +"prime");
            }
        }*/

        /*for(int i=1; i*i<=n; i++)
        {
            if((i*i)==n)
            {
                System.out.println(n + "is perfect square");
            }
        }*/
        /*System.out.println("Enter second number");
        int n2=sc.nextInt();
        int gcd=0;
        for(int i=1; i<=n; i++)
        {
            if(n%i==0 && n2%i==0){
                gcd=i;
            }
        }
        System.out.println(gcd);*/

        /*int a=0;
        int b=1;
        int c;
        System.out.print(a+" " + b);
        for(int i=2; i<n;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.print(" "+ c);
        }*/

        /*for(int i=1; i<=10; i++){
            System.out.println(n + " * " + i + " = " + (n*i));
        }*/

        /*int pow=1;
        System.out.println("Enter the power");
        int p= sc.nextInt();
        for(int i=1; i<=p; i++)
        {
            pow*=n;
        }
        System.out.println(pow);*/

        /*System.out.println("Enter the upto number");
        int m= sc.nextInt();
        int c=1;
        int p=m/n;
        for(int i=1; i<=p; i++ ){
            System.out.println(n*i);
        }
*/
        /*for(int i=20; i<=n; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }*/

        int sum=0;
        int ev= 1;
        for (int i=40; i<=n; i++)
        {
            for(int j=2; j<i; j++)
            {
                if (i % j == 0)
                {
                    ev=0;
                    break;
                }

            }
            if(ev==1){
                sum+=i;
            }
            else{
                ev=1;
            }
        }
        System.out.println(sum);




    }
}