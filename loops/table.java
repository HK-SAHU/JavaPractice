package loops;

import java.util.Scanner;
public class table {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your numnber:");
            int number= sc.nextInt();
            for(int i=1;i<=10;i++){
                System.out.println(number+"*"+i+"="+number*i);
            }
        }
    }
}
