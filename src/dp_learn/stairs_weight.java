package dp_learn;

import java.util.Arrays;

public class stairs_weight {
    public static void main(String[] args) {
        int w[]={10,20,30,50};
        int n=3;
        int dp[]=new int [n+1];
        System.out.println(wgtmem(n,w));
        System.out.println(wgttab(n,w,dp));
    }

    private static int wgttab(int n, int[] w, int[] dp) {
        // int dp[]=new int [n+1];
        dp[0]=0;
        dp[1]=w[1]-w[0];// System.out.println(n);
        for(int i=2;i<=n;i++)
        {
            //System.out.println(Arrays.toString(dp));
            int l=dp[i-1] +w[i]-w[i-1];;
            int r=dp[i-2]+w[i]-w[i-2] ;
          //  System.out.println(l);
           // System.out.println(r);
            dp[i]= Math.min(l,r);
        }
        return dp[n];
    }

    private static int wgtmem(int n, int[] w) {
        int dp[]=new int [n+1];
        if(n==0)return 0;
        if(n==1)return w[1]-w[0];
       // System.out.println(n);
        if(dp[n]!=0)return dp[n];
        int l=wgtmem(n-1,w) +w[n]-w[n-1];
        int r=wgtmem(n-2,w) +w[n]-w[n-2];
        return dp[n]= Math.min(l,r);

    }
}
