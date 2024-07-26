public class GettersAndSetters {
    public static void main(String[] args) {
        Student obj= new Student();
        obj.setAge(18);
        int age= obj.getAge();
        System.out.println(age);
        obj.setName("Harsh");
        String name= obj.getName();
        System.out.println(name);
    }
}



class Student{
    int age;
    String name;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
}



/*
 * another method to create getters and setters is 
 * right click -> source action -> generate getters and setters  -> ccheck the variables of which you want getters and setters
 * and boom you the getters and setters
 */
