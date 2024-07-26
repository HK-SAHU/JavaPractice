import java.util.ArrayList;

public class CustomArrayList {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
         
        // System.out.println(al.add(100));      // true, as it return boolean (if data is added or not)
        // System.out.println(al.add("d"));       // can store  hetrogenous data

        al.add(100);    // all these data is storing as the object
        al.add(200);
        al.add(300);
        al.add(400);
        System.out.println(al);

        ArrayList al2= new ArrayList();

        al2.add("pw");
        al2.add("p");
        al2.add(10);
        al2.add(10.2);

        System.out.println(al2);

        System.out.println("now adding al2 in al");


        // al.addAll(al2);   // it will get added in the same order so the order of insertion is preserved 
        // also adding one collection to the other will not create the 2d element but it will get add in the continutation




        al.addAll(0,al2);     // we can add the collection/ element at the particular index also
        // but this insertion of the element ans specific index is not preferred because it it not efficient at all
        // for huge data

        // to do this we can go with linked list(it uses doubly linked list)
        System.out.println(al);
        


    }
}


/*
 * some inbuilt methods of the ArrayList are
 * 
 */

