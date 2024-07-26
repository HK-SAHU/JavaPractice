public class insertEndHeadGiven {
    public static class Node{
        int data;
        Node next;
        
        Node(int d){
            this.data=d;
            next= null;
        }
    }

    public static void insertAtEnd(Node head, int val){
        Node temp = new Node(val);
        Node t= head;

        while(t.next!=null){
            t=t.next;

        }
        temp.next=null;
        t.next=temp;
    }

    public static void display(Node head){
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.data+"->");
            temp= temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Node newNode =new Node(2);
        Node newNode2 =new Node(4);
        Node newNode3 =new Node(6);
        newNode.next=newNode2;
        newNode2.next=newNode3; 
        display(newNode);
        insertAtEnd(newNode, 8);
        display(newNode);

    }
}
