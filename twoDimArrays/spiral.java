

import java.util.Scanner;

public class spiral {
    static void takngInput(int arr[][], int m, int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }
    static void printArray(int m[][]) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void printSpiral(int[][] matrix, int r, int c){
        int topRow=0; int bottomRow=r-1; int rightCol=c-1; int leftCol=0;
        int totalEle=0;
        while(totalEle<r*c){
            //topRow -> leftCol to rightCol
            for(int j = leftCol; j<=rightCol && totalEle<r*c;j++){
                System.out.println(matrix[topRow][j]+" ");
                totalEle++;
            }
            topRow++;

            //rightCol -> topRow to bottomRow 
            for(int i = topRow; i<=bottomRow && totalEle<r*c;i++){
                System.out.println(matrix[i][rightCol]+" ");
                totalEle++;
            }
            rightCol--;

            //bottomRow -> rightCol to leftCol
            for(int j = rightCol; j>=leftCol && totalEle<r*c;j--){
                System.out.println(matrix[bottomRow][j]+" ");
                totalEle++;
            }
            bottomRow--;
            
            //leftCol -> bottomRow to topRow
            for(int i = bottomRow; i>=topRow && totalEle<r*c;i--){
                System.out.println(matrix[i][leftCol]+" ");
                totalEle++;
            }
            leftCol++;
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m= sc.nextInt();
        int n= sc.nextInt();
        int ans[][]= new int[m][n];
        takngInput(ans, m, n);
        printSpiral(ans, m, n); 
        // printArray(ans);
    }
}
