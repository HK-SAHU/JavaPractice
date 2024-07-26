package ArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class reverseListMethod2 {
    public static void main(String[] args) {
         ArrayList<Integer> l= new ArrayList<>();
        l.add(0);
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);

        Collections.reverse(l);

        System.out.println(l);
        // reverse(l);
    }
    
}