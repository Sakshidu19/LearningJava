package Filehandling;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) {
        try{
            FileInputStream fin = new FileInputStream("C:\\Users\\Saksh\\OneDrive\\Desktop\\jfknv.txt");
            ObjectInputStream in = new ObjectInputStream(fin);

            Employee emp = (Employee) in.readObject();
            System.out.println("Employee name is " + emp.name);
            System.out.println("Employee id is " + emp.empid);
            System.out.println("Employee number is " + emp.mobile);


        }
        catch(Exception e){

        }
    }
}
