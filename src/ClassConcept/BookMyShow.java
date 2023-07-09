package ClassConcept;
import java.util.Scanner;
public class BookMyShow {
    Scanner  sc=new Scanner(System.in);
    String lang, loc;
    int noofperson;
    public void selectLang()
    {
        System.out.println("Enter the language");
        this.lang=sc.nextLine();
    }
    public void selectLoc()
    {
        System.out.println("Enter the location");
        this.loc=sc.nextLine();
    }
    public void NoOfPerson()
    {
        System.out.println("Enter the number of persons");
        this.noofperson=sc.nextInt();
    }
    public void book(){
        System.out.println("This is my Book method of BookMyShow");
    }
    public void search(){
        System.out.println("This is my search method of BookMyShow");
    }
}

