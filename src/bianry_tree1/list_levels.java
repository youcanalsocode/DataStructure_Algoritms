package bianry_tree1;

import java.util.*;

public class list_levels {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        create bt=new create();

        bt.ins(sc);
         bt.display();
        System.out.println( level(bt.root));
    }

    private static   List<List <Integer> > level(create.node root) {

        List<List <Integer> > ans=new LinkedList<>();
        Queue<create.node> q=new LinkedList<>();
if(root==null) return ans;
q.add(root);
while(!q.isEmpty())
{


    int size=q.size();
    System.out.println(q.size());
    ArrayList <Integer> a=new ArrayList<>();
    for(int i=0;i<size;i++)

    {
       create.node temp= q.peek();

        if(temp.left!=null)
        {
            q.add(temp.left);
        }
        if(temp.right!=null)
        {
            q.add(temp.right);
        }
        a.add(q.remove().value);

    }
    //System.out.println(ans);
    ans.add(a);




   // q.add(root.right);


}
      // level2(a,ans,root);
       return ans;
    }

//    private static void level2(ArrayList<Integer> a, ArrayList<ArrayList<Integer>> ans, create.node root) {
//       // System.out.println(root.value);
//       // System.out.println(ans);
//        a.clear();
//        if(root==null)return ;
//        if(root.left!=null)
//        a.add(root.left.value);
//        if(root.right!=null)
//        a.add(root.right.value);
//        ans. add(a);
//        level2(a,ans,root.left);
//        level2(a,ans,root.right);
//
//    }
}
