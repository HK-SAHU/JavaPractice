package elseif.swtichcase;
import java.io.OutputStream;
import java.util.Scanner;

import javax.xml.transform.Source;
public class weekdays {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter week day:");
        int day= sc.nextInt();
        switch(day){
            case 1: System.out.println("Monday");
            break;
            case 2: System.out.println("Tuesday");
            break;
            case 3: System.out.println("Wednesday");
            break;
            case 4: System.out.println("Thursday");
            break;
            case 5: System.out.println("Friday");
            break;
            case 6: System.out.println("Saturday");
            break;
            case 7: System.out.println("Sunday");
            break;
        }
    }
}
