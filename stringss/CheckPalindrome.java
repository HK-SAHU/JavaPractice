import java.util.Scanner;

public class CheckPalindrome {
    static boolean isPalindrome(String str, int start, int end){
        while(start<end){
            if(str.charAt(start)!=str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        int n= str.length();
        int start=0; int end= n-1;
        
        boolean check=isPalindrome(str, start, end);
        System.out.println(check);
    }
}
