package Collection;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();

        arr.add(30);
        arr.add(45);
        arr.add(43);
        arr.add(25);
        arr.add(30);
        arr.add(15);
        System.out.println(arr);

        System.out.println(arr.contains(43));

        ArrayList arr2 = new ArrayList();

        /*arr2.add(32);
        arr2.add(43);
        arr2.add(49);
        arr2.add(25);
        arr2.add(39);
        arr2.add(22);
        System.out.println(arr2);*/

       /* System.out.println(arr2.containsAll(arr));

        System.out.println(arr.indexOf(30));
        System.out.println(arr2.indexOf(30));
        System.out.println(arr);
        arr.remove(3);*/
        System.out.println(arr);
        System.out.println(arr2);

       /* arr2.removeAll(arr);
        System.out.println(arr2);*/

       /* arr2.retainAll(arr);
        System.out.println(arr2);*/

       /* System.out.println(arr.size());
        System.out.println(arr.get(3));*/

        System.out.println(arr2.isEmpty());
    }
}
