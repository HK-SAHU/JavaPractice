import java.util.Scanner;

public class secondLargestEle {

    static int LargestEle(int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;

    }

    static int secLargetEle(int[] arr) {
        int max = LargestEle(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                arr[i] = Integer.MIN_VALUE;    // this will give us the minimum value.
            }
        }

        int secMax = LargestEle(arr);
        return secMax;
    }

    // static int LargetEle(int arr[]){
    // int max=Integer.MIN_VALUE;
    // for(int i=0; i<arr.length;i++){
    // if(arr[i]>max){
    // max=arr[i];
    // }
    // }
    // return max;
    // }

    // static int secLargetEle(int[] arr){
    // int max= LargetEle(arr);
    // for(int i=0; i<arr.length;i++){
    // if(arr[i]==max){
    // arr[i]=Integer.MIN_VALUE;
    // }
    // }

    // int secMax= LargetEle(arr);
    // return secMax;
    // }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[] arr= new int[9];
            for(int i=0 ;i<arr.length;i++){
                arr[i]= sc.nextInt();
            }
            // int arr[]={1,2,3,4,5,6,7,8,9};
            // int arr[] = { -1, -2, -3, -4, -5, -6 };
            System.out.println(secLargetEle(arr));
        }
    }
}