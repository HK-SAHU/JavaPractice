import java.util.Stack;

public class Implementation {
    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();


        // push the element inside the  stack
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        // print the top most element in the stack
        System.out.println("the topmost element in the stack is: "+ st.peek());

        // delte the top element from the stack
        st.pop();

         // print the top most element in the stack
         System.out.println("the topmost element in the stack is: "+ st.peek());

         // search an element in the stack
         System.out.println("element 2 is present in the position: "+ st.search(2));

         // search the element which is not present in the stack  = output is -1

         System.out.println("element which is not present in the stack is: " +st.search(5));

         // check if the stack is empty or not
        System.out.println("is stack empty?: "+ st.isEmpty());
        
    }
}
