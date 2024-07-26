package elseif;
import java.util.Scanner;

public class agechecker {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Your Age:");
            int age =sc.nextInt();
            if(age>=18 && age<=60){
                System.out.println("you can drive");
            }
            else if(age<18){
                System.out.println("you can't drive");
            }
            else{
                System.out.println("you are senior citizen");
            }
        }
    }
}
