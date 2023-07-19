package ClassConcept;
import java.util.Scanner;
public class Passenger {
    Scanner sc=new Scanner(System.in);
    private String Name;
    private int age;
    private String Gender;

    Ticket t;
    {
        t=new Ticket();
    }

    public String getName() {
        return Name;
    }

    public void setName() {
        this.Name = Name;
    }



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender() {
        this.Gender = Gender;
    }

    public void displayPassengerDetails()
    {
        System.out.println("Enter the Name of Passenger");
        Name=sc.nextLine();
        System.out.println("Enter the Age of Passenger");
        this.age=sc.nextInt();
//        System.out.println("Enter the Gender");
//        this.Gender=sc.nextLine();
        System.out.println("Enter the gender");
     this.Gender=sc.next();
    }
}
