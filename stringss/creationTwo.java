import java.lang.NoClassDefFoundError;


public class creationTwo {
    public static void main(String[] args) {
///////////////////////// immutable string //////////////////////////////////////

        String brand ="pwskills";
        System.out.println(brand);
        brand.concat("hello");   // because string is immutable class
        System.out.println(brand);

        StringBuilder brand1 = new StringBuilder("pwskills");
        System.out.println(brand1);
        brand1.append(" hello");   // there is no concate method in StringBuilder class
        System.out.println(brand1);    //this is mutable class

        StringBuffer brand2= new StringBuffer("hello");
        brand2.append(" Hrash");
        System.out.println(brand2);
    }
}

//collection of character enclosed in double quotes
    /*
     * numbers 
     * alphabet
     * special character 
     * mix of characters
     */
    
     // single quotes for char and double quotes for strings 
    
     // String is not a primitive datatype but it is class(Wrapper class)
    
     // these wrapper class are in lang package therefore there is no need to import the package
     
     // string is of two type that is immutable and mutable string
    
     /*
      * Immutable string= which cannot be changed 
      * String brand ="pwskills";
    
    
      * Mutable  String = which can be changed
      * StringBuilder brand1 = new StringBuilder("Hello");
      * StringBuffer brand2 = new StringBuffer("HEllo");
      */
     

