abstract class AeroPlane{
    abstract public void takeoff();

    abstract public void fly();

    public void landing(){
        System.out.println("plane is landing");
    }
}

//100% abstraction is achieved when all the methods are abstract method
// if any there is any method in the parent class whose body and implemnetation is hidden is has to be declared as abstract
// if there is even single abstract method in the class, then the class has to be declared as abstract class
// when we use abstract it means we are not using the implentation of that method anywhere, that's why we make that abstract
// or we can say that the method is overriden in it's all child classes then we can make that method abstract
// implemantation of these methods are given in there child classes
// we can make the refrence(variable) of the ABSTRACT CLASS   
// we cannot make the object of the abstract class because the abstract class is incomplete, it donot have the body or the methods in it are imcomplete     
// if have methods which have some body then we are not achieving the 100% abstraction  -> interface ka concept ayege isme 


class CargoPlane extends AeroPlane{
    public void takeoff(){
        System.out.println("CargoPlane take off");
    }
    public void fly(){
        System.out.println("CargoPlane flies");
    }

    public void alert(){
        System.out.println("alert...");
    }
}

class PassengerPlane extends AeroPlane{
    public void takeoff(){
        System.out.println("PassengerPlane takeoff");
    }
    public void fly(){
        System.out.println("PassengerPlane flies");
    }

    public void alert(){
        System.out.println("alert...");
    }
}

public class introduction {
    public static void main(String[] args) {
        AeroPlane cp= new CargoPlane();

        cp.takeoff();
        cp.fly();
        cp.landing();
        // cp.alert();     // this is not possible if we are using AeroPlane as a type for the Object refrence, but it is possible if we are uisng CargoPlane type 
        //as arefrence

        ((CargoPlane) cp).alert();  //we can fix this issue by usin the casting that is changing the datatype as CargoPlane 

        // CargoPlane CP = new CargoPlane();
        // CP.alert();

        AeroPlane pp= new PassengerPlane();

        pp.takeoff();
        pp.fly();
        pp.landing();
        // pp.alert();     // this is not possible if we are using AeroPlane as a type for the Object refrence, but it is possible if we are uisng PassengerPlane type 
        //as arefrence

        ((PassengerPlane) pp).alert();  //we can fix this issue by usin the casting that is changing the datatype as CargoPlane 

    }
}
