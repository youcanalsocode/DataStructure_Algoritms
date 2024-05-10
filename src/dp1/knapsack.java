package dp1;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class knapsack {
    public static void main(String[] args) {
        int weight[]={1,3,5};
        int val[]={10,20,40};
        int n=weight.length;
        int max=6;

        System.out.println(   knapsack1(weight,val,max,n));

    }

    private static int knapsack1(int[] weight, int[] val, int max, int n) {
        int dp[][]=new int [n][max+1];
       // System.out.println(Arrays.deepToString(dp));
    //   return sol(  weight,  val,n-1,max ,dp);
        return soltabu( weight,  val,n-1,max );
    }

    private static int soltabu(int[] weight, int[] val, int index, int capacity) {
      //  int dp[][]=new int [weight.length][capacity+1];
        int prev[]=new int[capacity+1];
       // int curr[]=new int[capacity+1];

        for(int x=capacity;x>=0;x--)
        {
            if(weight[0]<=capacity)
            {
                prev[x]=val[0];
            }else prev[x]=0;


        }
        System.out.println(Arrays.toString(prev));

        for (int i = 1; i <weight.length ; i++) {
            System.out.println("curent : "+Arrays.toString(prev));

            for(int w=0;w<=capacity;w++)
            {
                int include=0;
                if(weight[i]<=w)

                {
                    include=val[i]+prev[w-weight[i]];
                }int exclude=0+prev[w];
                prev[w]=Math.max(include,exclude);
                System.out.println("w:"+ (w));
                System.out.println("index:"+ (i));
                System.out.println(Arrays.toString(prev));
            }
            System.out.println("out               "+i);
            System.out.println(Arrays.toString(prev));
            System.out.println(Arrays.toString(prev));
            //prev=curr;
        }


        return prev[capacity];
    }

    static int sol( int weight[], int val[],int index,int capacty, int dp[][])
    {
       // System.out.println("index"+index);
       /* if(index==0)
        {
            if(weight[0]<=capacty)

            {
              //  System.out.println("yee");
                return val[index];
            }

                else
                return 0;

        }*/
        if(index<0)return 0 ;
        if(dp[index][capacty]!=0)

        {
            System.out.println("returning indesex----------------------------------------------------------------------------"+index+"--"+capacty);
            return dp[index][capacty];
        }
        int include=0;

       if(weight[index]<=capacty)

       {
           System.out.println("include "+weight[index]+"so value will become"+(include+val[index]));
           System.out.println("capacty will ne"+(capacty-weight[index]));

          include=val[index]+sol(  weight,  val,index, capacty-weight[index], dp);
           System.out.println("returning inc:--"+include);
       }


        System.out.println("now going for exclude:--- "+weight[index]+"capacity"+capacty);
       int exclude=sol(  weight,  val,index-1,capacty ,  dp);

        System.out.println("eexclude val"+exclude);
        System.out.println("index"+index+"  capacity"+capacty);
        System.out.println( Math.max(include,exclude));
       dp[index][capacty]= Math.max(include,exclude);
        System.out.println("ans by: "+include+"+ "+exclude+"ans:--"+Math.max(include,exclude));
        System.out.println(Arrays.deepToString(dp));

       return  dp[index][capacty];
    }

}
