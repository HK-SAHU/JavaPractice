public class searchEle {
    void searchele(int arr[], int value) {
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                ans=i;  
            }
        }
        System.out.println("found " + value + "at" + ans);

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        searchEle obj = new searchEle();
        obj.searchele(arr, 5);

    }
}
