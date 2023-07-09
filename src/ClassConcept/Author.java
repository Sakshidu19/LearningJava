package ClassConcept;
import java.util.Scanner;
public class Author {
    String name;
    int age;
    String gender;
    Address a;
    Author()
    {
        a= new Address();
    }
    public void authorDetails()
    {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Gender : " + gender);
        a.address();
    }

}
