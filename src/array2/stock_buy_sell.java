package array2;

public class stock_buy_sell {
    public static void main(String[] args) {
        int ar[]={3,100,1,4,10};
        System.out.println(  best(ar));
    }

    private static int best(int[] ar) {

        int low=ar[0];
        int profit =0;
        for(int i=1;i<ar.length;i++)
        {
            if(low>ar[i])
            {
                low=ar[i];
                // high=prices[i];
            }//else if(high<prices[i])high=prices[i];
            if(profit<ar[i]-low)profit=ar[i]-low;

        }
        return profit;
    }
}
