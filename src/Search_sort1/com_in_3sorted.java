package Search_sort1;
import java.util.*;
class sol
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3)
    {
        ArrayList<Integer>cm=new ArrayList<>();
        int i=0;
        int j=0;
        int k=0;
        while(i!=n1&&j!=n2&&k!=n3)
        {
            int max=Math.max(Math.max(A[i],B[j]),C[k]);
            if(A[i]==B[j] && B[j]==C[k])
            {
                if(!cm.contains(A[i]))

                    cm.add(A[i]);


                i++;
                j++;
                k++;
            }else if(A[i]<max )
            {
                i++;
            }else if(B[j]<max  )
            {
                j++;


            }
            else
            {
                k++;
            }

        }

        return cm;
    }
}
public class com_in_3sorted {
    public static void main(String[] args) {

        int A[]={1,2,3};
        int B[]={1,2,3};
        int C[]={1,2,33};
        int n1=A.length;

        int n2=B.length;

        int n3=C.length;
        sol s=new sol();

        System.out.println( s.commonElements(A,B,C,n1,n2,n3));
         char c='z';
        int x=c-'a';
       // System.out.println(x);
    }
}
