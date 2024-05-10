package bianry_tree1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class leaf_same_level {
    public static void main(String[] args) {
        create ct = new create();

        ct.ins(new Scanner(System.in));
        System.out.println(check(ct.root));

        ct.display();


    }


   static int k=-1;
   static boolean check(create.node root)
    {
        // Your code here
        return check(root,0);



    }
  static   boolean check(create.node root, int h)
    {
        if(root==null )return true;
        if(root.left==null && root.right==null)
        {
            if(k==-1)k=h;
            return k==h;
        }
        return  check(root.left,h+1)&&check(root.right,h+1);

    }

}


