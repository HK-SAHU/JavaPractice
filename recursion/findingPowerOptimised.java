import java.util.Scanner;

public class findingPowerOptimised {
    static long power(long a, long b){
        if (b==1){
            return a;
        }
        long temp=power(a, b/2);
        if(b%2==0){
            return temp*temp;
        }
        else{
            return a*temp*temp;
        }
        
    }



    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long a= sc.nextInt();
        long b= sc.nextInt();
        long ans=power(a, b);
        System.out.println(ans);
    }
}
