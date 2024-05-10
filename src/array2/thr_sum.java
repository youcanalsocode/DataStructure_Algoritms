package array2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class thr_sum {
   static ArrayList<List<Integer>> ans=new  ArrayList<List<Integer>>();
    public static void main(String[] args) {

        int nums []= {-1,0,1,2,-1,-4};
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
           if(i==0 || nums[i]!=nums[i-1])
           {
                calsum(i+1,n-1,nums,0-nums[i]);
           }

        }
        System.out.println(ans);
    }

    private static  void calsum(int i, int j, int[] nums, int tgt) {

        int a=nums[i-1];
        while(i<j)
        {
            if(nums[i]+nums[j]>tgt)j--;
            else if (nums[i]+nums[j]<tgt) {
                i++;
            }else
            {
                ArrayList<Integer> l=new ArrayList<>();
                l.add(a);
                l.add(nums[i]);
                l.add(nums[j]);
                ans.add(l);
                while(i<j && nums[i]==nums[i+1])i++;
                while(i<j && nums[j]==nums[j-1])i--;
                i++;
                j--;
            }
        }

    }
}
