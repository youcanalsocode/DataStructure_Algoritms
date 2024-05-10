package String1;

import java.util.Stack;

public class parenthisis {
    public static void main(String args[]){
        String s="({)";
        boolean b;
        Stack<Character> st=new  Stack<>();
        //char c[]=s.toCharArray();
        for(char c: s.toCharArray())
        {
            System.out.println(c);
            switch(c){
                case '(':

                case '{':

                case '[':
                    System.out.println("tru");
                    st.push(c);
                    break;
                case ')':
                    System.out.println("A");
                    if(st.isEmpty()||st.peek()!='(' ){
                        b=false;
                    }
                    break;
                case ']':
                    System.out.println("b");
                    if(st.isEmpty()||st.peek()!='[' ){
                        b=false;
                    }
                    break;
                case '}':
                    System.out.println("c");
                    if(st.isEmpty()||st.peek()!='{' ){
                        System.out.println("cdfed");
                        b=false;
                    }
                    break;

            }

        }

        b=st.isEmpty();
        System.out.println(b) ;
    }

}
