package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListIterator1 {
    public static void main(String[] args)
    {
        ArrayList a= new ArrayList();

        a.add(50);
        a.add(20);
        a.add(9);
        a.add(30);
        a.add(69);


        System.out.println(a);

       ListIterator<Integer> it = a.listIterator();
        /*System.out.println("Iterator for moving forward");

        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("ListIterator for moving Backward");

        while(it.hasPrevious()){
            System.out.println(it.previous());
        }*/

        /*while(it.hasNext()){
            if(it.next()%2==0){
                it.add(10);
            }
        }*/
//        System.out.println(a);
//
//        while(it.hasNext()){
//            int b = it.next();
//            if(b%2==1){
//                it.set(b+1);
//            }
//        }
//        System.out.println(a);
        /*while(it.hasNext()){
            if(it.next()%7==0){
                it.add(10);
            }
        }
        System.out.println(a);*/

        /*while(it.hasNext()) {
            int c = it.next();
            if (c % 2 == 0){
                it.set(c+1);
            }
        }
        System.out.println(a);*/

        while(it.hasNext()){
            int c = it.next();
                if (c % 10 == 0)
                {
                    //System.out.println(it.previous());
                    it.set(c + 5);
                    if(it.hasPrevious()){
                        it.previous();
                        if(it.hasPrevious())
                        {
                            System.out.println(it.previous());
                        }
                    }

                }
        }
        System.out.println(a);
    }

}
