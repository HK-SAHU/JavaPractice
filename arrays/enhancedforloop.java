//2D array using enhanced for loop

/*public class enhancedforloop {
    public static void main(String[] args) {
        int a[][]={{1,2},{5,6},{7,8}};
        for(int n[]:a){
            for(int b: n){
                System.out.print(b +" ");
            }
            System.out.println();
        }
    }
}*/


//jagged array using enhanced for loop

/*public class enhancedforloop {
    public static void main(String[] args) {
        int a[][]={{1,2,3,4},{5,6},{7,8,9}};
        for(int n[]:a){
            for(int b: n){
                System.out.print(b +" ");
            }
            System.out.println();
        }
    }
}*/


//normal array using enhanced for loop

/*public class enhancedforloop {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        for(int n:a){
                System.out.print(n +" ");
        }
    }
}*/


//creating the normal array and giving the values after initializing the array
//using the enhanced for loop

/*public class enhancedforloop {
    public static void main(String[] args) {
        int a[]=new int[4];
        a[0]=1;
        a[1]=2;
        a[2]=3;
        a[3]=4;
        for(int n:a){
                System.out.print(n +" ");
        }
    }
}*/

//creating the 2D array and giving the values after initializing the array
//using the enhanced for loop
/*public class enhancedforloop {
    public static void main(String[] args) {
        int a[][]=new int[3][2];
        a[0][0]=1;
        a[0][1]=2;
        a[1][0]=3;
        a[1][1]=4;
        a[2][0]=5;
        a[2][1]=6;
        for(int n[]:a){
            for(int b:n){
                System.out.print(b +" ");
            }
            System.out.println();
        }
    }
}*/

//creating the 2D jagged array and giving the values after initializing the array
//using the enhanced for loop

public class enhancedforloop {
    public static void main(String[] args) {
        int a[][]=new int[3][];
        a[0]=new int[4];         //giving number of columns (row wise)
        a[1]=new int[2];          //same
        a[2]=new int[3];          //same
        a[0][0]=1;                //assigning the values indexwise
        a[0][1]=2;
        a[0][2]=3;
        a[0][3]=4;
        a[1][0]=5;
        a[1][1]=6;
        a[2][0]=7;
        a[2][1]=8;
        a[2][2]=9;
        for(int n[]:a){
            for(int b:n){
                System.out.print(b +" ");
            }
            System.out.println();
        }
    }
}
