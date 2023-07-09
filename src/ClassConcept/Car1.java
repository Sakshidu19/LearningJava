package ClassConcept;

public class Car1 extends Vehicle
{
    int temp;
    static{
        System.out.println("Static block of child class");
    }
    {
        System.out.println("Non static block of child class");
    }
    public void ac(int temp)
    {
        this.temp = temp;
        System.out.print("Enter the temp of ac ");
        System.out.println(temp);
    }
    public void playMusic()
    {
        System.out.println("Music is being played ");
    }
    public static void main(String[] args)
    {
        Car1 c = new Car1();
        c.temp = 20;
        c.seats = 4;
        c.cc = 2000;
        c.accelerate();
        c.breaks();
        System.out.println(c.seats);
        System.out.println(c.cc);
        c.playMusic();
        c.ac(20);
        c.color="orange";
        System.out.println(c.color);
        Vehicle.color = "red";
        System.out.println(Vehicle.color);
        //c.headlights=2;
        c.engine();

    }
}
