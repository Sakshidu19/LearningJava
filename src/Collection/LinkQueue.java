package Collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class LinkQueue {
    public static void main(String[] args) {
        Queue q = new LinkedList();

//        System.out.println(q.peek());
//        System.out.println(q.poll());


        q.offer(40);
        q.offer(10);
        q.offer(90);
        q.offer(30);
        q.offer(70);
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q);

//Another way of (Peek and poll)

        System.out.println(q.element());  //similar to peek
        System.out.println(q);
        System.out.println(q.remove());  // similar to poll
        System.out.println(q);
    }

}
