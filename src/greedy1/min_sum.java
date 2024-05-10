package greedy1;

import java.util.Arrays;

class sum {

    public static long minSum(int arr[], int n)
    {
        // Your code goes here
        Arrays.sort(arr);
      //  System.out.println(Arrays.toString(arr));
        long s1=0;
        long s2=0;
       // int m=1000000007;
        for(int i=0;i<arr.length;i++)
        {
            if(i%2==0)
            {
                s1=(s1*10+arr[i]);
                //System.out.println(s1);

            }else
            {
                s2=s2*10+arr[i];
            }
        }
      //  System.out.println(s1);
      //  System.out.println(s2);
        return s1+s2;
    }
}
public class min_sum {
    public static void main(String[] args) {
       sum s=new sum();
       int arr[]={5, 5, 7 ,3 ,8, 2, 2 ,0, 6, 9 ,5 ,4 ,7, 9 ,7 ,6 ,1 ,4, 2, 9, 7, 8, 1, 1, 1, 7, 5, 7, 8};
       int n=arr.length;
        System.out.println( s.minSum(arr,n));
    }
}
