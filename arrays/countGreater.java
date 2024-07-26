public class countGreater {
    static void greaterEle(int arr[], int x){
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>x){
                count++;
            }
        }
        System.out.println(count);
    }


    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int x=1;
        greaterEle(arr, x);    }
}
