import java.util.InputMismatchException;
import java.util.Scanner;

public class finallyBlock {
    public static void main(String[] args) {
        int num=0;
        
        //try with resource
        try(Scanner sc= new Scanner(System.in)){
            num= sc.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println("enter a number");
        }
        // finally{
        //     sc.close();
        // }
        System.out.println(num);
    }
}



/*
 * here we are using a resource that is scanner class using system for input
 * so we use finally block which means that we it will definitely going to run 
 * you may think that we can write the sc.close() in try and catch block but it will break DRY rule 
 * 
 * 
 * but java new version supports try with resource which will use and close the resource automatically
 * 
 */