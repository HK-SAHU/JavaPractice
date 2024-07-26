public class prefixSum {
    static int[] sumArrayEle(int[] arr){
        int n=arr. length;
        int[] prefix= new int[n];
        prefix[0]=arr[0];
        for(int i=1; i<n; i++){
            prefix[i]=prefix[i-1]+arr[i];
        }

        return prefix;
    }

    static void printArray(int[] arr) {
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    public static void main(String[] args) {
        int[] arr={2,1,3,4,5};
        int[] prefix=sumArrayEle(arr);
        printArray(prefix);
    }
}
