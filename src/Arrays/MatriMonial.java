package Arrays;

import java.util.Scanner;

public class MatriMonial extends RuntimeException {
    MatriMonial(String msgs)
    {
        super(msgs);
    }
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age= sc.nextInt();
        if(age<18)
        {
            throw new MatriMonial("Your age is too young");
        }
        else if (age>50)
        {
            throw new MatriMonial("You are too old ");
        }
        else {
            System.out.println("Welcome To Matrimonial");
        }
        run();
    }
    public static int run()
    {
        //return i;
        int i=1;
        throw new ArithmeticException();
        //return 2;
    }
}
