package stack1;

import java.util.Queue;

public class stk_qu_dqu {

    static class deq_node {
int val;

        deq_node next;
        deq_node prev;
    }
    public static class dqu
    {
        private deq_node head;
        private  deq_node tail ;
        public dqu() {
            head=tail=null;
        }
        public  boolean isempty()
        {
            if (head == null)
                return true;

            return false;
        }
        public int size()
        {
             if(!isempty())
             {
                 deq_node curr=head;
                 int length=0;
                 while(curr!=null)
                 {
                     length++;
                     curr=curr.next;
                 }
                 return length;
             }

            return 0;
        }
        void insertfirst(int x)
        {
            deq_node tp=new deq_node();
            tp.val=x;
            if(head==null)
            {
                head=tail=tp;

                head.next=head.prev=null;
            }else
            {

                head.prev=tp;
                tp.next=head;
                tp.prev=null;
                head=tp;
            }


        }
        void insertlast(int x)
        {  deq_node tp=new deq_node();
            tp.val=x;
            if(head==null)
            {
                head=tail=tp;

                head.next=head.prev=null;
            }else {
                tail.next=tp;
                tp.prev=tail;
                tp.next=null;
                tail=tp;
            }

        }
        void removefirst()
        {
            if(!isempty())
            {
                deq_node temp=head;
                head=head.next;
                head.prev=null;

            }

        }
        void removelast()
        {
            if(!isempty())
            {
                deq_node temp=tail;
                tail=tail.prev;
                tail.next=null;
            }
        }

        void display()
        {

            // If list is not empty
            if (!isempty())
            {
                deq_node temp = head;

                while (temp != null)
                {
                    System.out.print(temp.val + " ");
                    temp = temp.next;
                }

                return;
            }
            System.out.print("List is Empty");
        }





    }

    /*stack**********************************************************************************/

  static   class stack1
    {
        dqu q=new dqu();
        void push()
        {
           q.insertlast(1);
           q.insertlast(2);
           q.insertlast(3);

        }
        void pop()
        {
            q.removelast();
        }

        void disply()
        {
            q.display();
        }




    }


    /*queue************************************************************************************/

        static class queue
        {  dqu q=new dqu();
            void push()
            {
                q.insertlast(1);
                q.insertlast(2);
                q.insertlast(3);

            }
            void pop()
            {
                q.removefirst();
            }
            void display()
            {
                q.display();
            }

        }

    public static void main(String[] args) {
            stack1 s=new stack1();
            s.push();
            s.disply();
            s.pop();
        System.out.println();
            s.disply();

        System.out.println("queue");
        queue q=new queue();
        q.push();
        q.display();
        q.pop();
        System.out.println();
        q.display();

    }
}
