package Numbers;

public class Technum {
    public static void main(String [] args)
    {
        int n= 2025;
        int count=0;
        int temp=n;
        int temp1=n;
        while(n>0){
            int ld=n%10;
            count++;
            n/=10;
        }
        System.out.println(count);

    }
}
