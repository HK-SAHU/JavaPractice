class Student{
    private int age;
    private int marks;
    public Student(int age, int marks){
        this.age=age;
        this.marks=marks;

    }

    public Student(){
        System.out.println("called");
    }

    void disp(){
        System.out.println(age);
        System.out.println(marks);
    }
    
}


public class moreAboutConstructors {
    public static void main(String[] args) {
        Student obj = new Student(); //default constructor is called but is not parametrized and also hidden

        /*
         * obj 2 was parametrized of the same class thereffore we need to make the constructor with no parameters
         * and no default constructor will be made
         */

        Student obj2 =new Student(21, 100);   

        obj2.disp();

        /*
         * as soon as we have created a paramterized constructor the defalt consturcor will never be made and we have to make a non
         * parametrized constructor in that class
         */
    }
}

/*
 * default constructor is only called when it is not parametrized 
 * if we want to give the parameters then we have to make constructor of that class and pass the parameters
 */
