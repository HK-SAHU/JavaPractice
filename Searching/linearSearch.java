import java.util.Scanner;

public class linearSearch {
    static int linear(int[] arr, int n, int target){
        int idx=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                idx=i;
                break;
            }
            
            
        }
        if(idx==-1){
            return idx;
        }
        return idx;
    }
    

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        int target= sc.nextInt();
        int idx=linear(arr, n, target);
        System.out.println(idx);
    }
}
