package linked_list1;

public class cycle {
    public static void main(String[] args) {
        ll_operations l=new ll_operations();
        l.instf(4);
        l.instf(3);
        l.instf(2);
        l.instf(1);
        l.display();
        ll_operations.node slow=l.hd();
        ll_operations.node fast=l.hd();
        while(fast!=null ||fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast);
            System.out.println("true");
            break;

        }
    }
}
