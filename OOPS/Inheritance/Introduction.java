class Human{  //parent class/ Base class / Parent Class
    int age;
    void sleep(){
        age=18;
        System.out.println("Human need good sleep");
        System.out.println(age);
    }
}


class Student extends Human{ // child class / Derived Class / sub class   (here Student is a relation of Human)
    String name="harsh";
    void all(){
        System.out.println(name);
    }
}




public class Introduction {
    public static void main(String[] args) {
        Student st =new Student();
        st.sleep();
        Human hu = new Human();
        // hu.all();  // parent class cannot inherit the properties of the child class
    }
}
