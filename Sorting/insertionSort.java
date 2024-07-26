import java.util.Scanner;

public class insertionSort {
    static void insertion(int[] arr, int n){
        for(int i=1;i<n;i++){
            int j=i;
            while(j > 0 && arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j]= arr[j-1];
                arr[j-1]= temp;
                j--;
            }
        }

        printArray(arr);
    }

    static void printArray(int[] arr){
        for(int n: arr){
            System.out.print(n +" ");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[n];
        for(int i=0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        insertion(arr, n);
    }
}


// it is a stable algo
   
