package packages.pw;
public class accessmod {

    // public String str1= "i am in the class";
    // protected String str1= "i am in the class";
    public String str1= "i am in the class";


    void printFromClass(){
        System.out.println("within the class" + str1);
    }
    public static void main(String[] args) {
        accessmod obj = new accessmod();
        obj.printFromClass();
        app2 obj2 = new app2();
        obj2.printOutsideClass();
    }
    // public void printOutsideClass() {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'printOutsideClass'");
    // }
}

class app2{
    public void printOutsideClass(){
        accessmod obj = new accessmod();
        System.out.println("within package, outside the class" + obj.str1);
    }
}
