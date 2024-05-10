package greedy1;

import java.util.Arrays;

//min coin required to aquire all the coins and the
// condition is when u will aquire a coin you can aquire k more coins from that coin
public class min_coin_all_coin {
    public static void main(String[] args) {
        int coin[]={2,3,4,5};
        int k=3;

        int x=coin.length;
        int i=0;
        Arrays.sort(coin);

        while(x>=k)
        {
            System.out.println("x"+x);
            x=x-k;
            System.out.println(coin[i]);
            i++;
        }
    }
}
