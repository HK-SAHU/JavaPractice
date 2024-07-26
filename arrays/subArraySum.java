import java.util.Scanner;

public class subArraySum {
    static boolean prefixSuffixSum(int[] arr) {
        boolean flag = false;
        int n = arr.length;
        int sum = sumArray(arr);
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i] + arr[i - 1];
            int sufixSum = sum - arr[i];
            if (arr[i] == sufixSum) {
                return !false;
            }
        }
        return flag;
    }

    static int sumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = arr[i] + sum;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean ans = prefixSuffixSum(arr);
        System.out.println(ans);
    }
}
