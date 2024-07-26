import java.util.Scanner;;
public class RotatingArray {
    static  int[] rotate(int arr[],int k){
        int n = arr.length;
        k=k%n;    // because after one cycle it will start repeating itself
        int[] ans = new int[n];
        int j =0;
        for(int i=n-k; i<n;i++){
            ans[j++]=arr[i];
        }
        for(int i=0; i<n-k;i++){
            ans[j++]=arr[i];
        }
        return ans;
    }

    static void printArray(int[] arr){
        for(int i=0 ; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }



    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        Scanner sc =new Scanner(System.in);
        int k= sc.nextInt();
        int[] ans=rotate(arr, k);
        printArray(ans);
        
    }
}
