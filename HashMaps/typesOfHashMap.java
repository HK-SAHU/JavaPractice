import java.util.HashMap;
import java.util.LinkedHashMap;

public class typesOfHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> Map= new HashMap<>();
        Map.put(1,"Harsh");
        Map.put(4,"Anuj");
        Map.put(2,"Anjali");
        Map.put(3,"Anju");

        System.out.println(Map);  // this will make the ouput to display in the ordered format(keys)


        LinkedHashMap<Integer, String>  Map1 = new LinkedHashMap<>();
        Map1.put(1,"Harsh");
        Map1.put(4,"Anuj");
        Map1.put(2,"Anjali");
        Map1.put(3,"Anju");

        System.out.println(Map1);    // order of insertion is preserved (it will give the output in the way we entered the entries)


        TreeMap<Integer, String> Map2 = new TreeMap<>();
        Map2.put(1,"Harsh");
        Map2.put(4,"Anuj");
        Map2.put(2,"Anjali");
        Map2.put(3,"Anju");

        System.out.println(Map2);   // this will return the output in the key ordered format
    }
}
