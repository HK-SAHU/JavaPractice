import java.util.Stack;

public class implementationOfQueueUsingStack {

    static Stack<Integer> st1= new Stack<>();
    static Stack<Integer> st2= new Stack<>();


    public static void enQueue(int data){
        st1.push(data);
    }

    public static int deQueue(){
        int ele;
        if(st1.empty() && st2.empty()){
            System.out.println("Queue is empty");
            System.exit(0);
        }

        // push all the element from stack 1 to stack 2

        if(st2.empty()){
            while(!st1.empty()){
                ele= st1.pop();
                st2.push(ele);
            }
        }

        // pop the top element from the st2
        ele= st2.pop();
        return ele;
    }

    public static void main(String[] args) {
        // implementationOfQueueUsingStack q= new implementationOfQueueUsingStack();
        implementationOfQueueUsingStack.enQueue(10);
        implementationOfQueueUsingStack.enQueue(20);
        implementationOfQueueUsingStack.enQueue(30);
        implementationOfQueueUsingStack.enQueue(40);
        implementationOfQueueUsingStack.enQueue(50);

        System.out.println(implementationOfQueueUsingStack.deQueue());
    }
}
