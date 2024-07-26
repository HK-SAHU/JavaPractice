public class RethrowingException {
    public static void main(String[] args) {
        int num1=6;
        int num2=-2;
        try{
            if(num2<0){
                // Exception e= new Exception();

                Exception e= new ArithmeticException("negative number");  // we can pass the string to constructor 
                // as the Aritmetic class have two constructors one is not taking any parameter and other one is taking string
                throw e;
            }
            else{
                int result= num1/num2;
                System.out.println(result);
            }
        }
        catch(Exception e){
            System.out.println("enter a valid number "+e);  //Unhandled exception type Exception 
            // it will give the error of Exception class because we have created the object of the Exception class
            
        }
    }
}
