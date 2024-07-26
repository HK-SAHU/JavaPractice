public class logicaloperator {
    public static void main(String[] args) {
        int a=20;
        int b=10;
        boolean result= a>b && a<b && a!=b;  // if any one expression is flase then whole expression is false
        System.out.println(result);          //if all are true then whole expression is true

        boolean answer= a<b || a>b || a!=b;  //if any one expression is true then whole expression is true 
        System.out.println(answer);          //if all expression is false then whole expression is false

        boolean res=!(a<b);   //reverse the answer true to false and false to true
        System.out.println(res);   //if expression is true then it will return false and vice versa
    }
}
