package Collection;

import java.util.Deque;
import java.util.LinkedList;

public class AddDeque {
    public static void main(String[] args) {
        Deque<Integer> d = new LinkedList<>();

        d.add(33);
        d.add(22);
        d.add(8);
        d.add(10);
        d.add(17);

        int sum=0;
        System.out.println(d);
        System.out.println(d.isEmpty());

        while(!d.isEmpty()){
            int a= d.poll();
            if(a%2==0) {
                sum += a;
            }
        }
        System.out.println(sum);
    }
}
