import java.util.Scanner;

public class sumInRange {
    static int[] querySum(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];   // +1 is for the 0 index which has zero value and the actual array is starting from the 1st index
        for(int i =1; i<=n;i++){    
            arr[i]=sc.nextInt();
        }

        int[] ans= querySum(arr);
        // printArray(arr);
        int q = sc.nextInt();
        while (q-- > 0) {
            System.out.println("Enter the range: ");
            int l = sc.nextInt();
            int r = sc.nextInt();

            int sum = ans[r]- ans[l-1];    // -1 is for the range -> 3 to 5 we are subtracting 2 therefore we are subtracting -1 from l
            System.out.println(sum);
        }
    }
}
