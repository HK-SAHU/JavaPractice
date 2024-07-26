class Demo{
    public void a()throws ArithmeticException, Exception{
        // try{
        //     b();
        // }
        b();        // Unhandled exception type Exception

        // catch(Exception e){
        //     System.out.println("error"+e);
        // }


        // method a can also further said i am not going to handle this exception
        // the who called me will handle it

    }

    public void b() throws ArithmeticException, Exception{
        int num1=8;
        int num2=0;
        

        // we can do try catch here also
        // try{
        //     int result= num1/num2;
        // }
        // catch(ArithmeticException e){
        //     System.out.println("error"+ e.getMessage());
        // }


        // but we want that the method which calls the method b should handle this 
        // so we will write "throws <ExceptionName>" aftter method name declaration
        // we can write multiple exception using commas like throws Exception, ArithmeticException

        int result= num1/num2;
        System.out.println(result);
    }
}


public class HandlingVsDucking {
    public static void main(String[] args) {
        Demo obj = new Demo();
        // obj.a();   //Unhandled exception type Exception

        try{
            obj.a();
        }
        catch(Exception e){
            System.out.println("error"+e);
        }

        // now it like main method can also say that i am not going to handle this exception
        // the one who called me should handle this (JVM) 
        // as a developer we shouldn't do it 

    }
}


/*
 * why we do it, means we are not solving critical statement in same method but asking another method to handle it
 * because suppose method a and b are throwing same error then they can be handle at a sigle place to reduce line of code
 * 
 */
