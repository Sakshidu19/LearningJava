package ClassConcept;
import java.util.Scanner;
public class Address {
    int house_no;
    int street;
    String district;
    String country;
    Scanner sc= new Scanner(System.in);

    public void address()
    {
        System.out.println("House no." + house_no);
        System.out.println("Street" + street);
        System.out.println("District" + district);
        System.out.println("Country" + country);

    }

    public void initialiseAddress(int house_no , int street)
    {
        System.out.println("enter house number : ");
        this.house_no=sc.nextInt();
        System.out.println("enter street number : ");
        this.street=sc.nextInt();
        System.out.println("enter district : ");
        this.district= sc.nextLine();
        System.out.println("enter country : ");
        this.country=sc.next();
    }

    public static void main(String[] args){

    }

}
