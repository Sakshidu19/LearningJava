package ClassConcept;

import java.util.Scanner;

public class Sim2 {
    String operator;
    double balance;
    Scanner sc=new Scanner(System.in);
    public void dialedCall(){
        System.out.println("We can dial a call");
    }

    public void recievedCall(){
        System.out.println("We can recieve the call");
    }
    public void missedCall(){
        System.out.println("We can get a missed call");
    }

    public void initialiseSim2(){
        System.out.println("Enter the operator name:");
        this.operator=sc.next();
        System.out.println("Enter the balance :");
        this.balance=sc.nextDouble();

    }
}
