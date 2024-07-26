package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class reveseList {
    static void reverse(ArrayList<Integer> list){
        int i=0; int j=list.size()-1;
        while(i<j){
            Integer temp= Integer.valueOf(list.get(i));
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;
            j--;
        }
    }



    public static void main(String[] args) {
        ArrayList<Integer> l= new ArrayList<>();
        l.add(0);
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        reverse(l);
        System.out.println(l);

    }
}
