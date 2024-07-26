

public class removeNthFromEnd {
    public static class Node{
        int data;
        Node next;

        Node(int d){
            this.data=d;
            next=null;
        }
    }


    // public static Node findNodeFromEnd(Node head, int n){
    //     int size=0;
    //     Node temp= head;
    //     if(head.next==null){
    //         head= null;
    //         return head; 
    //     }
    //     while(temp!=null){
    //         size++;
    //         temp= temp.next;
    //     }
    //     int last = size - n;
    //     temp = head;
    //     for(int i=1;i<=last-1;i++){
    //         temp=temp.next;
    //     }
    //     if(temp==null){
    //         head=head.next;
    //         return head;
    //     }
    //     temp.next= temp.next.next;
    //     return head;
    // }

    public static Node removeFromEnd(Node head, int n){
        Node fast= head;
        Node slow= head;
        if(head.next==null){
            head= null;
            return head;
        }
        for(int i=1;i<=n;i++){
            fast=fast.next;
        }
        if(fast== null){
            head= head.next;
            return head;
        }
        while(fast.next!=null){
            slow= slow.next;
            fast= fast.next;

        }
        slow.next= slow.next.next;
        return head;
    }

    public static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp= temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node a = new Node(2);
        Node b= new Node(4);
        Node c = new Node(6);
        Node d= new Node(8);
        Node e =  new Node(10);
        a.next= b;
        b.next= c;
        c.next= d;
        d.next= e;
        e.next= null;
        display(a);
        // a=removeFromEnd(a, 5);
        a=findNodeFromEnd(a, 5);
        display(a);

    }
}
