public class insertAtAnyIndex {
    public static class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            next = null;
        }

    }

    public static class linkedList {
        Node head = null;
        Node tail = null;

        void insertAtBegning(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
        }

        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
        }

        void insertAtAny(int val, int pos) {
            Node temp = new Node(val);
            Node t = head;
            if (pos == size()) {    // if the index in which we want to add the node is at the last of the LL or it is equal to size of the LL
                insertAtEnd(val);
                return;
            }

            if(pos==0){      // if the index in which we want to add the the node is at the starting of the LL or Index is 0
                insertAtBegning(val);
                return;
            }
            for (int i = 1; i <= pos-1 && t!=null; i++) {
                t = t.next;    // iterating the t to the desired place -1
            }
            temp.next = t.next;   
            t.next = temp;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println("null");
        }

        int size() {
            Node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp=temp.next;
            }
            return count;
        }

        int getAt(int pos){
            Node t= head;
            for(int i=1; i<=pos && t!=null ;i++){
                t=t.next;
            }
            return t.data;
        }
    }

    public static void main(String[] args) {
        linkedList ll = new linkedList();
        ll.insertAtEnd(2);
        ll.insertAtEnd(4);
        ll.insertAtEnd(6);
        ll.insertAtEnd(8);
        ll.insertAtEnd(10);
        ll.display();
        ll.insertAtAny(12, 3);
        ll.display();
        int index=ll.getAt(3);
        System.out.println(index);
    }
}
