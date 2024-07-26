public class sortZeroes {
    static void moveZeroes(int[] nums) {
        int n = nums.length;
        int[] ans= new int[n];
        int j =n-1;
        int start=0;
        for(int i =0 ;i<n;i++){
            if(nums[i]==0){
                ans[j--]=nums[i];
            }
            else{
                ans[start++]=nums[i];
            }
        }
        
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int nums[]={1,0,3,5,0,6,7};
        moveZeroes(nums);
        printArray(nums);
    }
}
