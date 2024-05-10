package array2;

public class bit_space_optim {
    public static void main(String[] args) {
        int a=2;
        int b=10;
        int size=b-a+1;
        int arr[]=new int[size];
        for(int i=2;i<size;i++)
        {
            if(i%2==0 || i%5==0)arr[i-a]=1;
        }
        for (int x=0;x<size;x++)
        {
          if(arr[x]==1) System.out.println(x+a);
        }
    }
}
