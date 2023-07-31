package Collection;

import java.util.ArrayList;
import java.util.List;

public class ListArray {
    public static void main(String [] args)
    {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(4);
        System.out.println(list);

        list.add(7);
        System.out.println(list);

        list.add(2, 20);
        System.out.println(list);


        List<Integer> newlist = new ArrayList<>();
        newlist.add(20);
        newlist.add(30);
        newlist.add(25);
        System.out.println(newlist);

        list.addAll(newlist);
        System.out.println(list);

        System.out.println(list.get(5));

        list.set(2,8);
        System.out.println(list);

        System.out.println(list.contains(5));

        /*list.remove(2);
        System.out.println(list);

        list.remove(Integer.valueOf(30));
        System.out.println(list);

        newlist.clear();
        System.out.println(newlist);*/

        for(int i=0; i<list.size(); i++)
        {
            System.out.println("The element is : " + list.get(i));
        }
    }
}
