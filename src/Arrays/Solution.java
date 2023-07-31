package Arrays;

import javax.imageio.stream.ImageInputStream;

public class Solution
{
        public static void twoSum(int[] numbers, int target)
        {
            int left = 0;
            int right = numbers.length - 1;
            int tmp;
            while (left < right)
            {
                if (numbers[left] + numbers[right] == target)
                    break;
                tmp = target - numbers[right];
                while (numbers[left] < tmp)
                    left++;
                if (numbers[left] + numbers[right] == target)
                    break;
                tmp = target - numbers[left];
                while (numbers[right] > tmp)
                    right--;
            }
            System.out.println(left + 1);
            System.out.println(right + 1);

                /*public static void reverse(int x)
                {
                    boolean flag=false;
                    int temp=0;
                    if(x<0)
                    {
                        flag=true;
                        x=x*-1;
                    }
                    while(x>0)
                    {
                        int rem=x%10;
                        temp=temp*10+rem;
                        x/=10;
                    }
                    if(flag==true)
                    {
                        temp=temp*-1;
                    }
                    System.out.println(temp);
                }*/

        }

    public static void main(String[] args) 
    {
        Solution s= new Solution();
        int [] x= {2,7,11,15};
        s.twoSum(x, 9);
    }
}
