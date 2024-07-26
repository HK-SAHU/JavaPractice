import java.util.Scanner;

public class binarySearch {
    static int binary(int[] arr, int n, int target){

        int start=0;
        int end=n-1;
        while(start<=end){
            int mid= start+(end-start)/2;    // if the value  of start and end is very high then calculation can overflow that's why we use this
            if(target==arr[mid]){
                return mid;
            }
            else if(target> arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }

        }
        return -1;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target = sc.nextInt();
        int idx=binary(arr, n, target);
        System.out.println(idx);
    }
}
