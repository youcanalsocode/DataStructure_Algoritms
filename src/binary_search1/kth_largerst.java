package binary_search1;
import  java.util.*;
public class kth_largerst {
    public static void main(String[] args) {
        srch_tre_create s=new srch_tre_create();
        s.ins(new Scanner(System.in));
        s.display();

int ans=0;
int K=1;
        //Your code here
        ArrayList<Integer> dfs = new ArrayList<>();
        if (s.root == null) ans= -1;
        //dfs.add(s.root.value);
        helper(s.root, dfs);
        System.out.println(dfs);
        System.out.println(dfs.size());
        System.out.println(dfs.get(dfs.size()-K));
    }
   static void helper(srch_tre_create.node root,ArrayList<Integer> dfs )
    { if(root!=null)
    {
        helper(root.left,dfs);

        dfs.add(root.value);
        helper(root.right,dfs);
    }

    }
}
