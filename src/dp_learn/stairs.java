package dp_learn;

import java.util.Arrays;

public class stairs {
    public static void main(String[] args) {
        int n=5;
        int dp[]=new int[n+1];
        //System.out.println(frogmem(n,dp));
        System.out.println(frogtab(n));

    }

    private static int frogtab(int n) {
    //    int dp[]=new int[n+1];
      //  dp[0]=1;
        int prev2=0;
        int prev1=1;
        for(int i=1 ;i<=n;i++)
        {
            int fs=prev1;

            int ss=0;
            if(i>1)
            {
                 ss=prev2;
            }
          //  System.out.println(fs);
          //  System.out.println(ss);
            int curr=fs+ss;
           // System.out.println(Arrays.toString(dp));
            prev2=prev1;
            prev1=curr;
        }
        return prev1;
    }

    private static int frogmem(int n, int[] dp) {
        if(n==0)return 1;
        if (n==1)return 1;

        if(dp[n]!=0)return dp[n];
        int one=frogmem(n-1,dp);

        int two=frogmem(n-2,dp);
       return dp[n]=one+two;



    }

}
