package bianry_tree1;

import java.util.Scanner;

public class same_tree {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        create bt=new create();
        create ct=new create();
        bt.ins(sc);
        ct.insp();
        bt.display();
        ct.display();
        System.out.println(  same(bt.root,ct.root));
    }

    private static boolean same(create.node root, create.node root1) {
        if(root==null && root1==null)return true;
        if(root==null || root1==null)return false;
        if(root.value!=root1.value)
            return false;
           return same(root.left,root1.left) && same(root.right,root1.right);

    }
}
