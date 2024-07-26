public class insertionInTheEnd {
    // head of the linked list
    Node head;

    //Node class representing individual element of the linked list
    class Node{
        int data;  // data of the node 
        Node next;  //address to the next node // can be of Node data type  // mtlb Node class ke andar hum Node ko access kar sakte hai
        


        // Constructor to initialize a node with data and next reference
        Node(int d){
            this.data= d;
            next=null;
        }
    }

    // Method to insert a new node at the end of the linked list
    // implementation of insertion of the node at the end

    public void insertAtEnd(int newData){
        Node newNode = new Node(newData);  //creating a new node and passing the value to that node and the next will be null 

        // If the linked list is empty, set the new node as the head
        if(head==null){
            head= newNode;
            return;
        }

        // Traverse to the end of the linked list
        newNode.next=null;
        Node temp =head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next= newNode;
        return;

    }

    // Method to display the linked list
    public void displayLL(){
        Node current = head;
        while(current!=null){
            System.out.print(current.data +"->");
            current= current.next;
        }
        System.out.print("NULL");
    }

    public static void main(String[] args) {
        insertionInTheEnd list = new insertionInTheEnd();
        list.insertAtEnd(2);
        list.insertAtEnd(4);
        list.insertAtEnd(6);
        list.insertAtEnd(8);
        System.out.println("before inserting");
        list.displayLL();
        System.out.println();
        System.out.println("After inserting");
        list.insertAtEnd(10);
        list.displayLL();
        System.out.println();
        
    }
}
