class laptops{
    int a;
    int b;

    laptops(){
        System.out.println("There are numerous companies of laptops");
    }

    laptops(int x, int y){
        System.out.println("lets say there are x and y numbers of laptops are there");
    }
}

class asus extends laptops{

    int m;
    int n ;
    asus(){
        // this(10, 20);
        // this();    // Recursive constructor invocation asus()   this gives us error
        System.out.println("i have asus laptop");

    }

    asus(int x, int y){
        //super()
        System.out.println("i have asus tuf dash f15");
    }
}

public class constructorExecutionThis {
    public static void main(String[] args) {
        asus asus = new asus();

        // laptops lap = new laptops();
    }

}
