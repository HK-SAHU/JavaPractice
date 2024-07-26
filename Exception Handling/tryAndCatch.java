

public class tryAndCatch {
    public static void main(String[] args) {
        int num1=6;
        int num2= 2;
        int result=0;
        int[] nums= {1,2,3,4};
        String name=null;

        try{
            result= num1/name.length();
            System.out.println(nums[4]);
            System.out.println("in try block");
        }
        catch(ArithmeticException obj){
            System.out.println("division error: "+obj);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(nums[nums.length-1]);
        }

        catch(Exception e){
            System.out.println("something went wrong");
        }

        System.out.println(result);
        System.out.println("bye ");
    }    
}



/*
 * most accurate is writing the exact exception in the catch block 
 * like (ArithmeticExeception obj)
 * because ArithmeticExeception is the child of the RuntimeException and RuntimeException is the child of the Exception that's why the object of Exxception is still working
 * 
 * single try block can have multiple catch blocks 
 * 
 * 
 * imagine you as a developer writing the code but somewhere you don't know what exception can be throwned by the complier 
 * 
 * so to be at safer side after writing all the possible exception in catch block 
 * write the catch block with the (Exception obj)
 * as it can handle all kind of the exceptions
 * 
 */


