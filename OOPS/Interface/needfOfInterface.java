// abstract class computer{
//     abstract public void compileCode();
// }


//instead of abstract class we can create the interface

interface computer{
    void compileCode();  
}

class desktop implements computer{
    public void compileCode(){
        System.out.println("you got 5 errors, faster");
    }
}

class laptops implements computer{
    public void compileCode(){
        System.out.println("you got 5 errors");
    }
}


class developers{

    public void builddApp(computer obj) {
        System.out.println("buildingg app");
        
        obj.compileCode();
    }

}

public class needfOfInterface {
    public static void main(String[] args) {
        computer obj= new desktop();
        developers dev= new developers();
        dev.builddApp(obj);
    }
}
