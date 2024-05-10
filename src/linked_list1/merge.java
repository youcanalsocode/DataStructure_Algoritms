package linked_list1;

public class merge {
    public static void main(String args[]) {


        ll_operations l1 = new ll_operations();
        ll_operations l2 = new ll_operations();
        l1.instl(1);
        l1.instl(2);
        l1.instl(3);
        l1.instl(4);
        l2.instl(2);
        l2.instl(3);
        l2.instl(4);
        l2.instl(5);
        l1.display();
        l2.display();
        ll_operations.node head=l1.hd();
        ll_operations.node head2=l2.hd();
        ll_operations.node tail=null;
        if(head.data<=head2.data){
            l1.changehead( head);
            tail=l1.hd();
            // System.out.println("dddd"+tail.data);
            head=head.next;
        }else{
            l1.changehead( head2);
            tail=l1.hd();
            // System.out.println("iiiiiiiiiiiiiiiii"+tail.data);
            head2=head2.next;
        }

        while(head!=null && head2!=null){
            System.out.println("dddd--"+head.data+"  df--"+head2.data);
            System.out.println("tailllllllllllllllll:--"+tail.data);
            if(head.data<=head2.data){
                tail.next=head;
                tail=head;
                head=head.next;
            }else{
                tail.next=head2;
                tail=head2;
                head2=head2.next;
                l1.changesize(1);
            }
        }
        while(head!=null)
        {
            tail.next=head;
            tail=head;
            head=head.next;
        }
        while(head2!=null)
        {
            tail.next=head2;
            tail=head2;
            head2=head2.next;
        }
        l1.display();
    }
}
