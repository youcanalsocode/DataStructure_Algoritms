package array2;

public class min_rotated_sorted {
    public static void main(String[] args) {
        int ar[]={7,8,9,1,2,3};
        System.out.println( findmin(ar,0,ar.length-1,-1));

    }

    private static int findmin(int[] ar, int s, int e,int small) {

        while (s<e)
        {
            System.out.println("e"+e);
            System.out.println(s);
            int mid=(s+e)/2;
            if(ar[mid]<ar[e])

            {
                e=mid;
                System.out.println("t");
            }

            else s=mid+1;
        }
        return ar[s];

    }
}
