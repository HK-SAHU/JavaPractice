class demo{
    void display(){
        System.out.println("this is a parent class");
    }
}

class demo1 extends demo{

}

class demo2 extends demo1{

}

public class multiLevel {
    public static void main(String[] args) {
        demo2 d2 = new demo2();
        d2.display();
    }
}

/*
 * demo <- demo1 <- demo2  
 * there is the chain of the class which are connected to each other 
 * this means demo1 inherits the propoerties from demo class and demo2 inherits the properties from demo1 class.
 */
