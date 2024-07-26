package twoDimArrays;

public class creation {
    static void printArray(int arr[][]){
        for(int i=0 ; i<3;i++){
            for(int j=0; j<3; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int [][] arr= new int [2][3];
        arr[0][0]=1;
        arr[0][1]=2;
        arr[0][2]=3;
        arr[1][0]=4;
        arr[1][1]=5;
        arr[1][2]=6;

        int[][] arr2= {{1,2,3},{4,5,6},{7,8,9}};

        printArray(arr2);
        System.out.println("second array");
        // printArray(arr);
        
    }
}
