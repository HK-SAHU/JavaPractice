// package OOPS.Interface;

interface Demo{
    int num=10;    //by default it is public static final
    public static final int num1=11;    // no need to write public static final


    void sleep();  // and by default the methods are public and abstract

    public void hello();

    // void animal(){     //Abstract methods do not specify a body    this means that it is not possible to define the abstract method 

    // }

    

}

public class introductionInterface{
    public static void main(String[] args) {
        System.out.println(Demo.num);

        // Demo obj = new Demo();       //Cannot instantiate the type Demo
    }
}