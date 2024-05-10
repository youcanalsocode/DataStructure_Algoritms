package greedy1;

public class pyramid {
    public static void main(String[] args) {
        int ar[]={10,20,30};//,40,50,60,70,80,90,100};
        int pw=ar[0];
        int pc=1;
        int cw=0;
        int cc=0;
        for (int i = 1; i <ar.length ; i++) {
            cw=cc+ar[i];
            cc++;
            if(cw>pw && cc>pc)
            {
                pw=cw;
                pc=cc;
                cw=0;
                cc=0;

            }
        }
        System.out.println(pc);
    }
}
