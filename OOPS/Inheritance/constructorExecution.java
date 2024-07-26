class Try{
    int a;
    int b;

    public Try(){
        //super()    // this super method is pointing to the constructor of the "Object class"
        System.out.println("Parent constructor called");
    }

    public Try(int x, int y){
        // super(x, y)    //The constructor Object(int, int) is undefined  // there is no parametrized constructor like this in Object class
        System.out.println("parametrized parent constructor called");
        a=x;
        b=y;
    }
}

class Hello extends Try{
    int m;
    int n;
    public Hello(){
        super();      //by default the super method call is present in the 1st line of the constructor
        // super(10,20);  // we can pass the super method with the parameters in a non parametrized constructor to call the parametrized constructor of the parent class constructor
        System.out.println("Child class constructor called");
    }

    public Hello(int x, int y){
        //super()    //by default the super method is called is non parametrized  //if we want to call the parent class constructor with parameters then we have to pass the parameters ny using super method
        super(x, y);
        System.out.println("Prametrized child class constructor called");
        m=x;
        n=y;
    }
}



public class constructorExecution {
    public static void main(String[] args) {
        Hello h1 = new Hello();

        Hello h2 = new Hello(10, 20);
    }
}
