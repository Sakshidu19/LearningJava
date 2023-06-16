package pattern;

public class Patterns {
    public static void main(String[] args) {
		/*for(char i = 'A'; i<='E'; i++)
		{
			for(char j = 'A'; j<=i; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
            for(char i = 'Z'; i>='V'; i--)
            {
                for(char j = 'Z'; j>=i; j--)
                {
                    System.out.print(j);
                }
                System.out.println();
            }
            for (int i=5; i>=1; i--)
            {
                for(int j = 5; j>=i; j--)
                {
                    System.out.print(j);
                }
                System.out.println();
            }

            for (int i =5; i>=1; i--)
            {
                for (int j= 1; j<=i;j++)
                {
                    System.out.print(" * ");
                }
                System.out.println();
            }

            for (int i = 1; i <= 5; i++) {
                for (int j = 5; j >= i; j--) {
                    System.out.print(j);
                }
                System.out.println();
            }
            for (int i=5; i>=1; i--)
            {
                for(int j = 1; j<=i; j++)
                {
                    System.out.print(j);
                }
                System.out.println();
            }
            int count = 1;
            for (int i=5; i>=1; i--)
            {
                for(int j = 1; j<=i; j++)
                {
                    System.out.print(count);
                    count++;
                }
                System.out.println();
            }
            char countc='p';
            for (int i=3; i>=1; i--)
            {
                for (int j = 1; j <= i; j++)
                {
                    System.out.print(count);
                    count++;
                }
                System.out.println();
            }
            for (char i='c'; i>='a'; i--)
            {
                for (char j = 'a'; j <= i; j++)
                {
                    System.out.print(j);
                }
                System.out.println();
            }
            int n = 5;
            for (int i = 1; i<=n; i++)
            {
                for( int j = n-i; j>=1; j--)
                {
                    System.out.print(" ");
                }
                for (int k=1; k<=i; k++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int i = 1; i<=n; i++)
            {
                for( int j = n-i; j>=1; j--)
                {
                    System.out.print(" ");
                }
                for (int k=1; k<=i; k++)
                {
                    System.out.print(k);
                }
                System.out.println();
            }

            for (int i = 1; i<=n; i++)
            {
                for( int j = n-i; j>=1; j--)
                {
                    System.out.print(" ");
                }
                for (int k=1; k<=i; k++)
                {
                    System.out.print(n-k+1);
                }
                System.out.println();
            }
            for (int i = 1; i <= 5; i++)
            {
                for (int j = i; j <= 5; j++)
                {
                    if (j % 2 != 0) {
                    System.out.print(1);
                    }
                    else {
                    System.out.print(0);
                    }
                }
                System.out.println(" ");
            }

            for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if (j % 2 != 0) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println(" ");
        }
        for (int i = 1; i<=n; i++)
        {
            for( int j = 1; j<=i; j++)
            {
                System.out.print(" ");
            }
            for (int k=5; k>=i; k--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        n = 5;
        for (int i = 1; i<=n; i++)
        {
            for( int j = 1; j<=i; j++)
            {
                System.out.print(" ");
            }
            for (int k=5; k>=i; k--)
            {
                System.out.print(k);
            }
            System.out.println();
        }
        for (int i = 5; i>=1; i--)
        {
            for( int j = 5; j>=i; j--)
            {
                System.out.print(" ");
            }
            for (int k=i; k>=1; k--)
            {
                System.out.print(k);
            }
            System.out.println();
        }
        for (int i = 5; i>=1; i--)
        {
            for( int j = 5; j>i; j--)
            {
                System.out.print(" ");
            }
            for (int k=1; k<=i; k++)
            {
                System.out.print(k);
            }
            System.out.println();
        }
        for (int i = 1; i<=5; i++)
        {
            for( int j = 1; j<=i; j++)
            {
                System.out.print(" ");
            }
            for (int k=i; k<=5; k++)
            {
                System.out.print(k);
            }
            System.out.println();
        }*/

       /* for (int i=1; i<=5; i++)
        {
            for(int j=5; j>i; j--)
            {
                System.out.print(" ");
            }
            for(int k=1; k<=(2*i-1); k++)
            {
                System.out.print("*");
            }
            System.out.println();

        }*/
        /*for (int i=5; i>=1; i--)
        {
            for(int j=5; j>i; j--)
            {
                System.out.print(" ");
            }
            for(int k=2*i-1; k>=1; k--)
            {
                System.out.print("*");
            }
            System.out.println();

        }*/
        /*for (int i=5; i>=1; i--)
        {
            for(int j=0; j<=(5-i); j++)
            {
                System.out.print(" ");
            }
            for(int k=2*i-1; k>=1; k--)
            {
                System.out.print("*");
            }
            System.out.println();

        }*/
        /*int n = 5;
        int s=1;
        for (int i= 1; i<=(2*n-1); i++)
        {
            for(int j = 1; j<=s; j++ )
            {
                    System.out.print("*");
            }
            if(i<n)
            {
                s++;
            }
            else
            {
                s--;
            }
            System.out.println();
        }
        */

        /*
        int n = 5;
        int s=1;
        for (int i= 1; i<=(2*n-1); i++)
        {
            for(int j = 4; j>=s; j-- )
            {
                System.out.print(" ");

            }
            for (int k =2; k<=s; k++){
                System.out.print("*");
        }
            if(i<n) {
                s++;
            }
            else {
                s--;
            }
            System.out.print("*");
            System.out.println();
        }

*/
 /*       int n=5;
        int space=n;
        int star=1;
        for(int i=1;i<=((2*n)-1);i++){
            for(int j=1;j<space;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=((2*star)-1);k++){
                System.out.print("*");
            }

            if(i<n){
                space--;
                star++;
            }else{
                space++;
                star--;
            }
            System.out.println();
        }

*/
/*
        int n=5;
        int space=1;
        int star=n;
        for(int i=1;i<=((2*n)-1);i++){
            for(int j=1;j<space;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=((2*star)-1);k++){
                System.out.print("*");
            }

            if(i<n){
                space++;
                star--;
            }else{
                space--;
                star++;
            }
            System.out.println();
        }*/
        /*int n=5;
        int space = n;
        int star=1;
        for(int i=1; i<=((2*n)-1); i++)
        {
            for(int j=1; j<space; j++)
            {
                System.out.print(" ");
            }
            for (int k=1; k<=((2*star)-1);k++)
            {
                System.out.print("*");
            }
            if(i<n)
            {
                space--;
                star++;
            }
            else
            {
                space++;
                star--;
            }
            System.out.println();
        }*/

       /* int n=5;
        int space=1;
        int star=n;
        for(int i=1; i<((2*n)-1); i++)
        {
            for(int j=1; j<space; j++)
            {
                System.out.print(" ");
            }
            for(int k=1; k<=((2*star)-1); k++)
            {
                System.out.print("*");
            }
            if(i<n)
            {
                space++;
                star--;
            }
            else
            {
                space--;
                star++;
            }
            System.out.println();
        }*/
        /*int n= 5;
        int star=n;
        for(int i =1; i<=((2*n)-1); i++)
        {
            for(int j=1; j<=star; j++)
            {
                System.out.print("*");
            }
            if(i<n)
            {
                star--;
            }
            else
            {
                star++;
            }
            System.out.println();
        }
*/
    /*    int n=5;
        int space=1;
        int star=n;
        for(int i = 1; i<=((2*n)-1); i++)
        {
            for(int j = 1; j<space; j++)
            {
                System.out.print(" ");
            }
            for(int k = 1; k<=(star); k++ )
            {
                System.out.print("*");
            }
            if(i<n)
            {
                space++;
                star--;
            }
            else
            {
                space--;
                star++;
            }
            System.out.println();
        }*/
        /*int n=5;
        int star =1;
        int space =n-1;
        for(int i=1; i<(2*n); i++)
        {
            for (int j=1;j<=star;j++)
            {
                System.out.print("*");
            }

            for(int j=1;j<=(space*2)-1;j++)
            {
                System.out.print(" ");
            }
            for(int l=1;l<=star;l++)
            {
                System.out.print("*");
            }
            if(i<n)
            {
                star++;
                space--;
            }
            else {
                star--;
                space++;
            }
            System.out.println();
        }*/

        int n=5;
        int space=n-1;
        int star=1;
        int star2=1;
        for(int i=1; i<(2*n); i++)
        {
            for(int j = 1; j<=star; j++)
            {
                System.out.print("*");
            }
            for(int k=1; k<(space*2); k++)
            {
                System.out.print(" ");
            }
            for(int l=1; l<=star2; l++)
            {
                if(l<n)
                {
                    System.out.print("*");
                }

            }
            if(i<n)
            {
                star++;
                space--;
                star2++;
            }
            else {
                star--;
                space++;
                star2--;
            }
            System.out.println();
        }



    }
}