package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorInterface {
    public static void main(String[] args)
    {
        ArrayList a= new ArrayList();

        a.add(20);
        a.add(66);
        a.add(9);
        a.add(29);
        a.add(69);


        System.out.println(a);

        Iterator<Integer> it = a.iterator();

       // it.remove();

        while(it.hasNext()) {
            int x= it.next();
            if(x%2==0){
                it.remove();
            }
        }
        //System.out.println(it.next());
            System.out.println(a);

    }
}
