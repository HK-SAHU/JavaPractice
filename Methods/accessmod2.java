import packages.pw.*;
import packages.pw.*;      //  * is defining the files of that particular packages then we can access all the classes of that package

public class accessmod2{
    public static void main(String[] args) {
        accessmod obj = new accessmod();
        System.out.println("outside package, non-child class "+obj.str1);
        app3 obj2 = new app3();
        obj2.printFromChildClass();
    }
}


class app3 extends accessmod{  //child class of parent class accessmod
    
    void printFromChildClass(){
        app3 obj = new app3();  // this object will point towards accessmod class of the accessmod file
        System.out.println("i am a child class "+obj.str1);
    }
}


// class app4 extends app2{}
/*if i want to create the child class of the app2 class in the accessmod file 
then it will not create the class as it will not be able to see the class and the class is not public */




