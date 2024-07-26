package twoDimArrays;

import java.util.Scanner;

public class transposeOfMatrix {
    static void takngInput(int arr[][], int m, int n){
        Scanner sc = new Scanner(System.in);
        for(int i=0 ;i<m;i++){
            for(int j =0 ; j<n;j++){
                arr[i][j]= sc.nextInt();
            }
        }
    }

    static void printArray(int arr[][],int m,int n){
        for(int i=0 ; i<m;i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static int[][] transpose(int[][] arr, int m , int n){
        int[][] ans= new int [n][m];
        for(int i=0; i<m; i++){
            for(int j=0;j<n;j++){
                ans[i][j]=arr[j][i];

            }
        }
        return ans;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n= sc.nextInt();
        int[][] arr= new int [m][n];
        takngInput(arr, m, n);
        int[][] ans= transpose(arr, m, n);
        printArray(ans, m, n);
    }
}
