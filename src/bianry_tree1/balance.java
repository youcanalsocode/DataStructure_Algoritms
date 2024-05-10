package bianry_tree1;

import javax.swing.*;
import java.util.Scanner;

public class  balance {
    public static void main(String[] args) {
        create bt=new create();
        bt.ins(new Scanner(System.in));
        bt.display();
        System.out.println(  balan(bt.root));
    }

    private static boolean balan(create.node root) {

        if(root==null)return true;
        System.out.println("root"+root.value);
        int left=helper(root.left);
        System.out.println("left-value "+left);
        int right=helper(root.right);
        System.out.println("right-value "+right);
        if(Math.abs(left-right)>1)return false;

        return balan(root.left) && balan(root.right);
    }

    private static int helper(create.node root) {

    if(root==null)return 0;
        System.out.println("helper: "+root.value);
    return Math.max(helper(root.left),helper(root.right)+1);
    }
}
