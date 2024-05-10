package linked_list1;

public class delete_wo_head {
    public static void main(String[] args) {
        ll_operations l=new ll_operations();
        l.instf(4);
        l.instf(3);
        l.instf(2);
        l.instf(1);
        l.display();
        int delete=2;
        ll_operations.node temp0= l.getnode(delete-1);
       ll_operations.node temp= l.getnode(delete);
       ll_operations.node temp2= l.getnode(delete+1);
       temp0.next=temp2;
        l.display();



    }
}
