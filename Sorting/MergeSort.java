import java.util.Scanner;

public class MergeSort{

    public static void mergeSort(int[] arr, int start, int end){
        int mid= (start+end)/2;
        if(start>=end){
            return;
        }

        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, end);
        merge(arr,start, mid,end);
    }

    public static void merge(int[] arr, int start, int mid, int end){
        int n1= mid-start+1;
        int n2= end-mid;
        int[] left= new int[n1];
        int[] right = new int[n2];

        

        for(int i=0; i<n1;i++){
            left[i]=arr[start+i];   //here the start is refreing to the point from where we have to start and start is not changing 
        }

        for(int j=0;j<n2;j++){
            right[j]= arr[mid+1+j];     // here also mid is not changing it is telling us the point tfrom where we have to fill the elements 
        }


        int i=0,j=0,k=start;

        while(i<n1 && j<n2){
            if(left[i] <= right[j]){    //<= to make it stable algo
                arr[k++]=left[i++];
            }
            else{
                arr[k++]= right[j++];
            }
        }
        while(i<n1){
            arr[k++]=left[i++];
        }
        while(j<n2){
            arr[k++]=right[j++];
        }


    }

    public static void disp(int[] arr){
        for(int val:arr){
            System.out.print(val+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("array before sorting");
        disp(arr);
        mergeSort(arr, 0, n-1);
        System.out.println("sorted array");
        disp(arr);

    }
}

// diveide and conquer algorithm

/*
 * divide the array into two equla half 
 * sorting the 2 subarrays seprately using recursion
 * now we have two sorted arrays
 * now we want to merge the two sorted arrays
 */