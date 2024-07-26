class P1{  // parent class which donot extends to any class, actually it extends to the Object class by default

}
class c1 extends P1{

}

public class ParentOfParent {
    public static void main(String[] args) {
        P1 obj = new P1();

        obj.equals(obj);
        obj.getClass();
        obj.hashCode();
        obj.notify();
        obj.notifyAll();
        obj.toString();

        // all the above methods are inbuilt methods of the Object class
    }
}
