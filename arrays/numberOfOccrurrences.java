public class numberOfOccrurrences {
    static void occrrence(int arr[], int value){
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]== value){
                count++;
            }
        }
        System.out.println(count);
    }


    public static void main(String[] args) {
        int arr[]={1,1,1,1,2,2,3,3,3,4,5,5};
        occrrence(arr, 7);
    }
}
