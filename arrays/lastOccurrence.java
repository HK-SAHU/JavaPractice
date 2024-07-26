public class lastOccurrence {
    
    // static void occrrence(int arr[], int value){
    //     for(int i=arr.length-1; i>0;i--){
    //         if(arr[i]==value){
    //             System.out.println(i);
    //             break;
    //         }
    //     }
    // }

    static void occrrence(int arr[],int value){
        int lastIndex=-1;
        for(int i =0; i<arr.length;i++){
            if (arr[i]==value){
                lastIndex=i;
            }
        }
        System.out.println(lastIndex);
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,3};
        occrrence(arr, 3);
    }
}
