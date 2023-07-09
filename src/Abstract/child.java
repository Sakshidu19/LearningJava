package Abstract;

public class child extends Parent{
    public static void main(String[] args) {
        Parent p= new child();
        p.abs2(33);
        p.abs3(22);
        child c = new child();
        c.abs2(4);
    }

    public static void abs2(int b) {
        int p=2;
        System.out.println(p);
    }

    public void abs3(int c)
    {
        int q=23;
        System.out.println(q);
    }

    @Override
    public void abs(int a) {
        System.out.println("Shhhhhhhhhh");
    }

}
