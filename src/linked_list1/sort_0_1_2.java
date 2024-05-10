package linked_list1;

import java.util.HashMap;

public class sort_0_1_2 {
    public static void main(String[] args) {
        ll_operations l=new ll_operations();
        ll_operations l2=new ll_operations();
        l.instl(0);
        l.instl(0);
        l.instl(2);
        l.instl(2);
        l.instl(1);
        l.instl(0);
        l.display();
        HashMap <Integer,Integer> mp=new HashMap<>();
        ll_operations.node cur=l.hd();
        while(cur!=null)
        {
            mp.put(cur.data, mp.getOrDefault(cur.data,0)+1);
            cur=cur.next;
        }
        while(mp.get(0)>0)
        {
            l2.instl(0);
            mp.put(0, mp.getOrDefault(0,0)-1);
        }
        while(mp.get(1)>0)
        {
            l2.instl(1);
            mp.put(1, mp.getOrDefault(1,0)-1);
        }
        while(mp.get(2)>0)
        {
            l2.instl(2);

            mp.put(2, mp.getOrDefault(2,0)-1);
        }
        l2.display();

    }
}
