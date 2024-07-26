class fighters{
    String Rafale="France";
    String MIG_21="USSR";
    String Sukhoi_30mki="Russia";
    void display(){
        System.out.println(Rafale);
        System.out.println(MIG_21);
        System.out.println(Sukhoi_30mki);
    }
}

class Rafale extends fighters{

}
class MIG_21 extends fighters{
    
}
class Sukhoi_30mki extends fighters{
    
}

public class hierarchialLevel {
    public static void main(String[] args) {
        Rafale rf= new Rafale();
        MIG_21 mi= new MIG_21();
        Sukhoi_30mki su = new Sukhoi_30mki();
        rf.display();
        System.out.println();
        mi.display();
        System.out.println();
        su.display();
    }
}

/*
 * a single  parent class have multiple child class and all the child classes inherits  all the properties from the parent class 
 */
