import java.util.Scanner;

public class binarytodeciaml {
    public static int btod(int a) {
       int pow=0;
       int decimal=0;
       while(a>0){
        int lastDigit=a%10;
        decimal=(int) (decimal+(lastDigit * Math.pow(2, pow)));
        pow++;
        a=a/10;
       }
       return decimal;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        System.out.println("Binary to decimal is: "+ btod(a));
    }
}
