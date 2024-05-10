package array2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class repeat_miss {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(2);
        //  int arr[]={1,2,4,5,2};
        System.out.println( repdup(list));
    }

    private static  ArrayList<Integer>  repdup(List<Integer> A) {


    ArrayList<Integer> s = new ArrayList<>();
    HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
    int sum=0;
    int sum2=0;
    int dup=-1;
       for(int i=1;i<=A.size();i++){
        sum+=i;
    }
        for(int i=0;i<A.size();i++){
        sum2+=A.get(i);
    }

        for(int i=0;i<A.size();i++){
        if(map.containsKey(A.get(i))){
            dup=A.get(i);
            break;
        }else{
            map.put(A.get(i),1);
        }
    }
    int res=sum2-dup;
    int ans=sum-res;
       s.add(dup);
       s.add(ans);

        return s;
}
}
