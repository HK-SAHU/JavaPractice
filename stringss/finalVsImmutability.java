public class finalVsImmutability {
    public static void main(String[] args) {
        // final int a=10;
        // a=20;  // cannot assign  the new value to the variable a as the final keyword made 'a' as constant

//////////////////////////////////////// Mutable class //////////////////////////////////////////////////////////////

        final StringBuffer sb = new StringBuffer("Harsh");
        

        // sb =new StringBuffer(" Kumar"); // cannot assign a value to final variable a
        sb.append(" Sahu");  // but we can do this   // we are appending in the same object
        System.out.println(sb);

    }
}


// we can append in same object but cannot assign the new object to the same the refrence variable when we are using new keyword
//in short fianl keyword is not affecting the mutality of the object but it does not allow the refrence variable to change its object to any other new object
