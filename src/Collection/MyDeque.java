package Collection;

import java.util.Deque;
import java.util.LinkedList;

public class MyDeque {
    public static void main(String[] args) {
        Deque d = new LinkedList();

        d.addFirst(30);
        d.addLast(80);
        d.offerFirst(44);
        d.offerLast(55);

        System.out.println(d);

        /*d.removeFirst();
        d.removeLast();

        System.out.println(d);*/  //[30,80]

        /*d.pollLast();
        d.pollFirst();
        System.out.println(d);*/ //[30,80]
        System.out.println(d.getFirst());;
        System.out.println(d.peekFirst());;

        System.out.println(d.getLast());
        System.out.println(d.peekLast());





    }
}
