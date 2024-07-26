import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckedVsUnchecked {
    public static void main(String[] args) {
        // unchecked exception-  where compiler is not forcing us to handle the exception 
        int result= 7/0;   // this will throw and exception on runtime
        
        
        //checked exception  - where compiler is forcing us to handle it before execution (throwing an exception in compile time)
        // we can handle it using throws IOException and try catch
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        // string str1= br.readLine();
        try {
            String str= br.readLine();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
