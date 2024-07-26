package elseif;

import java.util.*;

public class electricitybill {
    public static void main(String[] args) {
        int rate;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you ID:");
        int Id = sc.nextInt();
        System.out.println("Enter your Unit Consumed:");
        int unit = sc.nextInt();
        if (unit >= 0 && unit <= 25) {
            rate = 5 * unit;
            System.out.println(rate);
            if (unit <= 50) {
                int rate1 = rate + (unit - 25) * 10;
                System.out.println(rate1);
                if (unit <= 100) {
                    int rate2 = rate + (unit - 50) * 15;
                    System.out.println(rate2);
                }
            }
        }

    }
}
