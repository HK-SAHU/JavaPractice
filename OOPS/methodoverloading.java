/*class calc{
    public int add(int a, int b){
        int result = a+b;
        return result;
    }
}

public class methodoverloading {
    public static void main(String[] args) {
        calc obj=new calc();
        int result= obj.add(4,3);
        System.out.println(result);

    }
}*/


//method overloading 

class calc{
    public int add(int a, int b){
        int result = a+b;
        return result;
    }
    public int add(int a, int b,int c){
        int result = a+b+c;
        return result;
    }
    public double add(double a, double b){
        double result = a+b;
        return result;
    }
}

public class methodoverloading {
    public static void main(String[] args) {
        calc obj=new calc();
        int result= obj.add(4,3);
        int res1=obj.add(4,8,9);
        double res2= obj.add(4.5,8.9);
        System.out.println(result);
        System.out.println(res1);
        System.out.println(res2);

    }
}

// adding/ load more methods is known as method overloading 
//it will be hard to give different names to all the different methods
// decision is done by the parameters which we pass and it will automatically goes to right method and this decison will be done durng compile time.
//method should be different because the operations are different therefore names of method cam be same but the parameters should be different and operations should be different
//when type and method of overloading are different then only the 
// here the methods name are same but the parameters are different and the type of the parameters are different
