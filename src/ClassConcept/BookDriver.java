package ClassConcept;

import java.util.Scanner;

public class BookDriver {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        BookMyShow b;
        System.out.println("Press 1 for Movies");
        System.out.println("Press 2 for MusicShows");
        System.out.println("Press 3 for ComedyShow");
        System.out.println("Enter the Choice");
      //  int n=sc.nextInt();
     //   sc.nextLine() ;
        String c = sc.nextLine();

        switch(c)
        {
            case "Movies":
            {
                b=new Movies();
                b.selectLang();
                b.selectLoc();
                b.NoOfPerson();
                b.search();
                b.book();
                break;
            }
            case "MusicShow":
            {
                b=new MusicShows();
                b.selectLang();
                b.selectLoc();
                b.NoOfPerson();
                b.search();
                b.book();
                break;
            }
            case "ComedyShow":
            {
                b=new ComedyShows();
                b.selectLang();
                b.selectLoc();
                b.NoOfPerson();
                b.search();
                b.book();
                break;
            }
        }

    }
}
