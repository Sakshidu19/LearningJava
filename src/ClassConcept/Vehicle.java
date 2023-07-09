package ClassConcept;

public class Vehicle {
    int seats;
    private int headlights;
    int cc;
    static String color;
    static{
        System.out.println("Static block of parent class");
    }
    {
        System.out.println("This is non static block of parent class");
    }
    public static void engine()
    {
        System.out.println("start your engine ");
    }
    public void accelerate()
    {
        System.out.println("Enter the speed of your vehicle ");
    }
    public void breaks()
    {
        System.out.println("Enter the quality of break ");
    }
}
