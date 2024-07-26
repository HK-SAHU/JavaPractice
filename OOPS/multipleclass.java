class student{
    int age =10;
    String name;

}

// a file can have only one public class 
public class multipleclass {
    public static void main(String[] args) {
        student obj = new student();
        System.out.println(obj.age);
        System.out.println(obj.name);
        student obj2 = obj;   // obj 2 is a copy object and student is a datatype of that object
        obj.age=1;
        obj.name="harsh";
        System.out.println(obj2.name);
        System.out.println(obj2.age);


    }
    
}

