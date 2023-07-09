package ClassConcept;

import java.util.Scanner;

public class Battery {
    String capacity;
    String Brand;
    Scanner sc=new Scanner(System.in);

    public void charging(){
        System.out.println("Charge properly");
    }
    public void discharging(){
        System.out.println("Discharge");
    }

    public void initializeBattery() {
        System.out.println("Enter the Capacity");
        this.capacity=sc.next();
        System.out.println(capacity);
        System.out.println("Enter the Brand");
        this.Brand=sc.next();
        System.out.println(Brand);

    }
}
