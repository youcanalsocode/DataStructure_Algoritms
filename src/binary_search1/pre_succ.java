package binary_search1;

import java.util.Scanner;

public class pre_succ {
    static int suc,pre;
    public static void main(String[] args) {
        srch_tre_create c=new srch_tre_create();
        c.ins(new Scanner(System.in));
        c.display();
        srch_tre_create.node pre=findpre(c.root,5);
        if(pre==null) System.out.println("-1");
       else System.out.println(pre.value);
        srch_tre_create.node suc=findsuc(c.root,5);
        if(suc==null) System.out.println("-1");
       else System.out.println(suc.value);

    }

    private static srch_tre_create.node findsuc(srch_tre_create.node root, int i) {
        srch_tre_create.node suc=null;
        while (root!=null)
        {
            if(root.value>i)
            {
                suc=root;
                root=root.left;
            }else{
                root=root.right;
            }
        }

        return suc;
    }

    private static srch_tre_create.node findpre(srch_tre_create.node root, int i) {
        srch_tre_create.node pre=null;
        while(root!=null)
        {
            if(root.value>=i)
            {
                root=root.left;
            }else
            {
                pre=root;
                root=root.right;
            }

        }

        return pre;
    }


}
