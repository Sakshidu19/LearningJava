package Numbers;

public class Dice {


    public static String Word(String str){
        String ans="";

        if(str.charAt(0)>='a' && str.charAt(0)<='z') {
            for(int i=0;i<str.length();i++) {
                char ch=str.charAt(i);
                if(ch>='A' && ch<='Z') {
                    ch=(char)(ch+32);
                }
                ans+=ch;
            }
        }else {
            for(int i=0;i<str.length();i++) {
                char ch=str.charAt(i);
                if(ch>='a' && ch<='z') {
                    ch=(char)(ch-32);
                }
                ans+=ch;
            }
        }
        return ans;

    }

    public static int Dice(int sum){
        if(sum<2 || sum>12){
            return 0;
        }

        int ans=0;
        for(int i=1;i<=6;i++){
            if((sum-i)<=6){
                ans++;
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        String d=  Word("EexamPLE");
        int s = Dice(13);
        System.out.println(s);
        System.out.println(d);
    }
}
