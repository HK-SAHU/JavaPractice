public class creation {
    public static class Node {
        int data;
        Node next; // is the property of the Node class and it contains the address of the next
                   // node

        Node(int d) {
            this.data = d;
            next = null;
        }
    }

    ///////////////////////////////////// Displaying Recursively ////////////////////////////////

    public static void displayR(Node head){
        if(head==null){
            return;
        }
        System.out.print(head.data+"->");
        displayR(head.next);
    }
    /////////////////////////////////////Displaying Reverse ////////////////////////////////


    public static void displayReverse(Node head){
        if(head==null){
            return;
        }
        displayReverse(head.next);
        System.out.print(head.data+"->");
    }


    ////////////////////////////////////////////////////////////////////////////////////////

    public static void display(Node head){
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.data+"->");
            temp= temp.next;
        }
        System.out.print("NULL");
    }

////////////////////////////////// length of the LL /////////////////////////////////////// 

    public static int lengthOfLL(Node head){
        int len=0;
        while(head!=null){
            len++;
            head=head.next;
        }
        return len;
    }

    ///////////////////////////// swapping of first and last node ///////////////////////

    public static void swap(Node head, Node tail){
        Node tempH = head;
        Node tempT= tail;
        int temp= tempH.data;
        tempH.data= tempT.data;
        tempT.data=temp;
        head= tempT;
        tail= tempH;
    }

    public static void main(String[] args) {
        Node newNode = new Node(2);
        // System.out.println(newNode);  //creation$Node@36baf30c
        // System.out.println(newNode.data); //0
        // System.out.println(newNode); //$Node@36baf30c address of thhe node
        // System.out.println(newNode.next); // null as it doesnot contain any address
        // of any node
        Node newNode1 = new Node(4);
        Node newNode2 = new Node(6);
        Node newNode3 = new Node(8);
        Node newNode4 = new Node(10);

        // now we want to connect our linked list like 2->4 ->6-> 8-> 10 
        //but currently the ll is  2 4 6 8 10
        //therefore we will do
        newNode.next=newNode1; // assigning the address of the newNode1 to the newNode
        // System.out.println(newNode.next);    //creation$Node@36baf30c // 2 -> 4 6 8 10
        // System.out.println(newNode1);  //creation$Node@36baf30c  // this means newNode.next has stored the address of the next node i.e. newNode1

        // //now we want to print the cvalue of b without using b
        // System.out.println(newNode.next.data); //4   // this means the 1st and the 2nd node is now connected  2 ->4
        //let's further connect the linked list
        newNode1.next= newNode2; //2 ->4 -> 6 8 10
        newNode2.next= newNode3;  //2 ->4 -> 6 -> 8 10
        newNode3.next= newNode4;  //2 ->4 -> 6 -> 8 -> 10

        ////////////////// displaying the linked list ////////////////////////

        
        // for(int i=1;i<5 ;i++){
        //     System.out.print(temp.data + "->");
        //     temp = temp.next;
        // }
        // System.out.println("NULL");

        // it is better to use while loop
        // while(temp!= null){
        //     System.out.print(temp.data+"->");
        //     temp= temp.next;
        // }
        // System.out.print("NULL");

        // create the method in the Node class 
        // display(newNode4);
        // displayR(newNode4);
        // displayReverse(newNode);

        // count the number of node
        // int len= lengthOfLL(newNode);
        // System.out.println(len);

        display(newNode);
        swap(newNode, newNode4);
        System.out.println();
        display(newNode);
        
    }
}
