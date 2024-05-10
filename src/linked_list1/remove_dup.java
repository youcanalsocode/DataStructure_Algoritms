package linked_list1;
import java.util.*;
public class remove_dup{
    public  static void  main (String args[])
    {
        ll_operations l=new ll_operations();
        l.instf(2);
        l.instf(5);
        l.instf(3);
        l.instf(2);
        l.instf(3);
        l.instf(1);
        l.instf(5);
        l.display();
        ll_operations.node head=l.hd();
        //    System.out.println(head.data);
        /*solution*/

        HashSet<Integer> mp=new HashSet<>();
        ll_operations.node curr=head.next;
        ll_operations.node prev=head;
        mp.add(prev.data);
        while(curr!=null){

            if(!mp.contains(curr.data)){
              //  System.out.println(mp);
              //  System.out.println("adding "+curr.data);

                mp.add(curr.data);
                curr=curr.next;
                prev=prev.next;


            }
            else{

               prev.next=curr.next;
                curr=curr.next;
                l.size--;

            }
        }
        l.display();
    }
}
