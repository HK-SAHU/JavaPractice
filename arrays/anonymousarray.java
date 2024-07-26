/*public class Inneranonymousarray {
    public int add(int x, int y){
        int result= x+y;
        return result;
    }
}

public class anonymousarray {
    public static void main(String[] args) {
        calc obj = new calc();
        int result =obj.add(5,6);
        System.out.println(result);
    }
}*/


/*class calc{
    public int add(int num[]){
        int result = 0;
        for(int n:num){
            result= result+ n;
        }
        return result;
    }
}

public class anonymousarray {
    public static void main(String[] args) {
        calc obj = new calc();
        int num[]={1,2,3,4};
        int result =obj.add(num);
        System.out.println(result);
    }
}*/


class calc{
    public int add(int num[]){    //here we can give any name to the parameter
        int result = 0;
        for(int n:num){
            result= result+ n;
        }
        return result;
    }
}

public class anonymousarray {
    public static void main(String[] args) {
        calc obj = new calc();
        int result =obj.add(new int[]{5,6,7,8});  //creating an anonymous array
        System.out.println(result);
    }
}
