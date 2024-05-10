package Search_sort1;

import java.util.Arrays;

public class count_sort_num {
    public static void main(String[] args) {
        int n[]={2,1,3,4,2,1,3};
        int max=n[0];
        for (int i = 0; i <n.length ; i++) {
            if(n[i]>max)max=n[i];
        }
      //  System.out.println(max);
        int x[]=new int[max+1];
        for (int i = 0; i < n.length; i++) {
           // System.out.println(n[i]);

            x[n[i]]++;
          //  System.out.println(Arrays.toString(x));

        }
        int ans[]=new int[n.length];
        int p=0;
        for (int i = 0; i <x.length ; i++) {
            while(x[i]>0)
            {
             //   System.out.println(x[i]);

                ans[p]=i;
              //  System.out.println(Arrays.toString(ans));
                x[i]--;
                p++;
            }
        }
        System.out.println(Arrays.toString(n));
        System.out.println(Arrays.toString(x));
        System.out.println(Arrays.toString(ans));
    }
}
