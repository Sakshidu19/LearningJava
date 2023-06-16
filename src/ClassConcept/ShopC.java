package ClassConcept;
import java.util.Scanner;

public class ShopC {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        String n= sc.nextLine();
        System.out.println("Enter the Gst");
        String g= sc.nextLine();
        System.out.println("Enter the Address");
        String A=sc.nextLine();
        System.out.println("Enter the mobile number");
        long m=sc.nextLong();

        Shop S=new Shop();
        S.setName(n);
        S.setGst(g);
        S.setAddress(A);
        S.setMob(m);

        System.out.println(S.getName());
        System.out.println(S.getGst());
        System.out.println(S.getAddress());
        System.out.println(S.getMob());

    }
}
