import java.util.HashMap;
import java.util.Map;

public class creation {
    public static void main(String[] args) {
        HashMap<Integer,String> hashmap= new HashMap<>();

        //functionality of the put function
        hashmap.put(1,"Harsh");
        hashmap.put(3,"Asha");
        hashmap.put(5,"Karan");
        hashmap.put(8,"Anuj");

        System.out.println("HashMap of the given data is:"+ hashmap);  //HashMap of the given data is:{1=Harsh, 3=Asha, 5=Karan, 8=Anuj}

        // functionality of the get() function
        String result = hashmap.get(3);
        System.out.println(result);  // Asha

        //functionality of a containsKey(function)
        System.out.println(hashmap.containsKey(2));  //false
        
        //functionality of the remove() function

        hashmap.remove(1);
        System.out.println("updated hashmap:"+hashmap);

        // functionality of the entrySet() function
        for(Map.Entry<Integer,String> e : hashmap.entrySet()){
            System.out.println(e.getKey()+":"+e.getValue());
        }
    }
}
