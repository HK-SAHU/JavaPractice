package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class sortList {
    static void sort(ArrayList<Integer> list) {
        
    }


    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>();
        list.add("Akash");
        list.add("Rahul");
        list.add("Pankaj");
        list.add("Manoj");

        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);    // ascending order

        Collections.sort(list,Collections.reverseOrder());     // descending order  (lexographical)
        System.out.println(list);
    }
}
