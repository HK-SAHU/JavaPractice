import java.util.Scanner;

public class alternateSumSeires {
    static int altrnateSum(int n){
        if(n==0){
            return 0;
        }
         else if(n%2==0){
            return altrnateSum(n-1)-n;
        }
        
        return altrnateSum(n-1)+n;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int ans=altrnateSum(n);
        System.out.println(ans);
    }
}


/*
 * we are using n function calls for n number therefore the time complexity is O(n)
 * and space complexxity is O(n)
 */
