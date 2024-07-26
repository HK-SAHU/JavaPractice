public class evenLeftOddRight {
    static void evenOdd(int arr[]){
        int n= arr.length;
        int left=0;
        int right=n-1;
        while(left<right){
            if(arr[right]%2==0 && arr[left]%2!=0){
                swap(arr, left, right);
                left++;
                right--;
            }
            if(arr[left]%2==0) left++;
            if(arr[right]%2!=0 ) right--;
        }

    }
    
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        evenOdd(arr);
        printArray(arr);
        
    }
}