import java.util.*;;
public class frequnecyArray {
    static int[] traverse(int[] arr){
    int[] ans= new int[100005];
    for(int i=0; i<arr.length;i++){
        ans[arr[i]]++;  //to increase the count of the ffrequnct by one in the frequency array 
    }
    return ans;
}



    public static void main(String[] args) {  
        int[] arr= {5,34,400,10000,560};
        int[] freq=traverse(arr);
        System.out.println("Enter the number of queries: ");
        Scanner sc = new Scanner(System.in);
         // wrapper class
        int q = sc.nextInt();
        Integer i = Integer.valueOf(q);
        while(i>0){
            System.out.println("Enter the number to be searched: ");
            int x= sc.nextInt();
            if(freq[x]>0){
                System.out.println("yes");
            }
            else{
                System.out.println("No");
            }
            q--;
        }
    }
}
