import java.util.Arrays;

public class checkSorted {


    static int[] kthMaxMinEle(int arr[], int k){
        Arrays.sort(arr);  //1 2 3 4 5 6
        int arrk[]={arr[k],arr[arr.length-k]};
        return arrk;
        // System.out.println(arrk);
    }

    static int[] maxMinEle(int arr[]){
        Arrays.sort(arr);
        // int smallestEle=arr[0];
        // int biggestEle=arr[arr.length-1];
        int arrEle[] = {arr[0],arr[arr.length-1]};
        return arrEle;
    }

    


    static boolean isSorted(int arr[]){
        boolean check=true;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                check= false; 
                break;
            }
        }
        return check;
    }


    public static void main(String[] args) {
        int arr[]={1,2,3,6,5,4};
        // System.out.println(isSorted(arr)); 
        // int[] ans = maxMinEle(arr); 
        // System.out.println(ans[0]+" "+ans[1]);   
        int ans[] =kthMaxMinEle(arr, 2);
        System.out.println(ans[0]+" "+ ans[1]);  

         
    }
}


// static methods can only access static variables
// static method can only call other static method
// static methods can't refer to non static variables or methods
