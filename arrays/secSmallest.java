public class secSmallest {
    static int secSmallestEle(int[] arr){
        int min= arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]< min){
                min= arr[i];
            }
        }
        return min;
    }

    static int found(int arr[]){
        int min = secSmallestEle(arr);
        for(int i=0 ; i<arr.length;i++){
            if(arr[i]==min){
                arr[i]=Integer.MAX_VALUE;
            }
        }

        int foundEle= secSmallestEle(arr);
        return foundEle;
    }

    public static void main(String[] args) {
        int arr[]={9,8,7,6,5,4,3,2,1};
        System.out.println(found(arr));
    
    }
}
