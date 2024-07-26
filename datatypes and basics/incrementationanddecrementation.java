public class incrementationanddecrementation {
    public static void main(String[] args) {
        //incrementation 

        int a=5;
        a++;
        System.out.println(a);

        //post incrementation 

        int num1=5;
        int num2=num1++;   //first assign then increment
        System.out.println(num1);
        System.out.println(num2);


        //pre-incrementation

        int n1=5;
        int n2=++n1;   //first increment then assign
        System.out.println(n1);
        System.out.println(n2);

        //decrementation

        int b=6;
        b--;
        System.out.println(b);

        //post decrementation 

        int number1=5;
        int number2=number1--;   //first assign then decrement
        System.out.println(number1);
        System.out.println(number2);


        //pre-decrementation

        int pre_num1=5;
        int pre_num2=--pre_num1;    //first decrement then assign
        System.out.println(pre_num1);
        System.out.println(pre_num2);


        //expression

        int num11=5;
        int num12=num11++ + ++num11 + --num11;
        System.out.println(num11);
        System.out.println(num12);

    }
}
