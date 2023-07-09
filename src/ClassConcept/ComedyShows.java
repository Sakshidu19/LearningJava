package ClassConcept;

import java.util.Scanner;

public class ComedyShows extends BookMyShow
{
    String Comdy;
    public void search(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Search the Comedy shows in " + super.lang + "Language");
        System.out.println("Comedy show available : \n 1. Harsh Gujral \n 2. Be a Bassi \n 3. Abhishek Upmanyu");
        int com=sc.nextInt();
        switch(com)
        {
            case 1:{
                Comdy="Harsh Gujral";
                break;
            }
            case 2:{
                Comdy="Be a Bassi";
                break;
            }
            case 3:{
                Comdy="Abhishek Upmanyu";
                break;
            }
        }    }
    public void book(){
        System.out.println("You have booked" + Comdy + "in" + super.loc + "and no. of seats are" + super.noofperson);
    }
}
