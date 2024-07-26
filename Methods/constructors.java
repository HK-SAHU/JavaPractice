import java.util.Scanner;

class algebra{

    int a ;
    int b ;


    algebra(int x, int y){  // default constructors
        System.out.println("constructor of algebra class called");
        a=x;
        b=y;
    }

    int add(int a, int b){
        int result = a+b;
        return result;
    }

    int sub(){
        return a- b;
    }

    int multi(){
        return a*b;
    }
}

public class constructors {
    public static void main(String[] args) {
        algebra obj = new algebra(5,7);   // algebra() is a constructor or we can say that it is actually calling the constructotr off thr class
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b =sc.nextInt();
        int ans =obj.add(a,b);
        System.out.println("sum of the two numbers is: " + ans);
        System.out.println(obj.sub());
        System.out.println(obj.multi());

    }
}

//constructors are the special methods used to initialize objects

//constructor name = class name 

//constructor has no return type

// when we pass parameters in the default constructor the it becomes parametrized constructors

// algebra class mein jo humne variables banaye unko humne object ke parameters ki value de di... aur wahi values dusre methods kko bhi mil gyi jaise sub aur multi
//toh hume sub aur multi ke liye alag se parameters nhi pass karne padhe 
