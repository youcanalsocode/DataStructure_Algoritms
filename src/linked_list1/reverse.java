package linked_list1;

public class reverse {
    public static void main(String[] args) {
        ll_operations l=new ll_operations();
        l.instf(4);
        l.instf(3);
        l.instf(2);
        l.instf(1);
        l.display();
        ll_operations.node cur=l.hd();
        //  ll_operations.node cur=head;
        ll_operations.node next=null;
        ll_operations.node prev=null;
        //while will reverse the ll and the function call will printi it (old display method is not used bcoz it takes head as first parameter the head that is already difiend in that class and will alwasy ponit to 1 only
        while(cur!=null){


            next=cur.next;

            cur.next=prev;
            prev=cur;
            cur=next;

        }

        //  ll_operations.node hd=l.hd(prev);
        System.out.println("code");
        l.revll(prev);






    }
}
