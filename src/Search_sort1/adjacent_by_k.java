package Search_sort1;
class Complete{


    // Function for finding maximum and value pair
    public  int search (int arr[], int n, int x, int k) {
        //Complete the function

        int ind=0;
        while(ind<n)
        {
            if(arr[ind]==x)return ind;
            ind=Math.max(((x-arr[ind])/k),1)+ind;

        }
        return -1;
    }


}
public class adjacent_by_k {
    public static void main(String[] args) {
        int a[]={4,5,6,7,6};
        int n=a.length;
        int x=10;
        int k=1;

        Complete cl=new Complete();
        System.out.println(cl.search(a,n,x,k));
    }
}
