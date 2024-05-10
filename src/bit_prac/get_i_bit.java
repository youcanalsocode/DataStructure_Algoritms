package bit_prac;

public class get_i_bit {
    public static void main(String[] args) {
        int x=7;
       int n=2;

        int ith=x & (1<<(n-1));
        System.out.println(ith);
    }
}
