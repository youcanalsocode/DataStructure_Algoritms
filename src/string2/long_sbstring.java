package string2;

import java.util.HashMap;
import java.util.HashSet;

public class long_sbstring {
    public static void main(String[] args) {
        String st="dvdf";
        int max=0;
       // System.out.println(st.length());
        HashMap<Character,Integer> it=new HashMap<>();

       for(int i=0,j=0;i<st.length();++i){
           if(it.containsKey(st.charAt(i)))
           {
               j=Math.max(it.get(st.charAt(i))+1,j);

           }

               it.put(st.charAt(i),i);
               max=Math.max(max,i-j+1);


       }
        System.out.println(max);
    }
}
