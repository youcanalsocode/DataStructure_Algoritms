package String1;
import java.util.*;
class nokia
{
    String printSequence(String S)
    {
        HashMap <Integer,Integer>base =new HashMap<>();
        base.put(0,2);
        base.put(3,3);
        base.put(6,4);
        base.put(9,5);
        base.put(12,6);
        base.put(15,7);
        base.put(19,8);
        base.put(22,9);
        //base.add(0,2);
        int n=S.length();
        S.toLowerCase();
        String ans="";
        for(int i=0;i<n;i++)
        { char c=S.charAt(i);

            int x=c-'A';
            int p='A'-0;
            System.out.println(x);
            if(base.containsKey(x))
                ans=ans+base.get(x);
            else if(base.containsKey(x-1))
                //System.out.println(x-1);

            {//System.out.println(ans);
                ans=ans+base.get(x-1)+base.get(x-1);
               // System.out.println(ans);
            }

            else if (base.containsKey(x-2))
                ans=ans+base.get(x-2)+base.get(x-2)+base.get(x-2);
            else if (base.containsKey(x-3))
                ans=ans+base.get(x-3)+base.get(x-3)+base.get(x-3)+base.get(x-3);

        }
        return ans;

    }
}
public class nokia_number {
    public static void main(String[] args) {
        String s="WTXNP";
nokia num=new nokia();
String ans=num.printSequence(s);
        System.out.println(ans);
    }
}
