package Collection;

import java.util.Comparator;

public class ShoesPriceDec implements Comparator<Shoes> {

    public int compare(Shoes s1, Shoes s2){
        return s2.price-s1.price;
    }

}
