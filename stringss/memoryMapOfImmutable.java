

public class memoryMapOfImmutable {
    public static void main(String[] args) {
        String s1="pw";
        String s2="pw";

        System.out.println("The memory address is " + System.identityHashCode(s1));
        System.out.println("The memory address is " + System.identityHashCode(s2));

        System.out.println(s1==s2);  // true

        String str1 = new String("pw");
        String str2 = new String("pw");

        System.out.println("The memory address is " + System.identityHashCode(str1));
        System.out.println("The memory address is " + System.identityHashCode(str2));

        System.out.println(str1==str2);   //false
    }
}


// String object without the new keyword will be made under heap memory and under the heap memory it will be made in String Constant Pool (SCP)

// String with the new keyword will be made under normal Heap memory

// If the string object is created under SCP then duplicates are not allowed. therefore the s1 and s2 will point at the same string object

// if the string object is created under noraml heap memory then the duplicates are allowed. therefore the str1 and str2 will have different string object

// Even though the str1 and str2 are created in the normal heap area, still the SCP will have the copy of the string object(string) which cannot be accessed by any of the variable

//object which are under SCP are not collected by the garbage collector

// (==) is to compare the refrence variable i.e address of the variable // returns the boolean value
