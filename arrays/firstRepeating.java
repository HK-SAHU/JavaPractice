public class firstRepeating {
    static int firstRepeat(int[] arr){
        for(int i=0 ; i<arr.length;i++){
            for(int j=i+1; j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return arr[i];   // no need to write break because the return will automatically break the statement.
                }
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int arr[]= {1,2,3,4,3,5,5,6};
        System.out.println(firstRepeat(arr));
    }
}
