class Human{  
    int age;
    private String name;

    Human(){
        System.out.println("Human Constructor called");
    }
    void sleep(){
        age=18;
        System.out.println("Human need good sleep");
        System.out.println(age);
    }

}


class Student extends Human{ 

    // when we create the object of the class it create this default constructor which has super() keyword in it's first line
    // Student(){
    //     super();
    // }

    // even if we create the constructor theh also it calls the super() keyword by default
    Student(int num){
        System.out.println("num is "+ num);
        System.out.println("student constructor");
    }

    void disp(){
        System.out.println(age);
    }
}


public class moreOnInheritance {
    public static void main(String[] args) {
        Student st = new Student(28);
        st.sleep();
        st.disp();

        


        
    }
}


/*
 * 1. if the property is private then the property will not be inherited in the child class
 * 2. if we create the object of the child class in the main method then then it will create and call the deffault constructor which has super() method by default
 * 3. if we create the constructor in the child class(parametrized/ non parametrized ) it will still call the super() method 
 */
