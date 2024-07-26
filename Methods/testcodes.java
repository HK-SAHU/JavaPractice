import java.util.*;

import packages.app1;
import packages.pw.*;

///////////////////////// RETURNING THE VALUES ////////////////////////////

/* 
public class testcodes {
    public static int test(int a) {
        if (a==0 || a==1)
             return 1;
        else 
            return 2;  
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(test(a));
    }
}



////////////////////////// TESTING DIFFERENT RETURN TYPE  WITH SAME PARAMETERS /////////////////////////

class testreturn{
    public static int sum(int a, int b) {     // function overloading is not dependent on return type 
        return a+b;
    }
     public static float sum(int a, int b) {
        return a+b;
    }
    public static void main(String[] args) {
        int a= 10;
        int b= 20;
        System.out.println(sum(a,b));
    }
}*/


///////////////////////////////////// RETURNING THE SAME TYPE AS THE PARAMETERS /////////////////////////////////
class samereturn{
    public static int sum(int a, int b) {
        return a+b;
    }
    public static float sum(float a, float b) {
        return a+b;
    }
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter the 1st integer digit: ");
        int x =SC.nextInt();
        System.out.print("Enter the second integer digit: ");
        int y =SC.nextInt();
        System.out.println("Sum of integer digits is: "+sum(x, y));
        System.out.print("Enter the 1st float digit: ");
        float a= SC.nextFloat();
        System.out.print("Enter the 2nd float digit: ");
        float b= SC.nextFloat();
        System.out.println("sum of float digits is: "+sum(a, b));
        app obj =new app();
        app1 obj2= new app1();
    }
}



