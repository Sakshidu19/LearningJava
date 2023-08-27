package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class Laptop implements Comparable {
    int price;
    int ram;
    int storage;

    Laptop(int price, int ram, int storage)
    {
        this.price=price;
        this.ram=ram;
        this.storage=storage;
    }

    public int compareTo(Object o){
        Laptop l = (Laptop) o;
        /*if(this.price>l.price)
            return 1;
        else if(this.price<l.price)
            return -1;
        return 0;*/

        //other method to compare
         return this.price - l.price;

    }

    public String toString(){
        return "Laptop [price : " +price + ", ram : " + ram + ", storage : " + storage + "]";
    }
    public static void main(String[] args) {
        ArrayList a =  new ArrayList();
        a.add(new Laptop(34000, 8, 256));
        a.add(new Laptop(55000, 16,512));
        a.add(new Laptop(85000, 16, 256));
        a.add(new Laptop(70000, 8, 512));
        a.add(new Laptop(45000, 16, 256));

        System.out.println(a);
        Collections.sort(a);
        System.out.println(a);
        /*for(int i=0; i<a.size();i++)
        {
            Laptop l= (Laptop)a.get(i);

            System.out.println(l.price);
        //System.out.println(l.toString(price));
        }*/


       // System.out.println();
    }
}

