package array2;

import java.util.Arrays;

public class product_e_self {
    public static void main(String[] args) {
        int ar[]= {1,2,3,4};
        int n=ar.length;
        int lsum[]=new int[n];
        int rsum[]=new int[n];
        lsum[0]=1;
        for(int i=1;i<n;i++)
        {
            lsum[i]=lsum[i-1]*ar[i-1];
        }
        rsum[n-1]=1;
        for(int i=n-2;i>=0;i--)
        {
            rsum[i]=rsum[i+1]*ar[i+1];
        }
        int ans[]=new int[n];
        for (int i = 0; i <n ; i++) {
            ans[i]=rsum[i]*lsum[i];
        }
        System.out.println(Arrays.toString(ans));
    }
}
