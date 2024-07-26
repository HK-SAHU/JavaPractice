class types{
    public static void main(String[] args) {
        byte students = 5;
        short age= 15;
        int number=123456;
        long address= 789456123l;  // we use l as suffix in long datatype

        System.out.println(students);
        System.out.println(age);
        System.out.println(number);
        System.out.println(address);

        float info=45.5f;  // f as suffix for float datatype
        System.out.println(info);

        double data=45.5;
        System.out.println(data); // by default real number is double datatype

        char a='A';   // single quotes will be used and one character at a time
        System.out.println(a);

        char b=97;  //given UTF number (ASCII value)
        System.out.println(b);
    }
}