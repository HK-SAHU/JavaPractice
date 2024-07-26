class Student{
    int age;
    String name;
    private String lastName;

    public void setData(){   //partial getter setter 
        lastName= "Sahu";
    }

    public void Show(){
        System.out.println(name+" "+ lastName+" "+age);
        System.out.println(lastName);   // null but can be accessed in that calss only
    }
}



public class Creation {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.name= "Harsh";
        obj.age= 21;
        obj.setData();
        // obj.lastName="Sahu";   // it is not visible in the other class
        obj.Show();
    }
}

// we can access the private data using getter and setter 

