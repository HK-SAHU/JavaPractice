public class reverseArray {
    static void reverse(int[] arr){  //problem in this approach is that we need to create the new array
        int n= arr.length;
        int j=0;
        int[] ans= new int[n];
        for(int i=arr.length-1;i>=0;i--){
            // System.out.print(arr[i]+" ");
            ans[j++]=arr[i];
        }
        // int k= n-1;       // using while loop to reverse an array
        // while(k>=0){
        //     ans[j++]=arr[k--];
        // }
        // printArray(ans);
    }

    static void printArray(int[] arr){
        for(int i=0 ; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }


    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        reverse(arr);
    }
}
