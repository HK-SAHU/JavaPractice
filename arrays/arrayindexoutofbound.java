public class arrayindexoutofbound{
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        System.out.println(arr[4]);  //array is in heap memory and the size of heap meory is fixed that's why it is showing an error
    }
}

//the moment it show the exeception then it will not print anything after it 
