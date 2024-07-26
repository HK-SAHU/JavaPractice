
public class Copy {
    // eager way of creating singleton object

    private static Copy c= new Copy();
    
    public static Copy getCopy(){
        return c;
    }


}
