package ArrayList;
import java.util.ArrayList;

public class creation {

    public static void main(String[] args) {

        // Initializing the array list
        ArrayList<Integer> l1= new ArrayList<>();

        /////////////////// COMMON METHODS ////////////////////////////

        //ADD NEW ELEMENT .add()

        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);
        l1.add(5);  

        // GET AN ELEMENT AT INDEX i  .get()
        System.out.println(l1.get(0));

        // Print the array list using for loop
        for(int i=0; i<l1.size();i++){
            System.out.print(l1.get(i)+" ");
        }
        System.out.println();

        // printing the array list directly without using loop
        System.out.println(l1);  //[5,6,7,8]

        // adding element at the ith index .add(<index>, <element>)
        l1.add(1, 0);
        System.out.println(l1);

        //modifying element at index i  .set(<index>, <element>)
        l1.set(1, 41);
        System.out.println(l1);

        //removing an element at index i  .remove(<index>)
        l1.remove(1);
        System.out.println(l1);

        //remove an element directly .remove(Integer.valueOf())
        l1.remove(Integer.valueOf(17));    //nothing will happen
        System.out.println(l1);

        System.out.println(l1.remove(Integer.valueOf(17)));   // false
        System.out.println(l1.remove(Integer.valueOf(7)));    //true

        //Checkking if an element exist or not  .contains(Integer.valueOf())
        System.out.println(l1.contains(Integer.valueOf(5)));   //true


        // if youd dont specify the wrapper class, then you can add anything to the list
        ArrayList l= new ArrayList();

        System.out.println(l1.lastIndexOf(5));
        System.out.println(l1.indexOf(5));


    }


    
}


//arraylist is a class which is present in java.util package
//it overcomes the limitations of array

//it has variable size
// it has many inbuilt methods that we can use 

