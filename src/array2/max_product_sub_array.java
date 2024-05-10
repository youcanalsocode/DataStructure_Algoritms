package array2;

public class max_product_sub_array {
    public static void main(String[] args) {
        int ar[]={2,3,-2,4,3};
        int p=ar[0]*ar[1];
        int sum=p;
        for (int i = 2; i <ar.length ; i++) {

            p=p*ar[i];
         //   System.out.println(p);
            if(sum<p)sum=p;
            if(p<0)p=1;
        }
        System.out.println(sum);
    }
}
