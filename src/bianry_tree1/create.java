package bianry_tree1;

import java.util.Scanner;

public class create {
 public static   class node
    {
        int value;
        public node left;
        public node right;
       public   node(int val)
        {
            this.value=val;
        }

    }
   public node root;
public create()
    {}
    public void ins(Scanner sc) {


        this.root = new node(10);
        root.left=new node(50);
        root.right=new node(80);
        root.left.left=new node(40);
        root.left.right=new node(30);
       // root.right.left=new node(60);
        root.right.right=new node(5);
    //    root.left.left.right=new node(11);
     //   root.left.left.right.left=new node(12);


      //  System.out.println(root.value);
     //   this.ins(sc, this.root);
    }
    public void insp() {


        this.root = new node(10);
        root.left=new node(20);
        root.right=new node(30);

        //  System.out.println(root.value);
        //   this.ins(sc, this.root);
    }
    public void ins(Scanner sc, node rt) {
        System.out.println("do your wish to print left of:" + rt.value);
        boolean ans = sc.nextBoolean();
        if (ans) {
            System.out.println("enter left data:");
            int value = sc.nextInt();
            rt.left = new node(value);
            this.ins(sc, rt.left);
        }

        System.out.println("do your wish to print right of:" + rt.value);
        boolean ans2 = sc.nextBoolean();
        if (ans2) {
            System.out.println("enter right data:");
            int value2 = sc.nextInt();
            rt.right = new node(value2);
            this.ins(sc, rt.right);
        }

    }


    public void display() {
        this.display(this.root, "");
    }

    public void display(node ns, String indt) {
        if (ns != null) {
            System.out.println(indt + ns.value);
            this.display(ns.left, indt + "\t");
            this.display(ns.right, indt + "\t");
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new create();
        create bt = new create();
        bt.ins(sc);
        bt.display();
        max_height.height(bt.root);
    }

}


