public class swapValues {
    static void swap(int a, int b){
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("a= "+ a + "and "+ "b= "+ b);

    }

    static void swapSumDiff(int a, int b){
        a=a+b;
        b= a-b;
        a=a-b;
        System.out.println("a= "+ a + "and "+ "b= "+ b);
    }

    public static void main(String[] args) {
        int a=10;
        int b= 20;
        swapSumDiff(a, b);
    }
}
