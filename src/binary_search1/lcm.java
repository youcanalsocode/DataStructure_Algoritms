package binary_search1;

import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        srch_tre_create s=new srch_tre_create();
        s.ins(new Scanner(System.in));
        s.display();

        System.out.println( lcmm(s.root,13,11));
    }

    private static int lcmm(srch_tre_create.node root, int i, int j) {
        if(root==null)return -1;
int x=0;
        if(root.value>i &&root.value>j)return lcmm(root.left,i,j);
       else if(root.value<i &&root.value<j)return lcmm(root.right,i,j);
       else return root.value;


    }



}
