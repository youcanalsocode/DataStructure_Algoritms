package array2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

public class Merge_overlap {
   static class Interval
    {
        int start;
        int end;
        Interval(int s,int e)
        {
            this.start=s;
            this.end=e;
        }
    }
    public static void main(String[] args) {
        Interval arr[] = new Interval[4];
        arr[0] = new Interval(1, 3);
        arr[1] = new Interval(2, 4);
        arr[2] = new Interval(6, 8);
        arr[3] = new Interval(9, 10);
        oevrlap(arr);

    }

    private static void oevrlap( Interval arr[]) {
        Arrays.sort(arr, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start-o2.start;
            }
        });
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i].start+"  "+arr[i].end);
        }

        Stack <Interval> box=new Stack<>();
        box.push(arr[0]);
        for(int i=1;i<arr.length;i++)
        {
            Interval temp=box.peek();
            if(temp.end>arr[i].start)
            {
                if(temp.end<arr[i].end)
                {
                    box.pop();
                    Interval p=new Interval(temp.start,arr[i].end);

                    box.push(p);
                }

            }else
            {
                System.out.println("gome"+i);
                box.push(arr[i]);
            }
        }

        while(!box.empty())
        {
            Interval t=box.pop();
            System.out.println(t.start+"--"+t.end);
        }



    }
}
