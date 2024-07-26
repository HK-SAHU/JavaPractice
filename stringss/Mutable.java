public class Mutable {
    public static void main(String[] args) {
        StringBuffer sb= new StringBuffer("Harsh");
        StringBuilder sb1 = new StringBuilder("Anuj");
        System.out.println(sb);
        System.out.println(sb1);

        // StringBuffer sb2=""  // invlaid syntax
        // StringBuilder sb3=""  // invlaid syntax

        sb.append("Kumar Sahu");
        sb1.append("Sahu");
        System.out.println(sb1);
        System.out.println(sb);
    }    
}
