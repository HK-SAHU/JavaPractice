

import java.util.Scanner;
import java.util.Stack;

public class ValidParanthesis {

    public  static boolean isValid(String str){
        Stack<Character> st= new Stack<>();

        for(char c: str.toCharArray()){
            if(c=='(' || c=='{' || c=='['){
                st.push(c);
                continue;
            }
            else if(st.isEmpty()) return false;
            else{ 
                char top= st.pop();
                if((c==')' && top!='(')||
                (c=='}' && top!='{')||
                (c==']' && top!='[')){
                    return false;
                }
            }
        }
        return st.isEmpty();

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the string: ");
        String str= sc.nextLine();

        System.out.println("is the given string is valid? "+ isValid(str));

    }
}
