package linked_list1;

public class ll_operations {
    node head;
    node tail;
    int size=0;
    public class node{
        int data;
        node next;
        public node(int data){
            this.data=data;
            this.next=next;
        }

    }
    public void instf(int data){
        node n=new node(data);
        n.next=head;
        head=n;
        if(tail==null){
            tail=head;//if no nod eis present initially
        }
        size++;
    }
    public void instl(int data){
        node n=new node(data);

        if(tail==null){


            instf(data);
            return;
        }else {

            tail.next = n;
            tail = n;
        }

        size++;
    }
    public void inst(int data,int loc){
        if(loc==0){
            instf( data) ;
        }
        else if(loc==size-1){
            instl( data) ;
        }else {
            node n = new node(data);
            node prev = getnode(loc);
            node temp = prev.next;
            prev.next = n;
            n.next = temp;
        }
        size++;
    }
    public node getnode(int loc)
    {
        node curr=head;
        for(int i=1;i<loc;i++){
            curr=curr.next;//will return the previos value of given location eg loc :3 then will return  node at 2
        }
        return curr;
    }

    public void display(){

        node curr=head;
        while(curr!=null){
            System.out.print(curr.data+"-->");
            curr=curr.next;
        }
        System.out.println("Null");
        System.out.println("size:"+size);
    }

    public void revll(node prev){//reversing ll

        node curr=prev;
        while(curr!=null){
            System.out.print(curr.data+"-->");
            curr=curr.next;
        }
        System.out.println("Null");
        System.out.println("size:"+size);
    }
    public node hd(){
        return head;
    }



    public int deletef(){
        int n=head.data;
        head=head.next;
        size--;
        return n;
    }

    public int deletel(){
        node cu=head;
        for(int i=0;i<size-1;i++){
            cu=cu.next;
        }
        int n=cu.data;
        cu.next=null;
        size--;
        return n;
    }

    public void changehead(node temp){
        head=temp;
    }
    public void changesize(int num){
        size=size+num;
    }

    public int delete(int loc){
        node temp=getnode(loc-1);
        node temp2=getnode(loc);
        int n=temp2.data;
        if(loc==1){

            deletef();
        }
        if(loc==size){

            deletel();
        }else{


            temp.next=temp2.next;
            size--;
        }

        return n;


    }

}
