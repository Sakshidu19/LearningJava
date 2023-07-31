package Filehandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Employee emp = new Employee("PQR", 123, 987654321);
        try{
            FileOutputStream fout= new FileOutputStream("C:\\Users\\Saksh\\OneDrive\\Desktop\\jfknv.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);

            out.writeObject(emp);
            System.out.println("Data successfully written");

        }
        catch(Exception e)
        {

        }
    }
}
