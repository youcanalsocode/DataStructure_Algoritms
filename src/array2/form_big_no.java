package array2;
import java.util.*;
public class form_big_no {
    public static void main(String[] args) {
        Vector<String> arr;
        arr = new Vector<>();

        // output should be 6054854654
        arr.add("54");
        arr.add("546");
        arr.add("548");
        arr.add("60");
        arr.add("1");
        printLargest(arr);
    }



    static void printLargest(Vector<String> arr) {

        Collections.sort(arr, new Comparator<String>() {

            @Override
            public int compare(String X, String Y) {
                System.out.println(arr);

                String XY = X + Y;


                String YX = Y + X;
                System.out.println(XY+"---=-"+YX);

                return XY.compareTo(YX) > 0 ? -1 : 1;
            }
        });
        System.out.println(arr);

        Iterator it = arr.iterator();

        while (it.hasNext())
            System.out.print(it.next());
    }
}

