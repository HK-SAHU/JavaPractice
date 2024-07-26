import java.util.Scanner;

class Farmer{
    int pa;
    float td;
    static float ri;
    float si;

    static{
        ri=4.5f;
    }

    void input(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the principle amount");
        pa=sc.nextInt();
        td=sc.nextFloat();
    }

    void compute(){
        si=(pa*ri*td)/100f;

    }

    void disp(){
        System.out.println(si);
    }

}

public class whenToUseStaticFamily {
    public static void main(String[] args) {
        Farmer obj1= new Farmer();
        Farmer obj2= new Farmer();

        obj1.input();
        obj1.compute();
        obj1.disp();

        obj2.input();
        obj2.compute();
        obj2.disp();
    }
}

/*
 * we kept ri as static because it is same for all the farmers(objects), if we won't make it static then it will use the extra memory in heap memory every time we create the object
 * that's why we kept it as static and initailize it in static block
 */
   
