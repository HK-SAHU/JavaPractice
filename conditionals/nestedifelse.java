package elseif;
import java.util.Scanner;
public class nestedifelse {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        if (age>=18 && age<=60){
            if(age>=25 && age<=40){
                System.out.println("you lie under youth category");
                if (age<30){
                    System.out.println("you can marry");
                }
                else{
                    System.out.println("marry now!");
                }
            }
            else if(age<25){
                System.out.println("you lie under kid category");
            }
            else{
                System.out.println("you lie under senior category");
            }
        }
        else if(age<18){
            if(age>10){
                System.out.println("Your are a teenager");
            }
            else{
                System.out.println("you are under 10 years old");
            }
        }
        else{
            System.out.println("you are senior a citizen now");
        }
    }
}
