public class missingNumber {
    static void Missing(int[] ans){
        int n= ans. length;
        int sum=0;
        int naturalSum=0;
        for(int i =0; i<n;i++){
            sum+= ans[i];
        }
        naturalSum= (n*(n+1))/2;
        int missingNumber= naturalSum- sum;
        
    }


    public static void main(String[] args) {
        int arr[]={1,5,3,2,6};
        Missing(arr);
    }
}
