package Wrapper;

public class Boxing {
    public static void main(String[] args) {
        int x=10;
        Integer i=x;

        //Integer y= new Integer(40);
        //System.out.println(y);
        Integer z= Integer.valueOf(30); //Boxing
        //System.out.println(y+z);

       // int x=z; //auto boxing
        // int y = z.intValue();
        //System.out.println(y);

        Object o=900;

        //Autoboxing, upcasting

        String s= "false";

    }
}
