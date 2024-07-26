import java.util.Scanner;

public class rotatingInPlace {
    static void  swapInArray(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
    }


    static void reverse(int[] arr, int i, int j) {
        
        while (i < j) {
            swapInArray(arr, i, j);
            i++;
            j--;
        }
        
    }

    static void inPlaceRotation(int[] arr, int k){
        int n =arr.length;
        k=k%n;    // for k if it has a hug value like 100+
        reverse(arr, 0, n-k-1);
        reverse(arr, n-k,n-1);
        reverse(arr, 0,n-1);
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2,3,4,1};
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        inPlaceRotation(arr, k);
        printArray(arr);
        

    }
}
