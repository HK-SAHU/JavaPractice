class Student{
    private int age;
    private String name;
    public Student(){
        System.out.println("default constructor called");
        name="Harsh";
        age=21;
    }
    public Student(String name){
        this.name=name;
        age=21;
    }
    public Student(String name, int age){
        this.name=name;
        this.age=age;
    }
    public void disp(){
        System.out.println(name);
        System.out.println(age);
    }
}



public class constructorOverloading {
    public static void main(String[] args) {
        Student obj1 =new Student();
        obj1.disp();
        Student obj2 = new Student("Harshu");
        obj2.disp();
        Student obj3 = new Student("Anuj", 21);
        obj3.disp();
        
    }
}
