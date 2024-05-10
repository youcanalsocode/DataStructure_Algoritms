package array2;

public class merge_to_pallindrome {
    public static void main(String[] args) {
        int arr[]={1, 4, 5, 1};
        System.out.println(mergepal(arr));
    }

    private static int mergepal(int[] arr) {
       if(arr.length==0)return  0;
       int n=arr.length;
       int ans=0;
       for(int i=0,j=n-1;i<=j;)
       {
           if(arr[i]==arr[j])
           {
               i++;
               j--;
           }
           else {
               if(arr[i]<arr[j])
               {
                   i++;
                   arr[i]=arr[i]+arr[i-1];
                   ans++;
               }else
               {
                   j--;
                   arr[j]=arr[j]+arr[j+1];
                   ans++;
               }
           }

       }
       return ans;
    }
}
