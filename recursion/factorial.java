import java.util.Scanner;

public class factorial {
    static int fact(int num){
        if(num==1 || num == 0){
            return 1;
        }

        else{
            return num*fact(num-1);
        }
    }



    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        int ans=fact(num);
        System.out.println(ans);
    }
    
}
