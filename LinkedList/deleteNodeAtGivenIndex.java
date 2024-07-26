public class deleteNodeAtGivenIndex {

    public static class Node {

        int data;
        Node next;

        Node(int d) {
            this.data = d;
            next = null;
        }
    }

    public static class linkedlist {

        Node head = null;
        Node tail = null;
        int size = 0;

        void insertAtBegning(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
            size++;
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
            size++;
        }

        void insertAtAny(int val, int pos) {
            Node temp = new Node(val);
            Node t = head;
            if (pos == size) {
                insertAtEnd(val);
                return;
            }
            if (pos == 0) {
                insertAtBegning(val);
                return;
            }
            for (int i = 1; i <= pos - 1 && t != null; i++) {
                t = t.next;
            }
            temp.next = t.next;
            t.next = temp;
            size++;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println("null");
        }

        void removeNthNode(int pos) {
            Node temp = head;
            // If position is 1, update head
            if (pos == 0) {
                head = head.next;
                size--;
                if (size == 0) {
                    tail = null; // If the list becomes empty, update tail to null
                }
                return;
            }
            if (size == 0) {
                tail = null; // If the list becomes empty, update tail to null
            }
            // Traverse to the node just before the one to be removed
            for (int i = 1; i <= pos - 1; i++) {
                temp = temp.next;
            }
            // If the node to be removed is the last node
            if (temp.next == tail) {
                temp.next = null;
                tail = temp; // Update tail to the previous node
            } else {
                // If the node to be removed is not the last node
                temp.next = temp.next.next;
            }
            size--;
        }
    }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(2);
        ll.insertAtEnd(4);
        ll.insertAtEnd(6);
        ll.insertAtEnd(8);
        ll.insertAtEnd(10);
        // ll.display();
        ll.insertAtAny(12, 3);
        ll.display();
        ll.removeNthNode(5);
        ll.display();
    }
}
