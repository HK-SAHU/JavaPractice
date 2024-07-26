interface A{
    void display();
}


public class lambdaExpressionImplementation {
    public static void main(String[] args) {
        A obj = () -> System.out.println("displaying");   // no parameter syntax
        obj.display();
    }
}

/*
 * lambda expression works to implementation of the functional interface(single method in the interface)
 */