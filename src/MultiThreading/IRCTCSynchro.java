package MultiThreading;

public class IRCTCSynchro {

    static int seats = 20;

    public synchronized void book(int x){
        if(x<=seats){
            seats=seats-x;
            System.out.println(x+ " Seats are booked");
        }
        else{
            System.out.println("Seats not available");
        }
    }
}
