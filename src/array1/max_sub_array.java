package array1;

import java.util.*;

public class max_sub_array {
    public static void main(String args[]){
        int arr[]={2,4,8,7,8,3};
        boolean b=true;
        HashSet<Integer> hset=new HashSet<Integer>();
        for(int i=0;i<arr.length-1;i++){
            if (hset.contains(arr[i])){
                b=false;
                break;
            }else{
                hset.add(arr[i]);
            }

        }
        if(b){
            System.out.println("No dupicates were found");
        }else{
            System.out.println("Array contains dupicates");
        }
    }


    }


