package greedy1;
import  java.util.*;
public class actively_select {
    public static void main(String[] args) {
int start[]={0,2 ,3,5};
int end[]={1,7,4,6};
int n=4;
sol s=new sol();
        System.out.println(s.activitySelection(start,end,n));
    }
}

class pair{
    int start;
    int end;
    pair(int st, int ed)
    {
        this.start=st;
        this.end=ed;

    }
}
class Compare

{
    static void  compare(pair [] ar,int n)
    {
        Arrays.sort(ar,new Comparator<pair>()

        {
            public int compare(pair a1,pair a2)
            {
                return a1.end-a2.end;
            }});
    }
}


class sol
{
    public static int activitySelection(int start[], int end[], int n)
    {
        // add your code here


        pair ar[]=new pair[n];

        for(int i=0;i<n;i++)
        {
            ar[i]=new pair(start[i],end[i]);
        }
        for (int i = 0; i < ar.length ; i++) {
//System.out.println(ar[i].start+"--"+ar[i].end);
        }

        Compare c=new Compare();
        c.compare(ar,ar.length);
        for (int i = 0; i < ar.length ; i++) {
          //  System.out.println(ar[i].start+"--"+ar[i].end);
        }
        int count =1;
        int  prev=0;
        for(int i=1;i<ar.length;i++)
        {
            if(ar[i].start>ar[prev].end)


            {
                count++;
                prev++;
            }


        }

        return count;


    }
}
