class myException extends Exception{
    public myException(){

    }

    public myException(String msg){
        super(msg);
    }
}

public class CustomException {
    public static void main(String[] args) {
        int num1=8;
        int num2= -2;
        try{
            if(num2<0){
                Exception e= new myException("negative number");
                throw e;
            }
            else{
                int result= num1/num2;
                System.out.println(result);
            }
        }
        catch(Exception e){
            System.out.println("Enter a vlaid number"+e);
        }
    }
}
