package twoDimArrays;

import java.util.Scanner;


public class printSprialMatrix {

    static void printArray(int arr[][], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int[][] sprialMatrix(int n){
        int[][] ans =new int[n][n];
        int topRow=0; int bottomRow= n-1; int leftCol= 0; int rightCol= n-1;
        int curr=0;
        while(curr<=n*n){
            for(int j =leftCol; j<= rightCol && curr<n*n;j++){
                curr++;
                ans[topRow][j]=curr;
            }
            topRow++;
            for(int i= topRow; i<=bottomRow && curr <n*n;i++){
                curr++;
                ans[i][rightCol]=curr;
            }
            rightCol--;
            for(int j=rightCol; j>=leftCol && curr<n*n;j--){
                curr++;
                ans[bottomRow][j]=curr;
            }
            bottomRow--;
            for(int i=bottomRow; i>= topRow && curr<n*n; i--){
                curr++;
                ans[i][leftCol]=curr;

            }
            leftCol++;
        }


        return ans;
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans[][]= sprialMatrix(n);
        printArray(ans, n);
    }
}
