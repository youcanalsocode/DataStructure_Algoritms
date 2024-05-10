package graph;

import java.util.Arrays;

public class flood_fill {
    public static void main(String [] args) {
        int image[][]={{1,1,1},{1,1,0},{1,0,1}};
        floodFill(image,1,1,2);
        System.out.println(Arrays.deepToString( floodFill(image,1,1,2)));
    }

    private static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        boolean[][] vis =  new boolean[image.length][image[0].length];
        int val=image[sr][sc];
        // image[sr][sc]=color;
        help(sr,sc,val,color,image,vis);
        return image;
    }
    static void help(int sr,int sc,int val,int color,int [][]image,boolean [][] vis )
    {
        if(sr<0 || sr>=image.length || sc<0 || sc>=image[0].length || image[sr][sc]!=val||vis[sr][sc])return;

        vis[sr][sc]=true;
        image[sr][sc]=color;
        help(sr+1,sc,val,color,image,vis);
        help(sr-1,sc,val,color,image,vis);
        help(sr,sc+1,val,color,image,vis);

        help(sr,sc-1,val,color,image,vis);


        //   return image;
    }
    }



