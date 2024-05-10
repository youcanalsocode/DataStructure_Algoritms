package linked_list1;

public class multiply {
    public static void main(String args[]){
        ll_operations a=new ll_operations();
        ll_operations b=new ll_operations();
        a.instf(1);
        a.instf(2);
        a.instf(3);
        b.instf(2);
        b.instf(1);
        ll_operations.node h1=a.hd();
        ll_operations.node h2=b.hd();
        //System.out.println(h2next.data);
        long num1=0;
        long num2=0;
        while (h1!=null|| h2!=null){
            if(h1!=null){
                num1=num1*10+h1.data;
                h1=h1.next;

            }
            if(h2!=null){
                num2=num2*10+h2.data;
                h2=h2.next;


            }


        }


        a.display();
        b.display();
        System.out.println(num1+"--"+num2);
        System.out.println(num1*num2);


    }

}
