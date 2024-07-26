public class comparingStrings {
    

    public static void main(String[] args) {
        String s1 = "Harsh";
        String s4 = "harsH";
        String s2 = new String("Harsh");
        String s3 = new String("harsh");

        System.out.println(s1==s2);  //false
        System.out.println(s1.equals(s2));   //true

        System.out.println(s4.equalsIgnoreCase(s3));  // true

        System.out.println(s4.equalsIgnoreCase(s2));   // true
    }
}



//   .equalsIgnoreCase() will ignore the case semstivity of the string 
