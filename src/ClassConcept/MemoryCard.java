package ClassConcept;

import java.util.Scanner;
public class MemoryCard {
    String name;
    int size;
    int price;
    Scanner sc=new Scanner(System.in);

    public void storeMovie(){
        System.out.println("Display collection of movies");
    }
    public void storeMusic(){
        System.out.println("Display all the music");
    }

    public void intializeMemory() {
        System.out.println("Enter the name of memory card");
        this.name=sc.next();
        System.out.println("Enter the size of the card");
        this.size=sc.nextInt();
        System.out.println("Enter the price");
        this.price=sc.nextInt();
    }
}
