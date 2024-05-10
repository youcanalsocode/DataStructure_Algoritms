package array1;

import java.util.Arrays;

public class choclate_Dist {
    public static void main(String args []){
        int arr[]={7,3,8,1,200};
        int m=3;
        Arrays.sort(arr);
        int min_arr=Integer.MAX_VALUE;;
        for(int i=0;i<arr.length-m+1;i++){

            if(arr[i+m-1]-arr[i]<min_arr){
                min_arr=  arr[i+m-1]-arr[i];
            }


        }
        System.out.println("The minmum sub array diff is :"+ min_arr);

    }
}
