import java.util.*;

public class parameters {
    public static int sum(int a, int b) {
        int sum = a+b;
        return sum;
    }
    public static int  product(int a, int b) {
        int product =a*b;
        return product;
    }
    public static int divide (int a, int b) {
        int divide = a/b;
        return divide;
    }
    public static int subtractiont(int a, int b) {
        int sub = a-b;
        return sub;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        System.out.println(sum(a,b));
        System.out.println(product(a,b));
        System.out.println(divide(a,b));
        System.out.println(subtractiont(a, b));
        int c = sc.nextInt();
        int d = sc.nextInt();
        System.out.println("new sum is: "+sum(c, d));
        
    }
    
}
