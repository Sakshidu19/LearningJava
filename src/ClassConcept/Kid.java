package ClassConcept;

import java.sql.SQLOutput;

public class Kid extends Father {
    String name="Kush";
    public void display()
    {
        System.out.println("Father's name : " + super.name);
        System.out.println(super.age);
        System.out.println(super.x);
        this.run();
        super.run();
        super.run();

    }

//contstructor
    public Kid() {
        super(10,20);
        this.name = name;
    }

    // kid non static run method
    public void run() {
        System.out.println("Ssaaaaaaakkkkkssssshhhhhiiiii");
    }

//main method
    public static void main(String [] args)
    {
        int num = 10;
        Kid k = new Kid();
        k.display();
        System.out.format("hell this is %d a number %d \n",num ,num);
        System.out.println("hello this is a number "+num+" hdskf ");
    }

}
