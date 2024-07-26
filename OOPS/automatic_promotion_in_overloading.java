class Clac{
    public void show(byte n) {
        System.out.println("byte"+ n);
    }
    public void show(short n) {
        System.out.println("short"+ n);
    }
    public void show(int n) {
        System.out.println("int"+ n);
    }
    public void show(char n) {
        System.out.println("char"+ n);
    }
    public void show(double n) {
        System.out.println("double"+ n);
    }
    public void show(long n) {
        System.out.println("long"+ n);
    }
    public void show(float n) {
        System.out.println("float"+ n);
    }
}

public class automatic_promotion_in_overloading {
    public static void main(String[] args) {
        Clac obj=new Clac();
        byte b =2;
        obj.show(b);
    }
}

// if we pass the number like 2 then it will automatically go to int type as java has the default ype of int
//if remove the int then it will go to double
//if i specifically give the byte type in main method then it will go to byte type 
//but if i hide the byte but the variable type is byte the it will go to short type 
//byte->short->int->long->float->double
//char->int->long->float->double
//if i pass the character but removed the char then it will goes to int type and it will show the ASCII value of that character