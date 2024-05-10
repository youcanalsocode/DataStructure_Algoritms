package array1;

import java.util.Arrays;

class Solution1
{
    //Function to reverse words in a given string.

    String reverseWords(String S)
    {
        String arr[]=S.split("\\.");
        int n=arr.length-1;
        int j=arr.length-1;
        System.out.println(Arrays.toString(arr));
        int i=0;
        System.out.println(n);
       // System.out.println(n);
        while(i<n/2)
        {
            String temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
            System.out.println(Arrays.toString(arr));
        }


        return Arrays.toString(arr);
    }

}
public class string_reverse {
    public static void main (String args[])
    {
        String S="i.like.this.program.very.much";
        Solution1 obj=new Solution1();
        obj.reverseWords(S);
    }

}

