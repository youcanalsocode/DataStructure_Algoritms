package array2;

import java.util.Arrays;

public class trapping_rain {
    public static void main(String[] args) {
        int ar[]={0,1,0,2,1,0,1,3,2,1,2,1};
        int n=ar.length;
        int l[]=new int[n];
        int r[]=new int[n];
        int lbig=ar[0];
        l[0]=ar[0];
        for (int i = 1; i <n ; i++) {
            if(ar[i]<lbig)
            {
                l[i]=lbig;
            }else
            {

                lbig=ar[i];
                l[i]=lbig;
            }
        }
        System.out.println(Arrays.toString(l));
        //System.out.println(Arrays.toString(r));
       // System.out.println(Arrays.toString(ans));

        int rbig=ar[n-1];
        r[n-1]=rbig;
        for (int i = n-2; i >=0 ; i--) {
            if(ar[i]<rbig)
            {
                r[i]=rbig;
            }else
            {
                rbig=ar[i];
                r[i]=rbig;
            }
        }

         int ans[]=new int[n];
        for (int i = 0; i < n; i++) {
            if(l[i]<r[i])

            {
                ans[i]=l[i];
            }else
            {
                ans[i]=r[i];
            }
        }
        System.out.println(Arrays.toString(r));
        System.out.println(Arrays.toString(ans));
        int sum=0;
        for (int i = 0; i <n ; i++) {
           sum=sum+(ans[i]-ar[i]);
        }
     //   System.out.println(sum);
    }
}
