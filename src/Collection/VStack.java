package Collection;

import java.util.Collections;
import java.util.Stack;

public class VStack {
    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(10);
        s.push(30);
        s.push(100);
        s.push(30);
        s.push(20);
        s.push(60);


        System.out.println(s);
        System.out.println(s.peek());
        Collections.sort(s);
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.search(30));


    }
}
