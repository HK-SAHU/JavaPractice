public class staticBlockVsJavaIntializationBlock {
    static int age;

    static {
        System.out.println("static block");
        age=21;
    }

    static void disp(){
        System.out.println("static void disp method");
        System.out.println(age);
    }



    public static void main(String[] args) {
        System.out.println("Main Method");
        disp();
    }
}

/*
 * class load hote hi static variable ko heap memory mein memory mil jati hai aur static block execute ho jate hai
 * 
 * fir baki block aur methods humpe depend karta hai ki kab execute karne hai
 * 
 * ab main method ko bhi toh JVM call karta hai, basically wo bhi kisi pe dependent hai call hone ke liye
 * 
 * fir hume kisi bhi cheej ko call kar sakte hai 
 * 
 * FLOW OF EXECUTION
 * static variable  -> static block  ->  main method called by JVM   -> any method called by us (here disp();)
 * 
 */

 /*
  * question  ->  where does the memory of the non static mehtod allocated and how???
  */
