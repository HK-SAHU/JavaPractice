//initializing the array at time of creating the array

/*public class jaggedarray {
    public static void main(String[] args) {
        int a[][]={{1,2,3,4},{5,6},{7,8,9}};
        for(int i=0; i<=2;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }
    }
}*/


// creating the array first and then giving the values

public class jaggedarray{
    public static void main(String[] args) {
        int a[][]=new int[3][];   //no of columns are remained empty
        a[0]= new int[4];         //giving number of columns, row wise
        a[1]=new int[2];          //same
        a[2]=new int[3];          //same
        a[0][0]=1;                //assigning the values
        a[0][1]=2;
        a[0][2]=3;
        a[0][3]=4;
        a[1][0]=5;
        a[1][1]=6;
        a[2][0]=7;
        a[2][1]=8;
        a[2][2]=9;
        for(int i=0; i<=2;i++){        
            for(int j=0;j<a[i].length;j++){        // we used length function for the number of columns
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
