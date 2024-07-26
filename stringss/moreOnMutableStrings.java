public class moreOnMutableStrings {
    public static void main(String[] args) {
///////////////////////////////// StringBuffer  Capacity ///////////////////////////////////////////////////////
        StringBuffer sb =new StringBuffer();
        // System.out.println(System.identityHashCode(sb));
        System.out.println(sb.capacity());
        sb.append("hello my name is");   
        System.out.println(sb.capacity());   //16
        sb.append("Harsh");
        System.out.println(sb.capacity());   //34

///////////////////////////////// StringBuilder capacity /////////////////////////////////////////////////////////

        StringBuilder sb1= new StringBuilder();
        System.out.println(sb1.capacity());  //16
        sb1.append("Hello my name is harsh");
        System.out.println(sb1.capacity());   // 34

/////////////////////  StringBuffer / StringBuilder string initailzie at starting ////////////////////////////////      

        StringBuffer sb2= new StringBuffer("Harsh");
        System.out.println(sb2.capacity());  //21   //when we initialize the string then capacity will become 16+number of character that we have initailized
        sb2.append("is my name and i am very");
        System.out.println(sb2.capacity());  //(21+1)*2=44   

////////////////////////////// Inbuilt Methods  /////////////////////////////////////////////////////////////////////////        
        System.out.println(sb2.charAt(1));
        sb2.setCharAt(1,'A');  // will set this character instead of the original character
        System.out.println(sb2);

//////////////////////////////// More On Capacity //////////////////////////////////////////////////////////////////

        StringBuffer sb3 = new StringBuffer(165);   // if we pass any number during initailization then it becomes it capacity
        System.out.println(sb3.capacity());
        sb3.append("Harsh");
        System.out.println(sb3);
        sb3.trimToSize();    // this will remove the unused space or 160 space will get removed
        System.out.println(sb3.capacity());
        System.out.println(sb3.reverse());
        System.out.println(sb3.replace(1, 5, "anuj"));

        
    }
}


// the initial capacity of the StringBuffer and StringBuilder class is 16
// if we assign more than 16 characters then it will create the new memory  -> (capacity+1)*2