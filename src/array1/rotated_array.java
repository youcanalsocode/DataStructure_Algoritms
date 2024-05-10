package array1;

class Solution {
    public int search(int[] nums, int target) {

        int st=0;
        int ed=nums.length-1;

        while(st<=ed){
            int mid= st+(ed-st) /2;
            //System.out.println(mid);
            if (nums[mid]==target) {
                return mid;
            }
            if(nums[st]<=nums[mid]){
                if(nums[st]<=target&&target<=nums[mid]){
                    ed=mid-1;
                }else{
                    st=mid+1;
                }

            }else{
                if(nums[mid]<=target&&target<=nums[ed]){
                    st=mid+1;
                } else{
                    ed=mid-1;
                }
            }
        }
        return -1;

    }


}
public class rotated_array {
    public static void main(String args[]){

        int nums[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 2;
        Solution clob = new Solution();
        int ans = clob.search( nums, target);
        System.out.println("Index of given element is at: "+ans);
    }
}
