package ClassConcept;

public class Car {
    String name;
    Engine e;
    MusicPlayer mp;
    AirConditioning ac;
    Car(){
        e= new Engine();
        ac= new AirConditioning();
    }
    public void installMP(MusicPlayer mp)
    {
        this.mp=mp;
    }
}
