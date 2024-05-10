package greedy1;
//stack is given in the form of array and can remove the top element to get all three stacks sum equal
public class eql_sum_3_stack {
    public static void main(String[] args) {
        int stack1[] = { 3, 10};
        int stack2[] = { 4, 5 };
        int stack3[] = { 2, 1 };
        int sum1=0;
        int sum2=0;
         int sum3=0;

        for (int i = 0; i <stack1.length ; i++) {
            sum1+=stack1[i];
        }
        for (int i = 0; i <stack2.length ; i++) {
            sum2+=stack2[i];
        }
        for (int i = 0; i <stack3.length ; i++) {
            sum3+=stack3[i];
        }
        int n1=stack1.length;
        int n2=stack2.length;
        int n3=stack3.length;
        int top1 =0, top2 = 0, top3 = 0;
        int ans = 0;
        while (true)
        {
            // If any stack is empty
            if (top1 == n1 || top2 == n2 || top3 == n3)

            {
                System.out.println(0);
                break;
            }


            // If sum of all three stack are equal.
            if (sum1 == sum2 && sum2 == sum3)
            {
                System.out.println(sum1);
                break;
            }


            // Finding the stack with maximum sum and
            // removing its top element.
            if (sum1 >= sum2 && sum1 >= sum3)
                sum1 -= stack1[top1++];
            else if (sum2 >= sum1 && sum2 >= sum3)
                sum2 -= stack2[top2++];
            else if (sum3 >= sum2 && sum3 >= sum1)
                sum3 -= stack3[top3++];
        }
    }
}
