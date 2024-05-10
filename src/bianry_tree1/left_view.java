package bianry_tree1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class left_view {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        create bt=new create();

        bt.ins(sc);

        bt.display();
        System.out.println(  leftv(bt.root));
    }

    private static ArrayList<Integer> leftv(create.node root) {
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
            int p=q.peek().value;
            ans.add(p);
           // System.out.println(ans);
            for (int i = 0; i < x ; i++) {
                create.node temp =q.remove();
                if(temp.left!=null)
                q.add(temp.left);
                if(temp.right!=null)
                q.add(temp.right);

            }
        }
        return ans;
    }
}
