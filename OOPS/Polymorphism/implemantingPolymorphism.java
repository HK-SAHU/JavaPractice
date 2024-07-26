class AeroPlane2{
    
    public void takeOff(){
        System.out.println("aeroplane take off");

    }

    public void fly(){
        System.out.println("aeroplane flies");

    }
}

class CargoPlane2 extends AeroPlane2{
    public void takeOff(){
        System.out.println("CargoPlane take off");
    }
    public void fly(){
        System.out.println("CargoPlane flies");
    }
}

class PassengerPlane2 extends AeroPlane2{
    public void takeOff(){
        System.out.println("PassengerPlane takeoff");
    }
    public void fly(){
        System.out.println("PassengerPlane flies");
    }
}

class fighterPlane extends AeroPlane2{
    public void takeOff(){
        System.out.println("fighterPlane take off");
    }
    public void fly(){
        System.out.println("fightPlane flies");
    }
}

class airport{
    void polyMorphism(AeroPlane2 ref){
        ref.takeOff();
        ref.fly();
        System.out.println("----------------------------------------");
    }
}



public class implemantingPolymorphism {
    public static void main(String[] args) {
        CargoPlane2 cp =new CargoPlane2();
        System.out.println(cp);  // cp contains the address of cargoplane CargoPlane2@7a81197d

        PassengerPlane2 pp = new PassengerPlane2();

        fighterPlane fp = new fighterPlane();


        // we created the new class in which we are sending the object variables of the child class and upon receving it the refrence variable of the parent class is
        //storing the refrence variable of  the object child class 
        // then it is calling the particcular function from the particular classes
        airport a= new airport();

        a.polyMorphism(cp);  //passing the address of the cp
        a.polyMorphism(pp);
        a.polyMorphism(fp);
    }
}
