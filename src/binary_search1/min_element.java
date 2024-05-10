package binary_search1;

import java.util.Scanner;

public class min_element {
    public static void main(String[] args) {
        srch_tre_create c=new srch_tre_create();
        c.ins(new Scanner(System.in));
        c.display();
        System.out.println(   mine(c.root));
    }

    private static int mine(srch_tre_create.node root) {
        if(root==null)return -1;
        if(root.left!=null)return mine(root.left);
        else return root.value;
    }
}
