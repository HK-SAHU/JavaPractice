import java.util.Arrays;

class Demo1{

    static void disp1(){
        System.out.println("static method disp1");
    }

    void disp2(){
        System.out.println("non static method disp2");
    }
}



public class staticVsInstanceMethod {
    public static void main(String[] args) {
        Demo1.disp1();

        Demo1 obj= new Demo1();
        obj.disp2();

        obj.disp1();  // static mehtod can be called with the help of the object, it will not give the error
    }
}
