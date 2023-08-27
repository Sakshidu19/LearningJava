package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Shoes {

    int price;
    int size;
    String brand;
    String color;

    Shoes(int price, int size, String brand, String color) {
        this.price = price;
        this.size = size;
        this.brand = brand;
        this.color = color;
    }

    public String toString() {
        return "\n[ Price of Shoes : " + price + " , Size of Shoes : " + size + " , Brand of Shoes : " + brand + ", Color of Shoes : " + color + " ]";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Shoes> f = new ArrayList<>();

        f.add(new Shoes(6000, 8, "Nike", "White"));
        f.add(new Shoes(5000, 10, "Addidas", "Black"));
        f.add(new Shoes(12000, 6, "Campus", "Blue"));
        f.add(new Shoes(3000, 9, "Puma", "Pink"));
        f.add(new Shoes(9000, 8, "Converse", "Multicolor"));

        System.out.println(f);
        Collections.sort(f, new ShoesPriceComparator());
        System.out.println(f);
        Collections.sort(f, new ShoesSizeComparator());
        System.out.println(f);
        Collections.sort(f, new ShoesPriceDec());
        System.out.println(f);

    }
}
