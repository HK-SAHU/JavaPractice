import java.util.Scanner;

public class selectionSort {
    static void printArray(int[] arr){
        for(int num:arr){
            System.out.print(num+" ");
        }
    }

    static void selection(int[] arr, int n){
        
        for(int i=0; i<n-1;i++){
            int min=i;
            for(int j=i+1; j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
                
            }
            if (min !=i) {  // this if block is optional it will work still. it will make your code more efficient
                int temp= arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
            }
            
        }

        printArray(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        selection(arr, n);
    }
}
