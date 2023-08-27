package Collection;

import java.util.*;

public class Student implements Comparable<Student>
{

    String name;
    int id;
    String branch;
    int salExpect;


    public String toString(){
        return "[\n Name is " + name + " , Id of the student is " + id + "Branch of the Student " + branch + "Salary expected by the student " + salExpect +" ]";
    }
    public boolean equals(Object o){
        Student s = (Student) o;
        if(this.hashCode()==s.hashCode()){
            return true;
        }
        else{
            return false;
        }

    }
    public int hashCode(){
        return Objects.hash(name, branch, id, salExpect);
    }

    public int compareTo(Student o){
            return this.id - o.id;
    }

    Student(String name, int id, String branch, int salExpect){
        this.name=name;
        this.salExpect=salExpect;
        this.branch=branch;
        this.id=id;
    }

    public static void main(String[] args) {

        Student obj = new Student("Xyz", 1, "Cse", 40000);
        Student obj1 = new Student("Xyx", 2, "Ece", 69000);
        Student obj2 = new Student("Xyy", 3, "AI", 35000);
        Student obj3 = new Student("Xys", 4, "IT", 30000);

        LinkedHashSet<Integer> ls = new LinkedHashSet<>();

        ls.add(30);
        ls.add(10);
        ls.add(90);
        ls.add(10);
        ls.add(15);
        ls.add(25);

        System.out.println(ls);

        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(25);
        ts.add(40);
        ts.add(40);
        ts.add(30);
        ts.add(40);
        ts.add(90);
        System.out.println(ts);

        TreeSet<Student> t = new TreeSet<Student>();
        t.add(new Student("Abhishek", 25, "Cse", 40000));
        t.add(new Student("Abhishek", 15, "IT", 30000));
        t.add(new Student("Deepanshi", 20, "Cs",35000));

        System.out.println(t);




    }

}
