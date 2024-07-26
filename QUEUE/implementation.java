import java.util.LinkedList;
import java.util.Queue;

public class implementation {
    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();

        // to add the data in the queue

        for(int i=0;i<=10;i++){
            q.add(i);
        }

        System.out.println("Queue looks like: "+ q);

        // to remove the element from the queue

        q.remove(); // will remove the first element that was entered first from the queue

        // display the topmost element

        System.out.println("top element in the queue is: "+ q.peek());

        // check the size of the queue

        System.out.println("the currrent size of the queue is: "+ q.size());


    }
}
