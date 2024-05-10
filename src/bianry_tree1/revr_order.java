package bianry_tree1;

import java.util.*;

public class revr_order {


    public  static ArrayList<Integer> revr(create.node root)
    {
        // code here
        Queue<create.node> list=new LinkedList<>();
        ArrayList <Integer> ans=new ArrayList<>();
        list.add(root);
        while(!(list.isEmpty()))
        {
            create.node temp=list.remove();
            ans.add(temp.value);
            if(temp.right!=null)
                list.add(temp.right);
            if(temp.left!=null)
                list.add(temp.left);


        }
        Collections.reverse(ans);
        return ans;

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        create bt=new create();

        bt.ins(sc);
        // bt.display();
        System.out.println( revr(bt.root));

    }
}
