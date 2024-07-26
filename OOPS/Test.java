class Test {   //not necessary to give exact name as file
    int a;
    String name;
    public static void main(String[] args) {
        //declare the variable outside the main function
        //create the object in the main class
        int num =9;
        Test obj1 =new Test();     //obj is known as refrence variable not object 
        Test obj2=obj1;           // copy object
        obj1.name="hello";
        System.out.println(obj1.name);
        System.out.println(obj1.a);

        System.out.println(obj2.name);
        System.out.println(obj2.a);

    }
}
 