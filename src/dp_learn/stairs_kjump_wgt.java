package dp_learn;

import java.util.Arrays;

public class stairs_kjump_wgt {

    public static void main(String[] args) {
        int w[]={10,20,30,10};
        int n=3;
        int k=1 ;
        int dp[]=new int [n+1];
        System.out.println(wgtmem(n,w,k));
        System.out.println(wgttab(n,w,dp,k));
    }

    private static int wgttab(int n, int[] w, int[] dp,int k) {

     dp[0]=0;
     int min=Integer.MAX_VALUE;
     for(int i=1;i<=n;i++)
     { int one=Integer.MAX_VALUE;
         for(int j=1;j<=k;j++)
         {
             if(n-j>0)
             one=Math.abs(w[i]-w[i-j]);
         }
         dp[i]=Math.min(min,one);
     }
        System.out.println(Arrays.toString(dp));
     return dp[n];
    }

    private static int wgtmem(int n, int[] w,int k ) {
        int dp[]=new int[n+1];
       if(n==0)return 0;
       int min=Integer.MAX_VALUE;
       if(dp[n]!=0)return dp[n];
        for (int j= 1;  j<=k; j++) {
            int one=Integer.MAX_VALUE;
            if(n-j>=0)
            {
                System.out.println(n-j);
                System.out.println("n"+ n);


                 one=wgtmem( n-j,  w,k) +Math.abs(w[n]-w[n-j]);

              //  return min;
            }
            System.out.println(min+"  --  "+one);

            dp[n]=Math.min(min,one);
            System.out.println(min+" m in ");



        }
      return dp[n];
    }
}

