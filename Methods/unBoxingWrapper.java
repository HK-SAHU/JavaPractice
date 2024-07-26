public class unBoxingWrapper {

    // converting the object form to the primitive form
    public static void main(String[] args) {
        Integer i =Integer.valueOf(10);


        // syntax is xxxValue();   xxx-> is primitive datatype
        

        int a= i.intValue();
        System.out.println(a);

        // ANOTHER SHORT METHOD OF THE SAME IS   (AUTO- UNBOXING)

        Integer in =Integer.valueOf(20);

        int b=in;   // IMPORTANT   NO NEED TO WRITE in.intValue();

        System.out.println(b);
    }
}
