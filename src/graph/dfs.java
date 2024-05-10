package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class dfs {
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
            for (int i = 0; i < V; i++) adj.add(i, new ArrayList<>());
            System.out.println(adj);
            for (int i = 0; i < E; i++) {
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                System.out.println(adj);
                // adj.get(v).add(u);
            }

            ArrayList<Integer> ans = dfsOfGraph( adj);
            for (int i = 0; i < ans.size(); i++)
                System.out.print(ans.get(i) + " ");
            System.out.println();
        }

    }

    private static ArrayList<Integer> dfsOfGraph(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(0);
        help(ans,0,adj);
        return ans;
    }

    private static void help(ArrayList<Integer> ans, int curr,ArrayList<ArrayList<Integer>> adj) {
        for(int i=0;i<adj.get(curr).size();i++)
        { if(!ans.contains(adj.get(curr).get(i)))
            ans.add(adj.get(curr).get(i));
            help(ans,adj.get(curr).get(i),adj);
        }

    }
}
