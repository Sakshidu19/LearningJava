public class Student {
    int rollno;
    String name;
    double perc;
    int age;

    public Student(int rollno, String name, double perc, int age)
    {
        this.rollno=rollno;
        this.name=name;
        this.perc=perc;
        this.age=-age;
        System.out.println(rollno + " "+ name+ " "+ perc+ " "+ age);
    }
    public Student(int rollno, String name, int age)
    {
        this.rollno=rollno;
        this.name=name;
        this.age=-age;
        System.out.println(rollno + " "+ name+ " "+ age);
    }
    public Student(int rollno, int age)
    {
        this.rollno=rollno;
        this.age=-age;
        System.out.println(rollno + " "+ age);
    }
    public Student(int rollno)
    {
        this.rollno=rollno;
        System.out.println(rollno );
    }
    public Student(int age, double perc)
    {
        this.perc=perc;
        this.age=-age;
        System.out.println(age+ " "+ perc);
    }

    public static void main(String [] args)
    {
        Student s1 = new Student(101, "Rose", 75, 20);
        Student s2 = new Student(102, "Jack", 23);
        Student s3 = new Student(103, 19);
        Student s4 = new Student(104);
        Student s5 = new Student(23, 86.5);

    }
}
