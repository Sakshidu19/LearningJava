package Arrays;
import java.util.*;
public class InsertionSort {
    public static void main(String[] args) {
        int [] as= {9,4,8,0,1,5};
        for(int i=1; i< as.length; i++)
        {
            int j=0;
            int cur=as[i];
            for(j=i-1; j>=0 && cur<as[j]; j--)
            {
                as[j+1]= as[j];
            }
            as[j+1]=cur;
        }
        System.out.println(Arrays.toString(as));

    }
}
