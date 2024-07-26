interface A{
    void name(String N);
}
public class oneParameterLambda {
    public static void main(String[] args) {
        A obj = Name -> System.out.println(Name);   // one parameter lambda expression 
        obj.name("Harsh");

        // A obj = new A() {
        //     public void name(String Name){
        //         System.out.println(Name);
        //     } 
        // };
        obj.name("Harsh");
    }
}

// writing the parameter datatype while implementing the innterface using lambda expression is optional  eg. name or String name
