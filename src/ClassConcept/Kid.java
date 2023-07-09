package ClassConcept;

public class Kid extends Father {
    String name="Kush";
    public void display()
    {
        System.out.println("Father's name" + super.name);
        System.out.println(super.age);
        System.out.println(super.x);
        this.run();
        super.run();
        super.run();
    }

    public void run() {
        System.out.println("Ssaaaaaaakkkkkssssshhhhhiiiii");
    }


    public static void main(String [] args)
    {
        Kid k = new Kid();
        k.display();
    }

    public Kid() {
        super();
        this.name = name;
    }
}
