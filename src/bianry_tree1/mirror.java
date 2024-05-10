package bianry_tree1;

import java.util.Scanner;

public class mirror {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        create bt=new create();
        create ct=new create();

        bt.ins(sc);
        ct.insp();
        bt.display();
        ct.display();
        mir(bt.root,ct.root);
    }

    private static void mir(create.node root, create.node root1) {
        if(root==null )return;
        create.node n=root;
        root1=new create.node(root.value);
        root1.left=root.right;
        root1.right=root.left;


    }
}
