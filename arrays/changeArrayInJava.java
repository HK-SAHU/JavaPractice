public class changeArrayInJava {

    static void printArray(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    static void changeArray(int arr[]){
        for(int i=0; i<arr.length;i++){
            arr[i]=0;
        }
    }


    public static void main(String[] args) {
        int arr[]={1,2,3};

        changeArray(arr);
        printArray(arr);

        //array can go to heap that's why we get its address 
        //so for the change in the array we can say the address remains the same
        //but the refrence got copied

    }
}
