package bianry_tree1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class right_view {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        create bt=new create();

        bt.ins(sc);

        bt.display();
        System.out.println(  rightv(bt.root));
    }

    private static ArrayList<Integer> rightv(create.node root) {
        ArrayList<Integer> ans=new ArrayList<>();
        // ans.add(root.value);
        // System.out.println(ans);
        if(root==null) return ans;
        Queue<create.node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            // System.out.println(q.size());
            int x=q.size();

            // System.out.println(ans);
            for (int i = 0; i < x ; i++) {
                create.node temp =q.remove();
                if(i==x-1)ans.add(temp.value);
                if(temp.left!=null)
                    q.add(temp.left);
                if(temp.right!=null)
                    q.add(temp.right);

            }


        }
        return ans;
    }
}


