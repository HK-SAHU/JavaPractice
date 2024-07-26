package twoDimArrays;

import java.util.*;

public class matrixMultiplication {
    static void takngInput(int arr[][], int m, int n){
        Scanner sc = new Scanner(System.in);
        for(int i=0 ;i<m;i++){
            for(int j =0 ; j<n;j++){
                arr[i][j]= sc.nextInt();
            }
        }
    }

    static void printArray(int arr[][],int m,int c){
        for(int i=0 ; i<m;i++){
            for(int j=0; j<c; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    static void multiplication(int arr1[][], int arr2[][], int m ,int n, int r, int c){
        if (m!=c){
            System.out.println("not possible");
            return;
        }
        int[][] ans = new int[m][c];

        for(int i=0 ; i<m;i++){
            for(int j =0 ; j<c;j++){
                for(int k =0; k<n;k++){
                    ans[i][j]+=arr1[i][k]*arr2[k][j];
                }
            }
        }

        printArray(ans, m, c);


    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("first array");
        int m= sc.nextInt();
        int n = sc. nextInt();
        int[][] arr1 = new int [m][n];
        takngInput(arr1, m, n);
        System.out.println("second array");
        int r = sc.nextInt();
        int c= sc. nextInt();
        int [][] arr2= new int[r][c];
        takngInput(arr2, r, c);
        multiplication(arr1, arr2, m,n,r, c);
        

    }
}
