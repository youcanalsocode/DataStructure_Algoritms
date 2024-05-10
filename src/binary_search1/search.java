package binary_search1;

import java.util.Scanner;

public class search {
    public static void main(String[] args) {
srch_tre_create c=new srch_tre_create();

c.ins(new Scanner(System.in));
c.display();
int val=15;
        System.out.println(findin(c.root,val));
    }

    private static boolean findin(srch_tre_create.node root,int val) {
        if(root==null)return false;

         if(root.value>val)
             return findin(root.left,val) ;
         else if(root.value<val)
             return findin(root.right,val);
         else return true;

    }
}
