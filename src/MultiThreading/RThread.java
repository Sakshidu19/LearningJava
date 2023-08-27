package MultiThreading;

public class RThread implements Runnable{
    public void run(){
        for(int i=0; i<8; i++){
            System.out.println("KKKG");
        }
    }

    public static void main(String[] args) {
        RThread t1 = new RThread();

        Thread t2 = new Thread(t1); // to call the run method of t1 object that's why we are sending (t1)
        t2.start(); //It will call the run method

        for(int i=0; i<15; i++){
            System.out.println("Hawan Karengee");
        }
    }
}
