package String1;

public class remove_cnse {
    public static void main(String[] args) {
        String s="aaababbbal";
        StringBuilder sb=new StringBuilder();
        int n=s.length();
        char p=s.charAt(0);
        sb.append(p);
        for (int i = 1; i <n ; i++) {
            if(p!=s.charAt(i))
                sb.append(s.charAt(i));
            p=s.charAt(i);
        }
        System.out.println(sb);
    }
}
