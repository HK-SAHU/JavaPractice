import java.util.Scanner;
import java.util.Arrays;

public class copiedaArray {
    static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        

        // int arr2[]=arr;   //copying an array
        //only refrence gets copied here not the array 
        //therefore the the change in the copied array will change the orginal array also
        // this is also known as shallow copy

        // int arr2[]=arr.clone();  //deep copy

        // int arr2[]=Arrays.copyOf(arr, arr.length);   //2nd parameter is for how much length we want the copy

        // int arr2[]=Arrays.copyOf(arr, 2); //only two elements will get copied in this

        // int arr2[]=Arrays.copyOfRange(arr, 0, 3);  //copied in the range

        arr2[0]=0;
        arr2[1]=1;

        System.out.println("original array");
        printArray(arr);

        System.out.println("copied array");
        printArray(arr2);

        //////////////////////////////////////////////////// shallow copy ////////////////////////////////////////////////////////////////////
        // after changing the value in the copied array we have seen that the original array has also been changed
        // although the variables of the arrays are different but the address to which they are referring to is same which is in the heap memory
        //that's why it changed the original value also
        //this is also known as shallow copy

///////////////////////////////////////////////////// deep copy /////////////////////////////////////////////////////////////////////////////
        //.clone creates the deep copy of the array therefore the original array will remains the same but not the copied one
        //in short .clone will create the new array in the heap that too with the different address


/////////////////////////////////////// java util class  ////////////////////////////////////////////////////////////////////////////////////
        // we have few methods in util class, one of them is Arrays.copyOf(<array name for copy>,<length we want to copy>)
        //we saw that the original array remained the same but the copied array got changed


///////////////////////////////////////////////// copy of range ////////////////////////////////////////////////////////////////////////////
        //other method is Arrays.copyOfRange(<original array>, <starting index>, <exclusive index>) 

    }
}
