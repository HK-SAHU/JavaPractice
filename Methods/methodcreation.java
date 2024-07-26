
// function is a bloack of code that we call it when we need it but the main diffference is that is it called by only its name

// method is same as function, but the main difference that it is called with the help of object 

// if we do not provide any access specifier then the default will be considered as the default access specifier

class student{
    public int add(int a, int b){
        int result= a+b;
        return result;
 }
}

public class methodcreation {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        student obj = new student();
        System.out.println(obj.add(a, b));
    }
}
