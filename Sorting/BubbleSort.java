import java.util.Scanner;

public class BubbleSort {
    static void swap(int[] arr, int i, int j){
        int temp= arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
    }

    static void bubble(int[] arr, int n){
        for(int i=0; i<n;i++){
            boolean swapped =false;
            // for every iteration we get the last element sorted
            for(int j=0; j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr, j, j+1);

                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
        printArray(arr, n);
        
    }

    static void printArray(int[] arr, int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }




    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        bubble(arr, n);
        
    }
}
