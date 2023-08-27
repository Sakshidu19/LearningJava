package Arrays;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int l = sc.nextInt();
        System.out.println("Enter the array");
        int[] arr = new int[l];
        for (int i = 0; i < l; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < l; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int[] arr2 = new int[l];
        System.out.println("Rotate from position");
        int r = sc.nextInt();
        /*for(int i = l-r; i<l; i++) {
            System.out.print(arr2[j]=arr[i]);
            j++;
        }
        int k=r;
        for(int i=r-1;i<l;i++){
            System.out.print(arr2[k]=arr[i]);
            k++;
        }*/
        int i=0;
        int j=0;
                for (int k = r; k < l; k++)
                {
                        arr2[i++] = arr[k];
                }
                for(j=0; j<r; j++){
                    arr2[i++]= arr[j];
                }

                for(i=0; i<l; i++) {
                    System.out.print(arr2[i]+ " ");
                }

    }
}
