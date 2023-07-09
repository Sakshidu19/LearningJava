package ClassConcept;

import java.util.Scanner;

public class MusicShows extends BookMyShow
{
    String Mus;
    public void search(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Search the Music in " + super.lang + "Language");
        System.out.println("Movies available : \n 1. The Weekend \n 2. The Chainsmokers \n 3. Maroon5");
        int music=sc.nextInt();
        switch(music)
        {
            case 1:{
                Mus="The Weekend";
                break;
            }
            case 2:{
                Mus="The Chainsmokers";
                break;
            }
            case 3:{
                Mus="Maroon5";
                break;
            }
        }    }
    public void book(){
        System.out.println("You have booked" + Mus + "in" + super.loc + "and no. of seats are" + super.noofperson);
    }
}
