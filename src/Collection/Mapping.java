package Collection;

import java.util.HashMap;

public class Mapping {
    public static void main(String[] args) {

        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("Samuel", 35);
        hm.put("Chloe", 20);
        hm.put("Lucifer", 10);

        //System.out.println(hm);

        HashMap<String, Integer> hw = new HashMap<>();
        hw.put("Indie", 3);
        hw.put("Candy", 19);
        hw.put("Hope", 22);

        hm.putAll(hw);

        System.out.println(hm);


    }
}
