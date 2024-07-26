class Animal{
    void sleep(){
        System.out.println("Animal need sleep");
    }
}

class tiger extends Animal{

}

public class singleLevel {
    public static void main(String[] args) {
        tiger t= new tiger();
        t.sleep();
    }
}

/*
 * this is called single level inheritance 
 * 1 parent class and 1 child class is only present
 */
