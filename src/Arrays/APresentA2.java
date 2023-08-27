package Arrays;

import java.util.HashMap;

public class APresentA2 {
    public static void main(String[] args) {
        char [] arr = {'a','b', 'c', 'd'};
        char [] arr2 = {'a', 'b','d', 'c'};
        if(arr.length!=arr2.length){
            System.out.println("not");
            return;
        }
        int a=0;
        boolean flag=false;

        for(int i = 0; i<arr.length; i++)
        {
            for(int j= 0; j<arr2.length; j++)
            {
                if(arr[i]==arr2[j])
                {
                    a++;
                    break;

                }
               /* if(arr[i]!=arr2[j])
                {
                    flag=true;
                    break;
                }*/
            }
        }

        if(a==arr.length){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }

        /*int [] arr = {1,2,3,4,5,1,5};
        HashMap<Integer, Integer> hm = new HashMap<>();*/
        



    }
}
