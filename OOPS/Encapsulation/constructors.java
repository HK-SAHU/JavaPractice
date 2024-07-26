class Student{
    private int age;
    private String Name;
    /////////////////////////  Constructor ///////////////////////////////////
    Student(int age, String Name){
        this.age=age;
        this.Name=Name;
    }

    /*
     * constructor have same name like of Class with ()
     * it can have access specifier like public, private etc
     * we can directly pass the value to the construtors and as above the constructor will assign the value
     */

    //////////////////////////////////////////////////////////////////////////

    public int getAge() {
        return age;
    }
    // public void setAge(int age) {
    //     this.age = age;
    // }
    public String getName() {
        return Name;
    }
    // public void setName(String name) {
    //     Name = name;
    // }

    
}

public class constructors {
    public static void main(String[] args) {
        Student obj= new Student(21,"Harsh");
        // obj.setAge(21);
        int age=obj.getAge();
        System.out.println(age);
        // obj.setName("Harsh");
        String name=obj.getName();
        System.out.println(name);
    }
}


/*
 * in constructor we can give the vlaues to the instance variable
 * i.e. we can pass the values during the object creation like Student obj = new Student(21,"Harsh")
 * therefore we don't need setters
 * 
 */
