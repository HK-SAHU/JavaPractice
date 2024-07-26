public class relationaloperator {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println(a==b);   //false
        System.out.println(a<b);    //true
        System.out.println(a>b);    //flase
        System.out.println(a<=b);   //true
        System.out.println(a>=b);   //false
        System.out.println(a!=b);   //true

        boolean result = a<=b;   // don't forget to mention the datatype of the variable
        System.out.println(result);
    }
    
}
