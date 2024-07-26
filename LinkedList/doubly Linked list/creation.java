

public class creation {
    public static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val=val;
            next=null;
            prev=null;
        }
    }

    public static void display(Node head){
        Node temp= head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("null");

    }

    public static void display2(Node tail){
        Node temp=tail;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.prev;
        }
        System.out.println("null");
    }

    public static void display3(Node random){
        Node temp=random;
        while(temp.prev!=null){
            temp=temp.prev;
        }
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("null");

    }

    public static Node insertAtBegning(Node head, int val){
        Node temp= new Node(val);
        temp.next=head;
        head.prev=temp;
        head=temp;
        return head;
    }

    public static void insertAtTail(Node head, int val){
        Node temp= head;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node t= new Node(val);
        t.next=temp.next;
        temp.next=t;
        t.prev=temp;

    }

    public static void insertAtAny(Node head, int pos, int val){
        Node temp= head;
        for(int i=1;i<pos-1;i++){
           temp=temp.next;
        }
        Node t= new Node(val);
        t.next=temp.next;
        temp.next=t;
        t.next.prev=t;
        t.prev=temp;
    }

    public static void deletehead(Node head){
        head=head.next;
        head.prev=null;
    }
    public static void deleteTail(Node head){
        Node temp= head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }

    public static void deleteAtAny(Node head, int pos){
        Node temp= head;
        for(int i=1;i<=pos-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        temp.next.prev=temp;
    }
    public static void main(String[] args) {
        Node a = new Node(4);
        Node b = new Node(10);
        Node c = new Node(2);
        Node d = new Node(99);
        Node e = new Node(13);
        a.next=b;
        a.prev=null;
        b.next=c;
        b.prev=a;
        c.next=d;
        c.prev=b;
        d.next=e;
        d.prev=c;
        e.next=null;
        e.prev=d;
        insertAtAny(a, 4, 400);
        display(a);
        
    }
}
