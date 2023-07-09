package ClassConcept;
import java.util.Scanner;
public class Movies extends BookMyShow
{
    String film;
    public void search(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Search the Movie in " + super.lang + "Language");
        System.out.println("Movies available : \n 1. Fast X \n 2. Flash \n 3. Indiana Jones");
        int mov=sc.nextInt();
        switch(mov)
        {
            case 1:{
                film="Fast X";
                break;
            }
            case 2:{
                film="Flash";
                break;
            }
            case 3:{
                film="Indiana Jones";
                break;
            }
        }
    }
    public void book(){
        System.out.println("You have booked" + film + "in" + super.loc + "and no. of seats are" + super.noofperson);
    }

}
