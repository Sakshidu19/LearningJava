package Collection;

import java.util.*;
//import java.util.ArrayList;

public class VectorList {
    public static void main(String[] args) {
      Vector<Integer> v = new Vector<Integer>();
        //ArrayList v = new ArrayList();

        v.add(20);
        v.add(45);
        v.add(66);
        v.add(33);
        v.add(20);


        System.out.println(v.capacity());

        for(int i : v){
            System.out.println(i);
        }
        System.out.println(v);

    }
}
