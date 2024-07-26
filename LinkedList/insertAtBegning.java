public class insertAtBegning{
    public static class Node{
        int data;
        Node next;

        Node(int d){
            this.data=d;
            next=null;
        }
    }

    public static class linkedList{
        Node head =null;
        Node tail= null;

        void insertBegning(int val){
            Node temp= new Node(val);
            if(head==null){
                head= temp;
                tail=temp;
                // head=tail=temp;
            }
            else{
                temp.next=head;  // this will connect the node
                head=temp;  //assign the new node as the head
            }
        }

        void display(){
            Node temp =head;
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.println("NULL");
        }

        int size(){
            Node temp = head;
            int count=0;
            while(temp!=null){
                count++;
                temp= temp.next;

            }
            return count;
        }

        void insertAtEnd(int val){
            Node temp = new Node(val);  // isse new node banega aur usme value jayegi jo hume add karni hai
            if(head==null){
                head=temp;
            }
            else{
                tail.next=temp;   // connected the tail of the last node to the new node
            }
            tail=temp;  // shifting the tail to point to the temp
        }
    }

    public static void main(String[] args) {
        linkedList ll = new linkedList();
        ll.insertAtEnd(2);
        ll.display();
        ll.insertAtEnd(4);
        ll.display();
        System.out.println();
        ll.insertBegning(10);
        ll.display();
        ll.insertBegning(5);
        ll.display();
    }
}