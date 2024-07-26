import java.util.Scanner;

/*public class primeornot {
    public static boolean isPrime(int a){
        boolean isPrime= true;
        for(int i=2;i<=a-1;i++){
            if (a%i==0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        System.out.println(isPrime(a));
    }
}


//////////////////////// OPTIMISED ///////////////////////////////

public class primeornot{
    public static boolean isPrime(int a) {
        for(int i=2; i<=a-1;i++){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        System.out.println(isPrime(a));
    }
}*/


//////////////////////////// MOST OPTIMISED APPROACH ///////////////////////////////

public class primeornot{
    public static boolean isPrime(int n) {
        if (n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if (n%i==0){
                return false;
            }
        }
        return true; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        System.out.println(isPrime(a));
    }
}
