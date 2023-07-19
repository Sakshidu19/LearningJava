package Arrays;


import java.util.Scanner;

public class StringPrgm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = sc.nextLine();
//        System.out.println("Character at position : " + s.charAt(3));
//        System.out.println(s.charAt(0));
//        System.out.println("Index of A is : " + s.indexOf('a'));
//        System.out.println("Enter the second String");
//        String s1= sc.nextLine();
//        System.out.println("The two Strings is equal or not : " + s.equals(s1));
        String s1 = s;
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        System.out.println("The reverse of String is : " + rev);
        if (rev.equals(s1)) {
            System.out.println("The String is pallindrome");
        } else {
            System.out.println("The given String is not pallindrome");
        }
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                System.out.print(s.charAt(i) + ",");
            }
        }
        System.out.println(s.length());
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s);
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>occurrence/ frequency of alphabet in a string");
        String s2 = " ";

        for (int i = 0; i < s.length(); i++) {
            int count = 1;
            char c = s.charAt(i);
            //System.out.println(c);
            if (!s2.contains(c + "")) {
                for (int j = i + 1; j < s.length(); j++) {
                    if (c == s.charAt(j)) {
                        count++;
                    }
                }
                s2 = s2 + c;
                //System.out.print(c + "" + count);
                System.out.println(c + " ->" + count);
            }
        }
        String s0[] = s.split(" ");
        System.out.println(s0.length);
        boolean flag = false;
        int count = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) != ' ') {
                flag = true;
            }
            if (s.charAt(i) == ' ' && s.charAt(i + 1) != ' ' && flag == true) {
                count++;
            }
        }
        System.out.println(count);
        int count1 = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
                System.out.println(s.charAt(i));
                count1++;
            }
        }
        System.out.println(count1);

        //for(System.out.println("Hello"); ;);


        System.out.println("Enter the 2nd :");
        String s9 = sc.nextLine();
        char[] arr = caseSpaceArray(s);
        char[] brr = caseSpaceArray(s9);
        int flag1 = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != brr[i]) {
                flag1 = 0;
                break;
            }
        }
        if (flag1 == 0) {
            System.out.println("This is not anagram String");
        } else {
            System.out.println("This is Anangram");
        }
    }

    public static char[] caseSpaceArray(String str) {
        String str1 = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 65 && c <= 90) {
                str1 += (char) (c + 32);
            } else {
                str1 += c;
            }
        }
        System.out.println(str1);


        //Remove spaces
        // public static void removeSpace(String str1)
        String s2 = " ";
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            if (c != 32) {
                s2 += c;
            }

        }
        System.out.println(s2);

        //Change string into array
        char[] arr = new char[s2.length()];
        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            arr[i] = ch;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        +
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = (char) temp;
                }


            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        return arr;
    }

        String s7 = "";
        for(int i = 0;i<s.length();i++)
    {
        String c = "" + s.charAt(i)
        if (!s7.contains(c)) {
            s7 += c;

        }
    }
        System.out.println(s7);

        String s8 = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            for (int j = 0; j < s.length(); j++) {
                if (j < 5) {
                    s8 += c;
                }
                System.out.println(s8);
                if (j > 5) {
                    System.out.print("*");
                }
            }
        }


    }
}