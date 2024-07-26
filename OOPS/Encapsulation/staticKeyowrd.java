public class staticKeyowrd {

    static int a;   // defining a static variable

    static {    //static intialization block
        a = 10;
        System.out.println(a);
    }

    // this variable and block will execute before the going to the main method
    // it will execute at the time of class loading

    public static void main(String[] args) {
        System.out.println("main method");
    }
}


// output will be

/*
 * 10
 * main method
 */