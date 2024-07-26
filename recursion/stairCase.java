import java.util.Scanner;

public class stairCase {
    static int stairs(int n){
        if(n==1||n==2 ||n==3){
            return n;
        }
        return stairs(n-1)+stairs(n-2);
    }
    

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int ans=stairs(n);
        System.out.println(ans);
    }
}
