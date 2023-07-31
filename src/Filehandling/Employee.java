package Filehandling;

import java.io.Serializable;

public class Employee implements Serializable {
    String name;
    int empid;
    long mobile;
    Employee(String name, int empid, long mobile)
    {
        this.name=name;
        this.empid=empid;
        this.mobile=mobile;
    }
}
