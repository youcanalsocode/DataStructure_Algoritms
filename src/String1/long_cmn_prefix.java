package String1;

import java.util.Arrays;

public class long_cmn_prefix {
    public static void main(String args[]){
        String strs[] = {"flower","flow","floght"};
        prefix pf=new prefix();
        String ans=pf.longestCommonPrefix(strs);
        System.out.println(ans);
    }



}
class prefix {

    public String  longestCommonPrefix(String[] strs) {

        Arrays.sort(strs);
        String s1=strs[0];
        String s2=strs[strs.length-1];
        int index=0;

        while(index<s1.length()){

            if(s1.charAt(index)==s2.charAt(index)){
                index++;

            }

            else{
                break;
            }
        }
        return s1.substring(0,index);
    }
}


