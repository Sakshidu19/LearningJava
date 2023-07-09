package ClassConcept;

public class User {
    public static void main(String [] args)
    {
        Car c;
        c= new Car();

        System.out.println(c.e.cc);
        c.e.startEngine();
        c.e.cc=1200;
        System.out.println(c.e.cc);

        c.ac.setTemp=20;
        System.out.println(c.ac.setTemp);

        System.out.println(c.mp);

        c.installMP(new MusicPlayer());

        System.out.println(c.mp.price);
        c.mp.playMusic();
    }
}
