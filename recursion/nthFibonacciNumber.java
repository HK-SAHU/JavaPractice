import java.util.Scanner;

import javax.swing.undo.StateEdit;

public class nthFibonacciNumber {
    static int fibo(int n){
        if(n==0 || n==1){
            return n;
        }
        else{
            return fibo(n-1)+ fibo(n-2);
        }
    }
    


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int ans = fibo(n);
        System.out.println(ans);
    }
}
