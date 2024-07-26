

class Parent{
    private int age;
    Parent(int value){
        this.age=value;
    }
    int getValue(){
        return age;
    }
}

class Child extends Parent{
    Child(int value){
        super(value);
    }
    void disp(){
        int gotTheValue= getValue();
        System.out.println(gotTheValue);
    }
}



public class howToCallPrivateInChild {
    public static void main(String[] args) {
        Child ch= new Child(21);
        ch.disp();
    }
}

/*
 * to call the private property of the parent class to the child class is done by using super() method in child class constructor
 * 1. create the object of the child class. and create the constructor of the child class
 * in child class use the super() method and pass the parameter  (this parameter in the super class will go to the constructor of the parent class)
 * now create the disp() method in the child class which will call the getter of the private value int the parent class and print it
 * int the parent class create the constructor which will recieve the parameter which was passes by the super() method of the child class constructor
 * now assign the value of the private property(age) to the parameter (value) using this.age= value;
 * now using the getter return the age .
 * in the disp() method in the child class the getter data will stored in a new variable and then print that variable 
 * now you get the value of the value of the private property of the parent class
 * 
 *
 */
