public class jalebClassMain {
    public static void main(String[] args) {
        // jalebi j1= new jalebi();
        // jalebi j2= new jalebi();
        // jalebi j3= new jalebi();
        // jalebi j4= new jalebi();

        // there can be a lot of jalebi beccause we have created the jalebi class constructor as public 
        // and if make the constructor private then we cannot make even one object of that class

        jalebi j1= jalebi.getJabelbi();
        System.out.println(j1.hashCode());
        jalebi j2= jalebi.getJabelbi();
        System.out.println(j2.hashCode());

        // hash code is smae that means the object is created in only once and we are just the same object with
        //different name/variables


        // eager way creaiting object
        Copy c1= Copy.getCopy();
        System.out.println(c1.hashCode());
        Copy c2= Copy.getCopy();
        System.out.println(c2.hashCode());
    }
}
  

/*
 * flaws in eager way that if we don't want the object yet the object is already made
 * 
 * 
*/