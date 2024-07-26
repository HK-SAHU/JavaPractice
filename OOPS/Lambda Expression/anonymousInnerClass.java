interface Car{
    void drive();
}

// class wagonR implements Car{
//     public void drive(){
//         System.out.println("driving");
//     }
// }

public class anonymousInnerClass {
    public static void main(String[] args) {
        // wagonR obj = new wagonR();
        // obj.drive();

        //creating the implementation of the interface car as the anonymous inner class
        Car obj= new Car() {   //the object here is not of the interface car but the of the class which is implenting
            // the interface anonymously
            public void drive(){
                System.out.println("driving");
            }
        };

    }
}

// when we need to use the class only once then we can make the anonymous inner class otherwise we 
//have to make the class which implements the interface

//better version is the lambda expression
