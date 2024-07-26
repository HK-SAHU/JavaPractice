class Student {
    private int age;
    private String Name;
    private String lastName;
    public Object setData2;

    public void setData1(int age) {
        this.age = age;  // local varibale >> instance variable  (SHADOWING PROBLEM)
    }

    public void setData4(int a){
        age=a;
    }

    public String setData2() {
        Name = "Harsh";
        return Name;
    }

    public void setData3(String lastName) {
        this.lastName = lastName;
    }

    public void show() {
        System.out.println(Name + " " + lastName + " " + age);   //all these are instance variable
    }

}

public class thisKeyword {
    public static void main(String[] args) {

        Student obj = new Student();
        Student obj1 = new Student();
///////////////////// removing shadow probblem  this keyword ///////////////////////////////
        // obj.setData1(18);   //still the value will be null because local variable > instance variable
        // obj1.setData1(25);
////////////////////// setData4 will show shadow problem /////////////////////////////////
        // obj.setData4(18);     // this will work as we are not giving the same variable name as the instance variable
        // obj1.setData4(25);
////////////////////////////// calling setData3() method using object and printing it using show() method
        // obj.setData3("Harsh");
        // obj1.setData3("Anuj");
        ////////////////////////////// to print the vlaue in setData2 method/////////////////////
        // String name=obj.setData2();
        // System.out.println(name);
        //////////////////////////// calling show() method using object /////////////////////////

        // obj1.show();
        // obj.show();
    }
}
