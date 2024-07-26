interface A{
    void show();

// below the methods are definable and can be override easily

    default void abc(){    
        System.out.println("abc");
    }

    static void hello(){   // this method can be called directly as it is a static method
        System.out.println("hello");
    }
}

class B implements A{
    public void show(){
        System.out.println("in show");
    }

    public static void display() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'display'");
    }
}

public class newInterface {
    public static void main(String[] args) {
        A.hello();

        A obj =new B();
        obj.abc();
        obj.show();
    }    
}

/*
 * after java 8, makers of java decided to change the interface functionlaity by allowing the methods in interface difenable
 * but only (default) and (static) methods are definable in interface
 * also we can override the defined methods in implemantation class 
 */
