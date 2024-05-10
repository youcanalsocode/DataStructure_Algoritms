package bianry_tree1;

import java.util.Scanner;

public class isomorphic {
    public static void main(String[] args) {
        create c=new create();
        create d=new create();
        c.ins(new Scanner(System.in));
        d.ins(new Scanner(System.in));
        c.display();
        d.display();

        System.out.println( isiso(c.root,d.root));
    }

    private static boolean isiso(create.node root, create.node node) {
        if(root==null && node==null)return true;
        if(root==null || node==null) return false;
        boolean l1=isiso(root.left,node.left);
        boolean r1=isiso(root.right,node.right);
        boolean l2=isiso(root.left,node.right);
        boolean r2=isiso(root.right,node.left);
        return (l1&&r1)||(l2&&r2);

    }
}
