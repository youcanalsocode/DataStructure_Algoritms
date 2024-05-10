package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class bfs {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        System.out.println(T);
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            System.out.println(V);
            int E = Integer.parseInt(s[1]);
            System.out.println(E);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < V; i++) adj.add(i, new ArrayList<Integer>());
            System.out.println(adj);
            for (int i = 0; i < E; i++) {
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                System.out.println(adj);
                // adj.get(v).add(u);
            }

            ArrayList<Integer> ans = bfsOfGraph(V, adj);
            for (int i = 0; i < ans.size(); i++)
                System.out.print(ans.get(i) + " ");
            System.out.println();
        }

        }



    public static  ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here

        ArrayList<Integer>  ans=new ArrayList<Integer>() ;
        Queue<Integer> q=new LinkedList<>();
        int s=adj.size();
        System.out.println(s);
        Boolean vis []=new Boolean [s+1];
        for (int i = 0; i <=s ; i++) {
           vis[i]=false;
        }


        q.add(0);
        vis[0]=true;
        while(!q.isEmpty())
        {
            int pop=q.poll();
            ans.add(pop);
            System.out.println(ans);
         //   int size=adj.get(pop).size();

            for(int i=0;i<adj.get(pop).size();i++)
            {
                int val=adj.get(pop).get(i);

                System.out.println(i+"------"+val);
                System.out.println(vis[val]);
                if(!ans.contains(val) && vis[val]!=true)
                {
                    vis[val]=true;
                    q.add(val);
                    System.out.println("queru"+q);

                }
            }
        }
        return ans;
    }
}
