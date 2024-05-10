package greedy1;
import  java.util.*;
public class sum_diff {

   static long findMinSum(int[] A, int[] B, int N) {
        Arrays.sort(A);
        Arrays.sort(B);
        long sum = 0;

        for (int i = 0; i < N; i++) {
            sum = sum + Math.abs((A[i] - B[i]));
        }
        return sum;
    }
        public static void main (String[]args){
                int A[]={1,2,3};
                int B[]={6,5,4};
                int n=3;
            System.out.println(   findMinSum(A,B,n));

        }
    }

