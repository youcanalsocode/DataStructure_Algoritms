package Search_sort1;

import java.util.Arrays;
import java.util.HashMap;

class sln
{
    //Function to arrange all letters of a string in lexicographical
    //order using Counting Sort.
    public static String countSort(String s)
    {
        int ch[]=new int[26];
        HashMap<Integer,Character> mp=new HashMap<>();
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            int x=s.charAt(i)-'a';
            System.out.println(x);
            ch[x]=ch[x]+1;
            mp.put(x,s.charAt(i));
        }
       // System.out.println(Arrays.toString(ch));
       // System.out.println(mp);
        String ans="";

        for(int i=0;i<26;i++)
        {
           // System.out.println(ch[i]);
            while(ch[i]>0)
            { // System.out.println(i);
               // System.out.println(mp.get(0));
               // System.out.println("in");
                ans=ans+mp.get(i);
                ch[i]--;


            }
        }
        return ans;

    }
}
public class countsort_string {
    public static void main(String[] args) {
        String s="apssb";
        sln sl=new sln();
        System.out.println(  sl.countSort(s));
    }
}
