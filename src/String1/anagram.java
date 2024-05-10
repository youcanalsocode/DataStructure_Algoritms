package String1;

import java.util.HashMap;

public class anagram {
    public static void main(String args[]){
        String s="anagram";
        String t="nagaramm";
      //  Boolean b=true;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {char a=s.charAt(i);
            if(!map.containsKey(a))
                map.put(a,1);
            else

            {
                map.put(a,map.get(a)+1);
            }
        }
        System.out.println(map);

        for(int i=0;i<t.length();i++)
        { char a=t.charAt(i);
            System.out.println(a);
            if(map.get(a)!=null)

            {
                if(map.get(a)==1)
                {
                    map.remove(a);
                }else{
                    map.put(a,map.get(a)-1);
                }

                System.out.println(map);
            }else
            {
                System.out.println("else");
            }

        }


    }




}

