package Collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ProdHashSet {
    public static void main(String[] args) {
        TreeSet<Integer> a = new TreeSet();

        a.add(5);
        a.add(2);
        a.add(9);
        a.add(3);
        a.add(6);


        System.out.println(a);

        /*Iterator<Integer> it = a.iterator();
        int prod=1;

        while (it.hasNext())
        {
            prod*=it.next();
        }
        System.out.println(prod);*/

//        int prod1 = 1;
//        for (Integer i : a) {
//            prod1 *= i;
//        }
//        System.out.println(prod1);
//
//        int sum = 0;
//        for (Integer i : a) {
//            if (i % 2 == 0) {
//                sum += i;
//                // System.out.println(i);
//            }
//        }

        int [] arr = {10,10,20,20,30,30,40,40,50};
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(Integer ele: arr){
            set.add(ele);
        }
        System.out.println(set);
    }
}
