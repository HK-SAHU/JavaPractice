public class inbuiltMethods {
    public static void main(String[] args) {
        String str="Hello bhai";
        String gtr ="Dello";
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.length());
        System.out.println(str.charAt(4));
        System.out.println(str.substring(1,4));
        System.out.println(str.indexOf("H"));
        System.out.println(str.lastIndexOf("l"));
        System.out.println(str.compareTo(gtr));  //4
        System.out.println(str.contains("ll"));
        System.out.println(str.startsWith("H"));
        System.out.println(str.endsWith("o"));
        str.join(" ", null)
        // System.out.println(str.charAt());

        char[] ch = str.toCharArray();
        System.out.println(System.identityHashCode(ch));
        System.out.println(System.identityHashCode(str));
        System.out.println(str.trim());   // removes the starting space and ending space
        System.out.println(str.length());

        StringBuilder sb =new StringBuilder(str).reverse();
        System.out.println(sb);
    }
}


/*
 * .compareTo();
 * in this function the two strings will be comapared lexographically(h>d) and the first alphabet which is different will get compared and the answer will be according to:-
 * 
 * if str> gtr positive number (by how many alphabet it is greater like H>D by 4 alphabet)
 * 
 * if str < gtr then negative number (by how many alphbet it is smaller)
 * 
 * if str == gtr then 0
 */
