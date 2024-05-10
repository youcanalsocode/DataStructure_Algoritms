package bianry_tree1;

import java.util.Scanner;

public class inverse {

    private static void inv(create.node root) {

        if(root==null)return;
        System.out.println("root.value"+root.value);
      //  create.node l=root.left;
      //  create.node r=root.ri;
        if(root!=null)
        {
            create.node temp=root.left;
            root.left=root.right;
            root.right=temp;
        }

        inv(root.left);
        inv(root.right);
       // System.out.println("root val+---"+root.value);


      /*  if(root.left!=null)
        {
            int temp=root.left.value;
            root.left.value=root.right.value;
            root.right.value=temp;
        }*/



    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        create bt=new create();

        bt.ins(sc);
        bt.display();
        inv(bt.root);
        System.out.println("---------------");
        bt.display();

    }


}
