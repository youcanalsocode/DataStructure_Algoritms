package Search_sort1;
import java.util.*;
class Pair
{
    int floor;
    int ceil;

    Pair()
    {
        this.floor=0;
        this.ceil=0;

    }
    Pair(int floor, int ceil)
    {
        this.floor=floor;
        this.ceil=ceil;
    }
}
class Solve {
    Pair getFloorAndCeil(int[] arr, int n, int x) {
        Arrays.sort(arr);
/*linear*/
//           int f= flor(arr,n,x);
//          int c=  cel(arr,n,x);
        int f=bnryf(arr,n,x);
        int c=bnryc(arr,n,x);



        return new Pair(f,c);

    }

    private int bnryc(int[] arr, int n, int x) {
        int pos = -1 , end = n-1 , start =0;
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            if(arr[mid]==x ||arr[mid]>x ) //if element found , then return its index
            {
                start=mid+1;
                pos=arr[mid];
            }
            else
            {
                end=mid-1;
            }
        }
        return pos;

    }

    private int bnryf(int[] arr, int n, int x) {
        int pos = -1 , end = n-1 , start =0;
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            if(arr[mid]==x ||arr[mid]<x ) //if element found , then return its index
            {
                start=mid+1;
                pos=arr[mid];
            }
            else
            {
                end=mid-1;
            }
        }
        return pos;

    }

    private  int cel(int[] arr, int n, int x) {

        int i=arr.length-1;
        while(i>0 && arr[i]>x)
        {
            i--;
        }
        if(i+1>=arr.length)
        {
            return -1;
        }else
        return arr[i+1];

    }

    private int flor(int[] arr, int n, int x) {
        int i=0;
        while(i<arr.length && arr[i]<x)
        {
            i++;
        }
        if(i-1<0)
        {
            return -1;
        }
        else
        {
            return arr[i-1];
        }
    }

    static Pair bst(int[] arr, int s, int e, int x) {   //System.out.println(Arrays.toString(arr));
        while (s < e) {
            int mid = s + ((e - 1) / 2);
            if (mid == x) return new Pair(mid, mid);


        }
        return new Pair(-1, -1);
    }
}


    public class floor_ceil_pair {
        public static void main(String[] args) {
            int ar[] = {1, 4, 6, 8, 2};
            int n = ar.length;
            int x = 12;
            Solve st = new Solve();
            System.out.println(st.getFloorAndCeil(ar, n, x).floor);
            System.out.println(st.getFloorAndCeil(ar, n, x).ceil);
        }
    }

