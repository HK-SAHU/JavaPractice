import java.util.LinkedList;
import java.util.Queue;

public class implementationOfStackUsingQueue {
    static Queue<Integer> q1 = new LinkedList<>();
    static Queue<Integer> q2 = new LinkedList<>();

    // to add a new element in the stack
    static void add (int data){
        // move all element from q1 to q2
        while(!q1.isEmpty()){
            q2.add(q1.peek());
            q1.poll();
            // poll method is also used to remove the element from the queue
            // it returns null when the queue is empty 
        }

        //push the new data to q1
        q1.add(data);

        // move back all the element from q2 to q1
        while(!q2.isEmpty()){
            q1.add(q2.peek());
            q2.poll();
        }
    }

    static int remove(){
        if(q1.isEmpty()){
            System.out.println("Queue is empty");
            System.exit(0);
        }
        int ele= q1.peek();
        q1.poll();
        return ele;
    }

    public static void main(String[] args) {
        implementationOfStackUsingQueue.add(10);
        implementationOfStackUsingQueue.add(20);
        implementationOfStackUsingQueue.add(30);
        implementationOfStackUsingQueue.add(40);

        System.out.println(implementationOfStackUsingQueue.remove());
    }
}
