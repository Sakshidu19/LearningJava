package Arrays;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] s= {7,5,1,0,11,3};

        // In Ascending Order
       /* for(int i =0; i<s.length-1; i++)
        {
            int min=i;
            for(int j = i+1; j<s.length; j++)
            {
                if(s[min]> s[j])
                {
                    min=j;
                }
            }
            int temp=s[i];
            s[i]=s[min];
            s[min]=temp;
        }
        System.out.println(Arrays.toString(s));*/

        // In Descending order

        for(int i =0; i<s.length-1; i++)
        {
            int max=i;
            for(int j=i+1; j<s.length; j++)
            {
                if(s[max]<s[j])
                {
                    max=j;
                }
            }
            int temp = s[max];
            s[max]=s[i];
            s[i]=temp;
        }
        System.out.println(Arrays.toString(s));
    }
}
