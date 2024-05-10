package bianry_tree1;

import java.util.*;
import java.util.Scanner;

public class bt_to_bst {
    public static void main(String[] args) {
        create bt=new create();
        bt.ins(new Scanner(System.in));
        bt.display();
        ArrayList<Integer> bfs=new ArrayList<>();
        getval(bt.root,bfs);
        System.out.println(bfs);
        Collections.sort(bfs);
        System.out.println(bfs);
        crbst(bt.root,bfs);
        bt.display();


    }
static int i=0;
    private static void crbst(create.node root, ArrayList<Integer> bfs) {
        if(root==null)return;
        crbst(root.left,bfs);
        root.value=bfs.remove(0);
        
        crbst(root.right,bfs);

    }

    private static void getval(create.node root, ArrayList<Integer> bfs) {
        if(root==null)return;

        bfs.add(root.value);
        Queue<create.node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            create.node temp=q.remove();
            if(temp.left!=null)
            {
                q.add(temp.left);
                bfs.add(temp.left.value);
            }
            if(temp.right!=null)
            {
                q.add(temp.right);
                bfs.add(temp.right.value);
            }
        }
    }
}
