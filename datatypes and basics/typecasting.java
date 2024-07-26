public class typecasting {
    public static void main(String[] args) {
        //implicit typecasting
        int a=45;
        double b;
        b=a;
        System.out.println(b);

        //explicit typecasting
        double num1=45.5;
        int num2;
        num2=(int)num1;
        System.out.println(num2);

        //truncation or rounding to zero
        int n1=12;
        int n2=5;
        float res=n1/n2;
        System.out.println(res);  //output will be 2.0

        float a1=12;
        float a2=5;
        int res1=(int) (a1/a2);
        System.out.println(res1); 
    }
}
