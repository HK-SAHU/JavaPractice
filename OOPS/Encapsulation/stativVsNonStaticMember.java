class Demo{
    static int a;
    static int b;

    int m;
    int n;
    /*
     * if we don't create the object for the m and n instance variable then the memory of both the variable will never be made
     */

    static{
        System.out.println("control in static");
        a=10;
        b=20;

        // m=50;   /* we cannot assign the non static member in static block because the static block will load at the time of  class loading and non static member will load after creating the object*/
                    /*
                     * non static variable (instance variable) cannot be used in static family
                     */
    }

    {
        System.out.println("control in non static block");
        m=30;
        n=40;
        // a=50;   // but we can assign the value to the static member/variable in non static block
    }

    static void disp1(){
        System.out.println("a:"+a);
        System.out.println("b:"+b);
        // System.out.println("m:"+m);  // Cannot make a static reference to the non-static field m
    }

    void disp2(){
        System.out.println("m:"+ m);
        System.out.println("n:"+n);
    }


}

public class stativVsNonStaticMember {
    public static void main(String[] args) {
        Demo obj= new Demo();
        Demo.disp1();  // here we just used the class name to call the disp1 method because the staitc family load at the time of the class loading 
        obj.disp2();  // here we used the object to call the disp2 method
        
    }
}

/*
 * FLOW OF THE EXECUTION
 * 
 * first the class will load
 * then the it will also give memory to the static variable
 * then static block will execute 
 * then it will go to the main class and main method 
 * where the object will be created of the Demo class 
 * just after the creation of the object the memory of the instance varible will be given
 * then control will goes to non static block
 * then the control will go to Demo.disp1(); and it will execute the method
 * 
 * then the control will go to obj.disp2(); and then it will execute the method  
 *
 */
