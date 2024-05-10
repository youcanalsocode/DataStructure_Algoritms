package array2;

import java.util.Arrays;

public class next_permutation {
    public static void main(String[] args) {
        int n[]={4,3,2,1};
        int x=n.length;
        int max=-1;
        for (int i = x-2; i >=0 ; i--) {
          //  System.out.println("i : "+i);
            if(n[i]<n[i+1]) {
                max = i;
                break;
            }
        }
      //  System.out.println(max);
        //if(max<0)return false;
        if(max<0)
        {
            reverseit(n,0);

        }else {
            int max2=-1;
            for (int i = x-1; i >max ; i--) {
                System.out.println(max+"---"+max2);
                if(n[i]>n[max])
                {
                    max2=i;break;
                }
            }

            swapit(n,max,max2);
            reverseit(n,max2+1);
        }



        System.out.println(Arrays.toString(n));

    }

    private static void reverseit(int[] n,int start) {
        int i=start;
        int j=n.length-1;
        while(i<j)
        {
           // System.out.println(i+"---------"+j);
            swapit(n,i,j);
            i++;
            j--;
        }
    }

    private static void swapit(int[] n, int i, int j) {
        int temp=n[i];
        n[i]=n[j];
        n[j]=temp;
    }

}
