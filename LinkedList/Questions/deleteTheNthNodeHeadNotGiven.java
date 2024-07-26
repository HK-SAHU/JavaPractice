/*There is a singly-linked list head and we want to delete a node node in it.

You are given the node to be deleted node. You will not be given access to the first node of head.

All the values of the linked list are unique, and it is guaranteed that the given node node is not the last node in the linked list.

Delete the given node. Note that by deleting the node, we do not mean removing it from memory. We mean:

The value of the given node should not exist in the linked list.
The number of nodes in the linked list should decrease by one.
All the values before node should be in the same order.
All the values after node should be in the same order.
Custom testing:

For the input, you should provide the entire linked list head and the node to be given node. node should not be the last node of the list and should be an actual node in the list.
We will build the linked list and pass the node to your function.
The output will be the entire list after calling your function.
 

Example 1:


Input: head = [4,5,1,9], node = 5
Output: [4,1,9]
Explanation: You are given the second node with value 5, the linked list should become 4 -> 1 -> 9 after calling your function.
Example 2:


Input: head = [4,5,1,9], node = 1
Output: [4,5,9]
Explanation: You are given the third node with value 1, the linked list should become 4 -> 5 -> 9 after calling your function.
 

Constraints:

The number of the nodes in the given list is in the range [2, 1000].
-1000 <= Node.val <= 1000
The value of each node in the list is unique.
The node to be deleted is in the list and is not a tail node.*/

// LEETCODE 237

public class deleteTheNthNodeHeadNotGiven {

    public static class Node{
        int data;
        Node next;

        Node(int d){
            this.data=d;
            next=null;

        }
    }
    public static class linkedlist{
        Node head=null;
        Node tail=null;

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

        ////////////////////////////////////////////////////////////////////////////////////////////

        public void deleteNode(Node node){
            node.data=node.next.data;
            node.next=node.next.next;
        }
        ////////////////////////////////////////////////////////////////////////////////////////////
    }
    public static void main(String[] args) {
        
    }    
}
