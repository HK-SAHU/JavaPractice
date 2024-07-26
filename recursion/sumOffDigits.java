import java.util.Scanner;

public class sumOffDigits {
    static int sum(int n){
        if (n==0){
            return 0;
        }
        else if(n<10 && n>1){
            return n;
        }
        // int sum =0;
        // sum+=n%10;
        // return sum+sum(n/10);

        return n%10 + sum(n/10);

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int ans=sum(n);
        System.out.println(ans);
    }
}
