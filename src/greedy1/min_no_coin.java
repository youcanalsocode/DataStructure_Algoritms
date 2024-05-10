package greedy1;

import  java.util.*;
public class min_no_coin {
    static List<Integer> minPartition(int n)
    {
        // code here
        List<Integer> ans= new ArrayList<>();
        int ar[]={1,2,5,10,20,50,100,200,500,2000};
        int i=ar.length-1;
        while (i>=0 && n>0)
        { while (ar[i]<=n){

            n=n-ar[i];
            ans.add(ar[i]);


        }
            i--;
        }
        return ans;
    }

    public static void main(String[] args) {

        System.out.println(  minPartition(22));
    }
}
