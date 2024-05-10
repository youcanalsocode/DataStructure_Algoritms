package bit_prac;

public class Duplicate {
    public static void main(String[] args) {
        int d[]={2,3,2,4,4,1,1};
       // System.out.println(2^0);
        int u=0;
        for(int x:d)
        {
           u^=x;
            System.out.println(u);
        }
        System.out.println(u);
    }
}
