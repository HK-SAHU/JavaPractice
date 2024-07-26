import java.util.HashMap;

public class removeDuplicates {
    static void removeDuplicate(int[] arr, int n){
        HashMap<Integer, Boolean> hm= new HashMap<>();
        for(int i=0;i<n;i++){
            if(hm.get(arr[i])==null){
                System.out.println(arr[i]+" ");
            }
                hm.put(arr[i], true);
        }
    }
    public static void main(String[] args) {
        
        int[] arr={1,3,2,2,3,1,6,2,5};
        int size= arr.length;
        removeDuplicate(arr, size);
        
    }
    
}
