package MultiThreading;

public class IRCTCThread extends Thread{
    static IRCTCSynchro i = new IRCTCSynchro();
    int num;
    IRCTCThread(int n){
        num=n;
    }

    public void run(){
        i.book(num);
    }

    public static void main(String[] args) {

        IRCTCThread it1 = new IRCTCThread(10);
        it1.start();

        IRCTCThread it2 = new IRCTCThread(4);
        it2.start();


        IRCTCThread it3 = new IRCTCThread(9);
        it3.start();
            }
}
