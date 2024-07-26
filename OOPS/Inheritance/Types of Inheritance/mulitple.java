class parent1{
    void display1(){
        System.out.println("parent1");
    }
}

class parent2{
    void display2(){
        System.out.println("parent2");
    }
}

// class child extends parent1, parent2{

// }

/*
 * single child cannot inherit the properties from the parent1 and parent2 
 * basically a single parent cannot inherit the properties of the 2 or more parent classes
 * it makes the complier ambigues
 * this problem is known as DIAMOND PROBLEM
 */



public class mulitple {
    public static void main(String[] args) {
        
    }
}
