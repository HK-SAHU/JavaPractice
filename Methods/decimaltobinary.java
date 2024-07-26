import java.util.Scanner;

public class decimaltobinary {
    public static int dtob(int a) {
         int pow=0;
         int binary=0;
         int rem=0;
         while(a>0){
            rem=a%2;
            binary=(int)(binary+rem*Math.pow(10, pow));
            pow++;
            a=a/2;
         }
         return binary;
    }
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Decimal to Binary is: "+ dtob(a));
    }
}
