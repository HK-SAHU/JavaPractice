public class sizeUpdate {

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
    int size = 0;

    void insertAtEnd(int val) {
      Node temp = new Node(val);

      if (head == null) {
        tail = temp;
        head = temp;
      } else {
        tail.next = temp;
        tail = temp;
      }
      size++;
    }

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

    int getAt(int pos) {
      Node t = head;
      for (int i = 1; i <= pos && t != null; i++) {
        t = t.next;
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
    int index = ll.getAt(3);
    System.out.println(index);
    System.out.println(ll.size);
  }
}
