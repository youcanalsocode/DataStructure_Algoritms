package array1;

import java.util.Arrays;

public class rev_array {
    public static void main(String args[])
    {
        int arr[]= {1,2,3,4,5,6};
        int min =0;
        int n=arr.length;
        int max=n-1;
        for(int i=0;i<(n)/2;i++){
            int temp= arr[min];
            arr[min]=arr[max];
            arr[max]=temp;
            min++;
            max--;

            //  System.out.println(Arrays.toString(arr));
        }

        System.out.println(Arrays.toString(arr));

    }
}
