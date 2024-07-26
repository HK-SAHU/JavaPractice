package twoDimArrays;

public class matrixAddition {

    static void printArray(int arr[][]){
        for(int i=0 ; i<2;i++){
            for(int j=0; j<2; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        int[][] arr1 = { { 1, 2, }, { 3, 4 } };
        int[][] arr2 = { { 5, 6 }, { 7, 8 } };
        int[][] ans = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                ans[i][j]=arr1[i][j]+arr2[i][j];
            }
        }

        printArray(ans);
    }
}
