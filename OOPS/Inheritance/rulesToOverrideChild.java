class Cats{
    public void disp(){
        System.out.println("there are many types of cat");
    }

    public void age(int x){
        System.out.println("age of the cat is: "+ x);
    }
}

class bigCats extends Cats{
    // void disp(){    //Cannot reduce the visibility of the inherited method from Cats  but we can increase the visibility of the inherited method
    //     System.out.println("Tiger, lions are bigCats");
    // }

    // public int disp(){   //The return type is incompatible with Cats.disp()   we cannot change the return type of the inherited methods
    //     return 10;
    // }

    public void disp(){
        System.out.println("tiger and lions are bigCats");
    }

    public void age(){   // this method is not the overriding method of the parent class, it will be treated as the speacialized method of the parent class
        // and it is following the rule of the method overloading
        System.out.println("the age of the cat is ");
    }

    public void  age(int x){  // now this methos is the overriding method 
        System.out.println("age of the cat is: "+x);
    }
}


public class rulesToOverrideChild {
    public static void main(String[] args) {
        bigCats cat =new bigCats();
        cat.disp();
    }
}
