package graph;

public class triangle {
    public static void main(String[] args) {
      int  n=4;
        int graph[][]={{0, 0, 1, 0},
            {1, 0, 0, 1},
            {0, 1, 0, 0},
            {0, 0, 1, 0}};
        System.out.println(numberOfTriangles(n,graph));
    }
    public static int numberOfTriangles(int n, int[][] g) {
        int c=0;
        // code here
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                for(int k=0;k<n;k++)
                {
                    if( i!=j && j!=k && k!=i && g[i][j]==1 && g[j][k]==1 && g[k][i]==1)
                    {
                        c++;
                    }
                }
            }
        }
        return c/3;//incase of directed(for non directed c/6)
    }
}
