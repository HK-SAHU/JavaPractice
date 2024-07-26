import java.util.Scanner;
public class area {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter area of biggest circle:");
        int r1=sc.nextInt();
        System.out.println("Enter area of the small circle:");
        int r2=sc.nextInt();
        double pie=3.18;
        double area1=pie*r1*r1;
        double area2= pie*r2*r2;
        double track=area1-area2;
        double result =track*500;
        System.out.println("cost will be:"+result);
    }
    
}
