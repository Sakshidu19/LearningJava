package ClassConcept;

public class Instagram {
    String username;
    String pswd;
    long mob;
    public String logIn(String username, String pswd)
    {
        /*this.username=username;
        this.pswd=pswd;
        this.mob=mob;*/
        //String username = "Samuel";
        //String pswd="S@muel";
        if(username.equals(this.username) && pswd.equals(this.pswd))
        {
            System.out.println("Login Successfull");
        }
        else
        {
            System.out.println("Invalid Username and password ");
        }
        return "A";
    }
    public String logIn(long mob, String pswd)
    {
        mob=987654321l;
        pswd="S@muel";
        if( pswd.equals(this.pswd))
        {
            System.out.println("Login Successfull");
        }
        else
        {
            System.out.println("Invalid Username and password ");
        }
        return "b";
    }
    public String signUp(String username, String pswd, long mob)
    {
        this.username=username;
        this.pswd=pswd;
        this.mob=mob;
        System.out.println("Login successfull through this");
        return "A";
    }

    public static void main(String[] args)
    {
        Instagram I1= new Instagram();
        I1.signUp("Samuel", "S@muel", 987654320l);
        I1.logIn("Samuel", "S@muel");
        I1.logIn(987654321l, "S@muel");

    }
}
