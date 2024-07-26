class algebra{

    //class level varibale can be access anywhere in the class

     int a=10;
     int b=5;

     int add(){
        //method level of scope which can only be access in the method where it is declared

        int q=10;
        int p=10;
        return a+b;
     }

     int sub(){
        return a-b;
     }

}


public class scopeOfVariables {
    public static void main(String[] args) {
        int a=10;
        double a;
        int a=11;
        // cannot have same name of variable 
    }
}

// then we have block leevel of scope in whoch the variable is valid in that partiular scope only
// we can have multiple block inside any method/ class
