package SUNIL;
import java.util.*;
public class StarPatternButterfly {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int star=1;
        int spac2=num-1;
//        int star2=1;
        for(int row=1;row<=2*num-1;row++)
        {
            for(int col= 1; col<=star;col++)
            {
                System.out.print("*");
            }
            for(int space=1;space<spac2*2;space++ )
            {
                System.out.print(" ");
            }
            for(int star2=1;star2<=star;star2++)
            {
                if(star2<num)
                {
                    System.out.print("*");
                }
            }
            if(row>=num)
            {
                star--;
                spac2++;
            }
            else{
                star++;
                spac2--;
            }
            System.out.println();
        }
    }
}
