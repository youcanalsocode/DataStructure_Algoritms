package bianry_tree1;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        create c=new create();
        c.ins(new Scanner(System.in));
        c.display();
        convert(c.root);
        c.display();
    }

    private static int convert(create.node root) {
        if(root==null)return 0;
        int l=convert(root.left);
        int r=convert(root.right);
        int val=root.value;
        root.value=l+r;
        return val+l+r;


    }
}
