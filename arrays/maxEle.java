public class maxEle {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int max=arr[0];
        for(int i=1; i<9;i++){
            // max=arr[0];
            if(arr[i]>arr[0]){
                max=arr[i];
            }

        }
        System.out.println(max);
    }
}
