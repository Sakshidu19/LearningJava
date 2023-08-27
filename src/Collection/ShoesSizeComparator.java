package Collection;

import java.util.Comparator;

public class ShoesSizeComparator implements Comparator<Shoes> {

    public int compare(Shoes s1, Shoes s2){
        return s1.size-s2.size;
    }
}
