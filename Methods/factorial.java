import java.util.Scanner;

public class factorial {
    public static int fact(int n) {
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i; 
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fact(n));
    }
}
