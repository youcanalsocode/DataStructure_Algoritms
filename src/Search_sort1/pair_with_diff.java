package Search_sort1;

public class pair_with_diff {
    public static void main(String[] args) {
        int arr[]={2,3,5,20,50,80};
        int tgt=49;
        int i=0;
        int j=1;
        while(i<arr.length && j<arr.length)
        {
            if(i!=j && (arr[j]-arr[i]==tgt || arr[i]-arr[j]==tgt))
            {
                System.out.println(arr[i]+"--"+arr[j]);
                break;
            }

            if(arr[j]-arr[i]<tgt)j++;

            else i++;
        }
    }
}
