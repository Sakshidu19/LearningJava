package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Dish implements Comparable<Dish>
{
        private String type;
        private String name;
        private int price;
        private int quantity;

        Dish(String type, String name, int price, int quantity)
        {
            this.type=type;
            this.name=name;
            this.price=price;
            this.quantity=quantity;
        }

        public int compareTo(Dish o)
        {
           // Dish d = (Dish) o;
            return this.price-o.price;
        }

        public String toString(){
            return "\n[ Type of Dish : " + type + " , Name of Dish : " + name + " , Price of Dish : " + price + ", Quantity of Dish : " + quantity +" ]";
        }


    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
            ArrayList<Dish> f =new ArrayList<>();

            f.add(new Dish("Non-Veg", "Momos", 120, 1 ));
            f.add(new Dish("Veg", "Jalebi", 160, 2 ));
            f.add(new Dish("Veg", "Gol gappe", 30, 1 ));
            f.add(new Dish("Non-Veg", "Momos", 120, 1 ));
            f.add(new Dish("Non-Veg", "Lasania", 240, 1 ));
            f.add(new Dish("Veg", "Alfredo", 270, 1 ));



      //  Collections.sort(f);
        System.out.println(f);
        /*System.out.println("enter type you want to remove");
        String RemoveName = sc.next();
*/
        /*for(int i=0; i<f.size(); i++){
            if(f.get(i).getType().equals("Non-Veg"))
            {
                f.remove(i);
            }
        }*/

        for(int i=f.size()-1; i>=0; i--){
            if(f.get(i).getType().equals("Non-Veg"))
            {
                f.remove(i);
            }
        }

        for(int i=0; i<f.size(); i++)
        {
            /*if(f.get(i).type.equals(RemoveName))
            {
                f.remove(i);
            }*/

            if(f.get(i).getPrice()<100){
                f.get(i).setPrice(f.get(i).getPrice()+10);
            }
            else if(f.get(i).getPrice()>100 & f.get(i).getPrice()<200){
                f.get(i).setPrice(f.get(i).getPrice()+20);
            }
            else{
                f.get(i).setPrice(f.get(i).getPrice()+30);
            }
        }
        System.out.println(f);





    }
}
