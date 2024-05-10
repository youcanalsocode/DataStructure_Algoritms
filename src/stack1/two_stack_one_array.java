package stack1;



        import java.util.Arrays;

class arraystack{
    //constructor
    int s;
    int arr[];
    int top1;
    int top2;
    arraystack(int n)
    {
        s=n;
        arr=new int[s];
        top1=n/2+1;
        top2=n/2;

    }

    void push1(int p)
    {
        if(top1>0){
            top1--;
            arr[top1]=p;
        }else{
            System.out.println("stack 1 is overflowed");
        }
        System.out.println(Arrays.toString(arr));
    }
    void push2(int p)
    {
        if(top2<s-1){
            top2++;
            arr[top2]=p;
        }else{
            System.out.println("stack 2 is overflowed");
        }
        System.out.println(Arrays.toString(arr));
    }

    int pop1()
    {
        if(top1<=s/2){

            int x=arr[top1];
            top1--;
            return x;

        }else{
            System.out.println("stack 1 is underflowed");
        }
        return -1;

    }

    int pop2()
    {
        if(top2>=s/2+1){
            int x=arr[top2];
            top2--;
            return x;

        }else{
            System.out.println("stack 2 is underflowed");
        }
        return -1;
    }


}
public class two_stack_one_array {
    public static void main(String args[]){
        arraystack stk=new arraystack(6);
        stk.push1(20);
        stk.push1(30);
        stk.push1(40);
        stk.push1(50);
        stk.push1(60);
        stk.push2(11);
        stk.push2(12);
        stk.push2(12);
        int val=stk.pop1();
        System.out.println(val);


    }
}
