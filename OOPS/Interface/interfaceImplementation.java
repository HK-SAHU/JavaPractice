interface Demo1{

    int num1=10;

    void sleep();   
    /*let's define this method 
     * but first we have to make another class
     * and using the "implements" keyword we can make make the child class of the interface
     * now we can define the interface methods in that class
     * we can make our own method in the implemantation class and call it using the refrence of that class
     * 
     * unlike the multiple inheritance we can implement more than one interface in the class
     * 
    */
    

}

interface  Demo2{
    void sleep2();

    // void sleep3();  
}

class implementation implements Demo1,Demo2{    // we can do multiple interfacing 

    public void sleep(){
        System.out.println("in show");
    }

    public void sleep2(){
        System.out.println("sleep 2 is sleeping");
    }

// every methods that are there in interface has to be there in implementation
    /////////////////////////////////////////////////////////////////////////////////////////////////
    public void show(){   // this class can also have their own methods
        System.out.println("show is awesome");
    }

    // if don't define the interface methods inside this class the it will give us error
    //The type implementation must implement the inherited abstract method Demo1.sleep()
}

public class interfaceImplementation {
    public static void main(String[] args) {
        // System.out.println(Demo1.num1);

        implementation obj= new implementation();
        obj.sleep();

        obj.show();  // we can call method intialized and defined in class only using the refrence of the class

        obj.sleep2();

        Demo1 obj1 = new implementation();

        obj1.sleep();
        // obj1.show();    //The method show() is undefined for the type Demo1

        // means we cannot call the methods which are defined under the class using the refrence of the interface
        // we can call it only using the refrence of the class

        // obj1.sleep2();  //The method sleep2() is undefined for the type Demo1
    }
}
