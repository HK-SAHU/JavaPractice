class Aeroplane{
    public void takeoff(){   //Inherited Method 
        System.out.println("AeroPlane is taking off");
    }
    public void fly(){   //overriden method 
        System.out.println("AeroPlane is flying");
    }
}

class CargoPlane extends Aeroplane{
    public void fly(){   // overriding method
        System.out.println("CargoPlane Flies at Lower Height");
    }
    public void CarryGoods(){  //specialized method
        System.out.println("CargoPlane Carries Good");
    }
}

class Passenger extends Aeroplane{
    public void fly(){  //overriding method
        System.out.println("PassengerPlane Flies at Medium height");
    }
    public void CarryPassengers(){    // specialized method
        System.out.println("Passenger Plane Carries Passengers");
    }
}

public class typesOfMethods {
    public static void main(String[] args) {
        
    }
}


/*
 * Inherited methods =  are those which are just inherited from the parent class and they are modified in the child class
 * 
 * OverRidden method =  are those which are in parent clas and they get modified in the child class, so in the parent class it is known as overridden method 
 * 
 * overriding method = are those which get inherited from the parent class and they get modified in the child class and in the child clss it is known as overriding method
 * and the same method in the parent class is known as overriden method
 * 
 * Specialized Method = are those method which are created in the child class.
 * 
 */
