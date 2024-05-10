package bianry_tree1;

import java.util.*;

public class zigziag {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        create bt=new create();
        create ct=new create();
        bt.ins(sc);

        bt.display();
        System.out.println( zig(bt.root));
    }

    private static ArrayList<Integer> zig(create.node root) {
        ArrayList<Integer> ans= new ArrayList<>();
        if(root==null)return ans;
        int c=0;
        Queue<create.node> q=new LinkedList<>();
        q.add(root);
        int flag=0;
        while (!q.isEmpty())
        {
            ArrayList<Integer> temp=new ArrayList<>();
            int s=q.size();
            for(int i=0;i<s;i++)
            {
                temp.add(q.peek().value);
                create.node n=q.remove();
                if(n.left!=null)q.add(n.left);
                if(n.right!=null)q.add(n.right);


            }
            if(flag==0)
            {
                for(int i=0;i<temp.size();i++)
                {
                    ans.add(temp.get(i));
                }
                flag=1;
            }
            else if(flag==1)
            {
                for(int i=temp.size()-1;i>=0;i--)
                {
                    ans.add(temp.get(i));
                }
                flag=0;

            }

        }
        return ans;
    }
}
