package twoDimArrays;

import java.util.Scanner;

public class findSumMethod3 {

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
        // traversing horizontally to calculate row-wise prefix sum
        for(int i=0; i<r; i++){
            for(int j=1; j<c;j++){
                matrix[i][j]+=matrix[i][j-1];
            }
        }

        // traversing vertically to calculate column- wise prefix sum
        for (int j=0; j<c;j++){
            for(int i=1 ; i<r; i++){
                matrix[i][j]+=matrix[i-1][j];
            }
        }
    }

    static int findSum3(int[][] matrix, int l1, int r1, int l2, int r2){
        int ans=0;
        int up=0; int left=0; int leftUp=0; int sum=0;
        prefixSum(matrix);

        sum = matrix[l2][r2];
        if(l1>=1)
            up= matrix[l1-1][r2];
        if(r1>=1)
            left= matrix[l2][r1-1];
        if(l1>=1 && r1>=1)
            leftUp= matrix[l1-1][r1-1];

        ans= sum- up- left+ leftUp;
        return ans;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col =sc.nextInt();
        int[][] ans = new int[row][col];
        takngInput(ans, row, col);
        int l1= sc.nextInt();
        int r1=sc.nextInt();
        int l2= sc.nextInt();
        int r2=sc.nextInt();
        int sum =findSum3(ans, l1, r1, l2, r2);
        System.out.println(sum);
    }
    
}
