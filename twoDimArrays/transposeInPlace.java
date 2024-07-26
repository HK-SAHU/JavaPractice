package twoDimArrays;

import java.util.Scanner;

public class transposeInPlace {
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

    static void transpose(int[][] arr, int m , int n){
        // int[][] ans= new int [n][m];
        for(int i=0; i<n; i++){
            for(int j=i;j<m;j++){
                int temp= arr[i][j];
                arr[i][j]= arr[j][i];
                arr[j][i]=temp;
            }
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n= sc.nextInt();
        int[][] arr= new int [m][n];
        takngInput(arr, m, n);
        transpose(arr, m, n);
        printArray(arr, m, n);
    }
}
