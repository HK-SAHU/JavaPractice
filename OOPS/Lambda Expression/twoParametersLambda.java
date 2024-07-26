interface A{
    void sum(int a, int b);
}

public class twoParametersLambda {
    public static void main(String[] args) {
        A obj = (a,b) -> {
            int result=a+b;
            System.out.println(result);  
        };  // when there are multiple lines then we have to write them under the curly braces
        obj.sum(10, 20);
    }
}
