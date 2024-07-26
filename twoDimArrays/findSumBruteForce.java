package twoDimArrays;

import java.util.Scanner;

public class findSumBruteForce {
    static void takngInput(int arr[][], int m, int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }
    static int findSum(int[][] arr, int l1, int r1, int l2, int r2){
        int sum=0;
        for(int i=r1; i<=r2; i++){
            for(int j = l1; j<=l2;j++){
                sum+=arr[i][j];
            }
        }
        return sum;
    }
    


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col =sc.nextInt();
        int[][] ans = new int[row][col];
        takngInput(ans, row, col);
        int l1= sc.nextInt();
        int l2= sc.nextInt();
        int r1=sc.nextInt();
        int r2=sc.nextInt();
        int sum =findSum(ans, l1, r1, l2, r2);
        System.out.println(sum);

    }
}
