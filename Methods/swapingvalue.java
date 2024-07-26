/*import java.util.Scanner;

public class swapingvalue {
    public static void swap(int a, int b) {
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a is= "+a);
        System.out.println("b is= "+b);
        //changes made in function will remain in funtion, it will not reflect in main function
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        swap(a,b);

    }
    
}*/

import java.util.Scanner;

public class swapingvalue {
    public static void swap(int a, int b) {
        int temp=a;
        a=b;
        b=temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        swap(a,b);
        System.out.println("a is= "+a);
        System.out.println("b is= "+b);
        //changes made in function will remain in fuction only, it will not reflect in main functioon and it will take the original vlaues2

    }
    
}
