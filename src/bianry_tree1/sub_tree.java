package bianry_tree1;

import java.util.Scanner;

public class sub_tree {


    static boolean sub(create.node a, create.node b)
    { if (a==null)return false;
        if(a==null && b==null) return true;
     //   System.out.println(a.value+"main"+b.value);
       if( issame(a,b))return true;
        return (sub(a.left,b) ||sub(a.right,b));


    }

    private static boolean issame(create.node a, create.node b) {
       // System.out.println(a.value+"same"+b.value);

        if(a==null && b==null)

        {
           // System.out.println("b is null");
            return true;
        }
        if(a==null || b==null)

        {
           // System.out.println("a is  null");
            return  false;
        }
        if(a.value!=b.value)return false;

        {
           // System.out.println("final n:" +a.value+"---"+b.value);
           // System.out.println("final t:" +a.value+"---"+b.value);
            return issame(a.left,b.left) && issame(a.right,b.right);



          //  {issame(a.left,b.left); System.out.println(a.value+"--1--"+b.value);};
           // {'issame(a.right,b.right);System.out.println(a.value+"--2-"+b.value);};
        }



    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        create bt=new create();
        create ct=new create();
        bt.ins(sc);
        ct.insp();
        bt.display();
        ct.display();
        System.out.println( sub(bt.root,ct.root));
        
    }
}
