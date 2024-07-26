public class Concatenation {
    

    public static void main(String[] args) {
        
        String s1= "pw";
        String s2 = new String("PW");

        System.out.println(s1);   // is still referring to the original object

        System.out.println(s1.concat("skills"));  // we are directly printing the unreferred object 
        System.out.println(s2.concat("SKILLS"));  // we are directly printing the unreferred object 

        s1=s1.concat(" Hello");  //pw hello
        System.out.println(s1);   // now we have changed the refrence object to the new object i.e. s1 is now pointing towards the "pw hello" object instead of "pw" (String )

        s2 = s1.concat(" Harsh");
        System.out.println(s2);

//////////////////////////////////// memorymap ///////////////////////////////////////////////////////////////////////

        String str1 = "pw";  //SCP

        String str2 = str1.concat("skills");  // it will be created under normal heap area because when we use any inbuilt method then the object is created under normal heap area

        System.out.println(str2);    //pwskills

        String str3 = new String("Harsh");
        str3 = str3.concat("Sahu");   //Harsh Sahu

        System.out.println(str3);   // string to immutable thi paar humne naya object bana diya hai to ab str3 uss naye object ki taraf poin kar rha hai. humne object(string) ko nhi change kiya hai sirf refrence object ko change ki hai


///////////////////////////////////////////////////////// + operator ////////////////////////////////////////////////////

        String first = "Harsh";   //SCP
        String Sec = "Harsh" + "Kumar";   //SCP
        String third = "Harsh"+ "Kumar"+ "Sahu";    //SCP
        String Fourth = first + Sec + third;    // normal heap because we are using refrence object to create the string  and the copy of this string which is not refrred by any variable will also be created at the SCP

        System.out.println(first);
        System.out.println(Sec);
        System.out.println(third);
        System.out.println(Fourth);

        String fifth  = "pw" +100+ 99;   //"pw"  -> "pw100"   ->  "pw10099"   integer are not getting add up but they are getting concatenated in string  (only possible in + operator)
        System.out.println(fifth);

        
    }
}

// if we use inbuilt method/ refrence then the str2 will be created  under noraml heap
