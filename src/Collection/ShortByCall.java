package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class ShortByCall {
    public static void main(String[] args) {
        ArrayList a= new ArrayList();

        a.add(12.08);
        a.add(10.66);
        a.add(3.99);
        a.add(12.09276);
        a.add(12.882);
        System.out.println(a);
        /*ArrayList a2= new ArrayList(a); you can store array list in another arraylist
        System.out.println(a2);*/

        ArrayList a2= (ArrayList)a.clone();
        System.out.println(a2);


        Collections.sort(a);

        System.out.println(a);


    }
}
