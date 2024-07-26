class A{
    void show(){
        System.out.println("in show");
    }
    static class B{     // when we run this program there is A$B.class
        static void display(){
            System.out.println("displaying");
        }
    }
}

public class innerClass {
    public static void main(String[] args) {
        A obj = new A();

        // A.B obj1 = new A.B();     // to create the objext of the inner class B 
        //A.B tells us where is the class- B, A ke andar hai
        // obj.new B(); creating object with help of A ka object

        // if we make the class B as static then
        // A.B obj2 = new A.B();

        obj.show();
        A.B.display();
    }
}
/*
 * inner class is of 3 types
 * 1. member class above example
 * 2. static inner class- we have seen in linked list when we create the node inner class (only inner class can be static)
 * 3. anonymous inner class- 
 */

/*.
 * when the inner class is static but the functions inside the inner class is not static
 * object will be created in A.B obj1 = new A.B();
 * 
 * when the inner class and the function inside that class are also static then there will be no object of the inner class
 * directly call the method like A.B.display();
 * 
 * when both the class and the methods are not static (member) then we will create the object of the class
 * like A.B obj1=obj.new B();   with the help of the object of the parent class
 */
