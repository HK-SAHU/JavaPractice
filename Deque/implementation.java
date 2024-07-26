
import java.util.ArrayDeque;
import java.util.Deque;

public class implementation {
    public static void main(String[] args) {
        Deque<Integer> dq= new ArrayDeque<>();

        // functions that throws execptions are
        dq.addFirst(10);
        dq.addLast(20);
        dq.addFirst(30);
        dq.addLast(40);

        System.out.println(dq.getFirst());   //30
        System.out.println(dq.getLast());    //40

        dq.removeFirst();
        dq.removeLast();
System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println(dq.getFirst());   //10
        System.out.println(dq.getLast());    //20


        // functions the returns the null values are

        dq.offerFirst(50);
        dq.offerLast(60);
        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());

        dq.pollFirst();
        dq.pollLast();

        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());


        
    }
}
