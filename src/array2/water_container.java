package array2;

public class water_container {

    public static void main(String[] args) {
        int height[] = {1,1};

        System.out.println( calwater(height));

    }

    private static int calwater(int[] h) {
        int n=h.length;
        int i=0;
        int j=n-1;

        int ans=0;
        while(i<j)

        {

                   int min= Math.min(h[i],h[j]);
                   int a=min*(j-i);
                   if(h[i]<h[j])i++;
                   else j--;
                   if(ans<a)ans=a;

        }

    return ans;
    }
}
