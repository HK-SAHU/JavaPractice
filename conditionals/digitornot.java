import java.util.*;

import javax.xml.transform.Source;
public class digitornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digit:");
        char ch = sc.next().charAt(0);
        if (ch>='0' && ch<='9'){
            System.out.println("input is digit");
        }
        else{
            System.out.println("input is not digit");
        }
    }
    
}
