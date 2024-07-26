import java.util.Scanner;

public class PascalsTriangle {
    static void printArray(int m[][]) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] pascal(int n){
        int[][] ans = new int[n][];
        for(int i=0; i<n;i++){
            ans[i]= new int[i+1];   // intializing the columns with the help of the rows (0th row has 1 column, 1st row has 2 columns etc)
            ans[i][0]=ans[i][i]=1;
            for(int j =1;j<i ;j++){  // 0 and ith row has already 1
                ans[i][j]= ans [i-1][j-1]+  ans[i-1][j];
            }
        }
        return ans;
    }
    


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int ans[][]=pascal(n);
        printArray(ans);
    }
}