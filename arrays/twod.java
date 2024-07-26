// when we assign the value to arrys after the creation of an array

/*public class twod{
    public static void main(String[] args) {
        int a[][]=new int[3][2];
        a[0][0]=1;
        a[0][1]=2;
        a[1][0]=3;
        a[1][1]=4;
        a[2][0]=5;
        a[2][1]=6;   

        for(int i=0;i<=2;i++){     //for rows
            for (int j=0;j<=1;j++){     // for columns
                System.out.print(a[i][j] + " ");
            }
            System.out.println();   // to create new line after completion of every row
        }
    }
}*/



// assigning the  value of 2d array at the time of creation of the array

public class twod{
    public static void main(String[] args) {
        int a[][]= {{1,2},{3,4},{5,6}};
        for (int i=0; i<=2;i++){
            for (int j=0;j<=1;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}

