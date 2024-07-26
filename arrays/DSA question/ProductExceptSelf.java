//brute force

public class ProductExceptSelf {

    static int[] product(int[] arr){
        int mul=1;
        int n= arr.length;
        int ans[] =new int[n];
        for(int i=0; i <n;i++){
            for(int j=0;j<n;j++){
                if(i==j) continue;
                mul*=arr[i];
            }
            ans[i]= mul;
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int ans[]= product(arr);
        for(int i: ans){
            System.out.println(i);
        }
    }
}
