import java.util.Scanner;

public class binarySearch {
    static int binary(int[] arr, int low, int high, int target){
        while(low<=high){
            int mid= low+(high-low)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                return binary(arr, low, mid-1, target);
            }
            else{
                return binary(arr, mid+1, high, target);
            }
        }
        return -1;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the length of array");
        int n=sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter the elements in an array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the Element you want to search");
        int target= sc.nextInt();
        int low=0;
        int hight=n-1;
        int ans=binary(arr, low, hight, target);
        System.out.println(ans);

    }
}
