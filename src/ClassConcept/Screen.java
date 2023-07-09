package ClassConcept;

import java.util.Scanner;

public class Screen {
    double width;
    String type;
    Scanner sc=new Scanner(System.in);
    public void touch(){
        System.out.println("We can touch the screen");
    }

    public void typeT1(){
        System.out.println("Type of screen is amoled");
    }
    public void scroll(){
        System.out.println("We can scroll the screens");
    }

    public void initializeScreen(){
        System.out.println("Enter the width:");
        this.width=sc.nextDouble();
        System.out.println("Enter the type of screen :");
        this.type=sc.next();

    }
}
