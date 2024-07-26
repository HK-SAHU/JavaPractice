class Student{
    private String name;
    private int age;

    public Student(){
        this("Rakesh",41);
        System.out.println("default constructor called");
        name="Harsh";
        age=21;
        // rakesh and 41 is not printed because we have updated the value by harsh and 21
    }

    public Student(String name){
        this();
        this.name= name;
        age=31;
    }

    public Student(String name, int age){
        System.out.println("hello");
        this.name=name;
        this.age=age;

    }

    public void disp(){
        System.out.println(name);
        System.out.println(age);
    }
}



public class thisVsSuperMethod {
    public static void main(String[] args) {
        Student obj1 = new Student();
        obj1.disp();
        Student obj2 = new Student("rohan");
        obj2.disp();
        Student obj3= new Student("Anuj", 20);
        obj3.disp();
    }
}
