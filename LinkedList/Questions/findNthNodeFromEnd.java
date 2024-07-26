public class findNthNodeFromEnd {
    
    public static class Node{
        int data;
        Node next;

        Node(int d){
            this.data=d;
            next=null;
        }
    }

    /////////////////////////////////// brute force approach ///////////////////////////////////////////

    public static Node findNodeFromEnd(Node head, int n){
        int size=0;
        Node temp= head;
        while(temp!=null){
            size++;
            temp= temp.next;
        }
        int last = size - n +1;
        temp = head;
        for(int i=1;i<=last-1;i++){
            temp=temp.next;

        }
        return temp;
    }

    ///////////////////////////////////////// optimal approach ////////////////////////////////////////

    public static int findNodefromEnd(Node head, int n){
        Node slow= head;
        Node fast= head;
        if(head==null){
            return -1;
        }
        for(int i =1; i<=n ;i++ ){
            if(fast==null){
                return -1;
            }
            fast= fast.next;
        }
        while(fast!=null){
            slow= slow.next;
            fast= fast.next;
        }
        return slow.data;
    }

    public static void main(String[] args) {
        Node a = new Node(2);
        Node b= new Node(4);
        Node c = new Node(6);
        Node d= new Node(8);
        Node e =  new Node(10);
        Node f= new Node(12);
        a.next= b;
        b.next= c;
        c.next= d;
        d.next= e;
        e.next= f;
        
        Node q=findNodeFromEnd(a, 3);
        System.out.println(q.data);
        int result = findNodefromEnd(a, 4   );
        System.out.println(result);

    }
}
