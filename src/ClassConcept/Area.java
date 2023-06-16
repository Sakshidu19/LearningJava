// Create a class with name area which has a private member length and breadth. Create a constructor parameter as constructor to intialise
// there value. Create getter and setter for both the variables. Create a get area method to return area. Create a class for main method
// to take the input from the user and call it and initialize the value. Create an object with 2 arguments(length, breadth)
// create an object with no Arguments of this call get area method, call setter method to change the values of length & breadth from user
// call get area method again.

package ClassConcept;
import java.util.Scanner;

public class Area {
    private int length;
    private int breadth;



    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return this.length;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int getBreadth() {
        return this.breadth;
    }


    public int getArea()
    {
        return length*breadth;
    }



    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length : ");
        int length1= sc.nextInt();
        System.out.println("Enter the breadth : ");
        int breadth2=sc.nextInt();

        Area A1= new Area();

        A1.setLength(length1);
        A1.setBreadth(breadth2);

        System.out.println(A1.getLength());
        System.out.println(A1.getBreadth());
        System.out.println(A1.getArea());


    }

}
