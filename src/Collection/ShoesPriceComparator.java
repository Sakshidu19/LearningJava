package Collection;
import java.util.Comparator;

public class ShoesPriceComparator implements  Comparator<Shoes>{
    public int compare(Shoes s1, Shoes s2){
        return s1.price-s2.price;
    }
}
