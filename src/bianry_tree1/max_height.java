package bianry_tree1;

import java.util.Scanner;

public class max_height {

    static  int height (create.node root)
    {
        //System.out.println("fun call");
        //System.out.println(root.value);
        if(root==null)return 0;
       // System.out.println("root"+ root.value);

        int left=height(root.left);
       // System.out.println("left--"+left);
        int right=height(root.right);

       // System.out.println("right--"+right);

        {
           // System.out.println("t");
            return Math.max(left,right)+1;
        }

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        create bt=new create();
       //create.node root= bt.root;
       // System.out.println(root.value);
        bt.ins(sc);
       // bt.display();
        System.out.println( height(bt.root));

    }
}
