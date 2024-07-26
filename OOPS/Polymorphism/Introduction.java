class Aeroplane1{
    public void takeOff(){
        System.out.println("AeroPlane do take off");
    }

    public void fly(){
        System.out.println("AeroPlane do fly");
    }
}

class CargoPlane1 extends Aeroplane1{
    public void takeOff(){
        System.out.println("Cargo Plane take of slow");
    }

    public void fly(){
        System.out.println("Cargo Plane fly at medium height");
    }
}
class PassengerPlane1 extends Aeroplane1{
    public void takeOff(){
        System.out.println("Passenger Plane take off fast");

    }

    public void fly(){
        System.out.println("passenger Plane fly at greater height");
    }
}


public class Introduction {
    public static void main(String[] args) {
        CargoPlane1 cp= new CargoPlane1();

        //cp cargoplane object ko refer kar rha hai 
        // cp ke pass cargoplane object ka address hai

        PassengerPlane1 pp = new PassengerPlane1();

        Aeroplane1 ref;   // creating a refrence  variable ref with the type Aeroplane1
        


        ref =cp;    //assigning the object address of the cargoplane to the ref
        //parent class object ke pass capacity hoti hai child class ke object ko hold karne ki

        ref.takeOff();
        ref.fly();

        System.out.println("---------------------------------------------------------------");

        ref= pp;    //assigning the object address of the cargoplane to the ref
        //parent class object ke pass capacity hoti hai child class ke object ko hold karne ki


        ref.takeOff();
        ref.fly();

        // pp=cp;   // cargo plane ke type ke address passenger palne nhi hold kar payega kyunki dono ka type alag hai
    }
}
