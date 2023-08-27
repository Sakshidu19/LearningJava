package MultiThreading;

public class MyThread extends Thread{
    public void run(){
        for(int i =0; i<20; i++){
            System.out.println("Heart Of Stone");
        }
    }

    public static void main(String[] args) {
        MyThread m = new MyThread();
        m.start();
        for(int i = 0; i<20; i++){
            System.out.println("Cold Hearted");
        }
    }
}
