// final class Animal{   // final class do not participate in the Inheritance 
//     void sleep(){
//         System.out.println("animals do sleep");
//     }
// }


class Animal{
    final int age =20;

    // final int work;   //The blank final field work may not have been initialized

    final void sleep(){

        // age= 21;    // if the variable is final then we cannot change its value it will work as constant

        System.out.println("animals do sleep");
    }
}

class Tiger extends Animal{
    void sleep(){    // if we declare the method as final in the paren class then that method cannot be override in the child class

    }
}






public class Intriduction{
    public static void main(String[] args) {
        Tiger t= new Tiger();
        t.sleep();
    }
}