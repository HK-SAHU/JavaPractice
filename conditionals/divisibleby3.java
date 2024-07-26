package elseif;
import java.util.Scanner;

public class divisibleby3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int num1=sc.nextInt();
        if (num1%3==0){
            System.out.println("divisible by 3");
        }
        else{
            System.out.println("not divisible by 3");
        }
    }
}
