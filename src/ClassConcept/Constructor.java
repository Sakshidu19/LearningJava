package ClassConcept;

public class Constructor {
    String name="Sakshi";
    int id;
    String email = "Sakshi@gmail.com";
    long mob;
    {
        System.out.println("Details of Match");
    }
    Constructor(){
        System.out.println("From user defined Constructor");
        name = "Axor";
        email = "Axar@gmail.com";
    }
    {
        System.out.println("name of player is: "+name);
    }
    {
        System.out.println("Email id of player is: "+email);
    }

    static {
        System.out.println("Welcome to Lords!!");
    }

    public static void main(String[] args) {
        Constructor c = new Constructor();
        System.out.println(c.name);
        System.out.println(c.email);
        System.out.println(c.id);
    }

    static {
        System.out.println("It's world t20 match");
    }

}
