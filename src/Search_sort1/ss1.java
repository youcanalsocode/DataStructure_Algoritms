package Search_sort1;

import java.util.Arrays;
/*permutation*/
public class ss1 {
    public static void main(String[] args) {
        long a[]={2,1,3};
        long b[]={11,12,13};
        int n=a.length;
        int k=10;

        Arrays.sort(a);
        Arrays.sort(b);

        for(int i=0,j=n-1;i<n;i++,j--)
        {
            System.out.println(i);
            System.out.println(j);
            if(a[i]+b[j]==k){ System.out.println("true"); break;}

        }
        System.out.println(false);
    }
}
