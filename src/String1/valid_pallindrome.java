package String1;

public class valid_pallindrome {

    public static void main(String args[])
    { Boolean b=true;
        String s="A man, a plan, a canal: Panama";
        if(s.isEmpty()) b=true;
        int st=0;
        int ed=s.length()-1;
        while(st<=ed){
            char start=s.charAt(st);
            char End=s.charAt(ed);
            System.out.println("start:"+start);
            System.out.println("end:"+End);
            if(!Character.isLetterOrDigit(start))
            {    System.out.println("if");
                st++;
            }else if(!Character.isLetterOrDigit(End))
            {System.out.println("else--if");
                ed--;
            }else
            {System.out.println("max else");

                if(Character.toLowerCase(start)!=Character.toLowerCase(End)){
                    b=false;
                }
                st++;
                ed--;
            }

        }
        System.out.println(b);
    }
}

