package binary_search1;

import java.util.Scanner;

public class dead_end {
    public static void main(String[] args) {
        srch_tre_create c=new srch_tre_create();
        c.ins(new Scanner(System.in));
        c.display();
        System.out.println( isDeadEnd(c.root));
    }

        public static boolean isDeadEnd(srch_tre_create.node root)
        {
            return solve(root,1,Integer.MAX_VALUE);
        }
        private static boolean  solve(srch_tre_create.node root,int min,int max){
            System.out.println("------------------------");
            System.out.println("min  : "+min+"max  :  "+max);
            if(root==null) {

                //System.out.println("false into:  "+root.value);
                return false;
            }
            System.out.println("not null cond");
            if(min==max)

            {
                System.out.println("------------------------");
                System.out.println("min  : "+min+"max  :  "+max);
                System.out.println("true into:  "+root.value);
                return true;
            }


            return solve(root.left,min,root.value-1)  || solve(root.right,root.value+1,max);
        }
    }


