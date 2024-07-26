package twoDimArrays;

import java.util.Scanner;

public class findSumMethod2 {

    static void takngInput(int arr[][], int m, int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }

    static void prefixSum(int[][] matrix){
        int r=matrix.length;
        int c= matrix[0].length;
        for(int i=0; i<r; i++){
            for(int j=1; j<c;j++){
                matrix[i][j]+=matrix[i][j-1];
            }
        }

    }

    static int findSum2(int[][] matrix, int l1, int r1, int l2, int r2){
        int sum=0 ;
        prefixSum(matrix);
        for(int i=l1; i<=l2;i++){
            if(r1>=1)
                sum+=matrix[i][r2]- matrix[i][r1-1];
            else{
                sum+=matrix[i][r2];
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
        int sum =findSum2(ans, l1, r1, l2, r2);
        System.out.println(sum);
    }
}
