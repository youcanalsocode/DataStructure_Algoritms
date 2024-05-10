package practise;

public class rec_fibo {

    public static void main(String[] args) {
        int n=3;

        System.out.println( fibonac(n));

    }

    private static int fibonac(int n) {
        if(n==0)return 0;
        if(n<=1)return 1;
        return fibonac(n-1)+fibonac(n-2);


    }

}

