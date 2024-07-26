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