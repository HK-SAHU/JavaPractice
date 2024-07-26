import java.util.*;
public class binomial {
    public static int factorial(int x) {    //donot intialize the value equal to 1 which is already at formal parameters
        // instead use another variable like result
        int result=1;
        for(int i=1;i<=x;i++){
            result=result*i;
        }
        return result;
    }
    public static int binomial(int n, int r) {
        int factn= factorial(n);
        int factr= factorial(r);
        int factnr= factorial(n-r);
        int binomial= (factn/(factr*factnr));
        return binomial;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int r =sc.nextInt();
        System.out.println(binomial(n,r));
    }
}
