// Create an int array take length from the user and take all the data from the user then print.
package Arrays;
import java.util.Scanner;
public class Ludo {
    /*public static int[] inputArray()
    {

    }*/
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
       /* int n = sc.nextInt();
        int[] len = new int[n];
        for (int i = 0; i < n; i++) {
            len[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++)
        {
            System.out.print(" " + len[i] + " ");
        }*/

        /*int n= sc.nextInt();
        String[] len=new String[n];
        sc.nextLine();
        for(int i=0; i<n; i++)
        {
            len[i]=sc.next();
        }
        for(int i=0; i<n; i++)
        {
            System.out.println( " " + len[i] + " ");
        }*/
        int n=sc.nextInt();
        System.out.println("Enter the value");
        int[] arr=new int[n];
        for(int i =0 ; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        /*int sum=0;
        for(int i=0; i<n; i++)
        {
            sum+=arr[i];
        }
        System.out.println(sum);*/
        /*int prod=1;
        for(int i=0; i<n; i++)
        {
            prod*=arr[i];
        }
        System.out.println(prod);*/

       /* int avg=0;
        int sum=0;

        for(int i=0; i<n; i++)
        {
            sum+=arr[i];
        }
        System.out.println(" The average of the given " + sum/n);*/

        /*int sum=0;
        for(int i=0; i<arr.length; i++)
        {
            if(i%2==0)
            {
                sum+=arr[i];
            }
        }
        System.out.println(sum);*/

        /*int sum=0;
        for(int i=0; i<arr.length; i++)
        {
            if(i%2!=0)
            {
                sum+=arr[i];
            }
        }
        System.out.println(sum);*/

       /* int sum=1;
        for(int i=0; i<arr.length; i++)
        {
            if(i%2==0)
            {
                sum*=arr[i];
            }
        }
        System.out.println(sum);*/

        /*int []rev=new int[n];
        for(int i=arr.length-1; i>=0; i--)
        {
            for( int j=0;j<n;j++)
            {
                rev[j]=arr[i];
            }
            System.out.println(arr[i]);
        }*/
//        int last = n-1;
//        for(int i=0; i<=n/2; i++)
//        {
//            int temp = arr[i];
//            arr[i]= arr[last];
//            arr[last]= temp;
//            last--;
//        }
//        for(int i=0; i<n; i++)
//        {
//            System.out.println(arr[i]);
//        }
//        System.out.println("enter the search element");
//        int fnd = sc.nextInt();
//        for(int i = 0 ;i<n;i++)
//        {
//            if(fnd==arr[i])
//            {
//                System.out.println(i);
//                System.out.println("Element is present");
//            }
//
//        }
      /*  int big=0;
        int small = arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]>=big)
            {
                big=arr[i];
            }
            if(arr[i]<=small)
            {
                small=arr[i];
            }
        }
        System.out.println(big);
        System.out.println(small);*/

       /* int max=arr[0];
        int secmax=arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]>=max)
            {
                max=arr[i];
            }
        }
        for(int i =0;i<n;i++)
        {
            if(arr[i]>=secmax && arr[i]<max)
            {
                secmax=arr[i];
            }
        }

        System.out.println(max);
        System.out.println(secmax);*/

        
    }

    public static class Arrays {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of array");
            /*int size = sc.nextInt();
            System.out.println("Enter the elements");
            int[] arr = new int[size];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }*/
            /*int sum=0;
            for(int i=0; i<arr.length; i++)
            {
                arr[i]=sc.nextInt();
                sum+=arr[i];
            }
            System.out.println("Sum of all the elements in arrays are" + sum);*/

            /*long prod=1;
            for(int i=0; i<arr.length; i++)
            {
                arr[i]=sc.nextInt();
                prod*=arr[i];
            }
            System.out.println("Product of all the elements in array " + prod);
    */
            /*int sum=0;
            for(int i=0; i<arr.length; i++)
            {
                arr[i]=sc.nextInt();
                if(arr[i]%2==1)
                {
                    sum+=arr[i];
                }
            }
            System.out.println("Sum of odd elements in a array " + sum);*/

            /*int sum=0;
            for(int i=0; i<arr.length; i++)
            {
                arr[i]=sc.nextInt();
                if(i%2==0)
                {
                    sum+=arr[i];
                }
            }
            System.out.println("Sum of odd elements in a array " + sum);*/

            /*int[] rev=new int[size];
            for(int i=arr.length-1; i>=0; i--)
            {
                for (int j = 0; j <size; j++)
                {
                    rev[j] = arr[i];
                }
            System.out.print(arr[i]+ " ");
            }*/

            /*System.out.println("Enter the number to be found");
            int f = sc.nextInt();
            for (int i = 0; i < arr.length; i++)
            {
                if(f==arr[i])
                {
                    System.out.println("The number is present inthe array "+ arr[i]);
                }
            }
            System.out.println("Number is not present");*/

            /*int max=arr[0];
            int min=arr[0];
            for(int i=0; i<arr.length; i++)
            {
                if(max<arr[i])
                {
                    max=arr[i];
                }
                if(min>arr[i])
                {
                    min=arr[i];
                }
            }
            System.out.println(" The maximum element in the array is " + max);
            System.out.println("The minimum element in the array is " + min);*/

            /*int last=size-1;
            for(int i=0; i<arr.length/2; i++)
            {
                int temp=arr[i];
                arr[i]=arr[last];
                arr[last]=temp;
                last--;
            }
            for(int i=0; i<size; i++)
            {
                System.out.println(arr[i]);
            }*/

            /*int max=arr[0];
            int Smax=arr[0];
            for(int i=0; i<arr.length; i++)
            {
                if(max<arr[i])
                {
                    max=arr[i];
                }
            }
            for(int i=0; i<arr.length; i++)
            {
                if(Smax<arr[i] && max>arr[i])
                {
                    Smax=arr[i];
                }
            }
            System.out.println("The max element in the given array is "+ max);
            System.out.println("The second max element in the given array is "+ Smax);*/

          /*  for(int i=0;i<arr.length;i++)
            {
                int count=0;
                for(int j=0; j<arr.length; j++)
                {
                    if(arr[i]==arr[j])
                    {
                        count++;
                    }
                }
                System.out.println(arr[i] + " is occured " + count);
            }*/

            /*int count=1;
            for(int i=0; i<arr.length; i++)
            {
                for(int j=0; j<arr.length; j++)
                {
                    if(arr[i]==arr[j])
                    {
                        count++;
                    }
                }
            }
            if(count>=2)
            {
                System.out.println(arr[i]);
            }*/

            int[] a={1,2,3,4,5};
            int[] b={10,20,30};
            int combineArray[] = new int[a.length + b.length];
            int i=0;
            int j=0;
            int k=0;
            while(i<a.length)
            {
                combineArray[k]=a[i];
                i++;
                k++;
            }
            while(j<b.length)
            {
                combineArray[k] = b[j];
                j++;
                k++;
            }
            System.out.println(combineArray);


        }
    }
}
