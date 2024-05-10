package String1;

import java.util.*;

public class count_char {
    public static void main(String[] args) {
        String s="gstggggs";
        HashMap <Character,Integer> mp=new HashMap<>();
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            if(mp.containsKey(s.charAt(i)))mp.put(s.charAt(i),mp.get(s.charAt(i))+1);
            else mp.put(s.charAt(i),1);
        }
for(Map.Entry<Character,Integer> temp:mp.entrySet())
if(temp.getValue()>1)
{
    System.out.println(temp.getKey() +" : "+temp.getValue());
   // System.out.println(temp.getValue());

}
        //System.out.println(mp);
    }
}
