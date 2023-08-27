package MultiThreading;

public class TLifeCycle extends Thread{

    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("Abhishek kaanp kahe rahe ho");
        }

        try{
            Thread.sleep(3000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        for(int i=0; i<5; i++){
            System.out.println("Abhishek Chabbi kaha hai");
        }
    }

    public static void main(String[] args) {
        TLifeCycle t1= new TLifeCycle();
        t1.start();

        for(int i =0; i<8; i++){
            System.out.println("Abhishek aap to jaan ho humari ");
        }
    }
}
