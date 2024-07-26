import java.util.ArrayDeque;

public class CustomArrayDeque {
    public static void main(String[] args) {
        ArrayDeque ad= new ArrayDeque();

        ad.add(100);
        ad.add(200);
        ad.add(300);
        ad.add(400);

        System.out.println(ad);

        ad.addFirst(10);
        ad.addLast(20);

        System.out.println(ad);

        ArrayDeque ad2= new ArrayDeque();
        ad2.add("a");
        ad2.add(10);
        ad2.add(10.2);

        ad.addAll(ad2);
        System.out.println(ad);

    }
}



/*
 * ArrayDeque is using double ended queue which means we can add from front as well from the back
 * 
 * we cannot insert at any specific index in ArrayDeque
 * 
 * addFirst, addLast, removeFirst, removeLast, getFirst, getLast ... all these methods can throw exception if it gets full
 * 
 * offerFirst, offerLast, pollFirst, pollLast, peekFirst(), peekLast .... all these methods dont thorow exception
 * 
 * duplicates are allowed
 * 
 * homogenous and hetrogenous in nature
 * 
 * add the collection at last
 */