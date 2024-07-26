public class jalebi{
    private static jalebi j;    // only one object has been created here
    private jalebi(){
        //constructor
    }


    // this function cannot stop making the single object as we can call thei function many times
    // and every time it will give us the different obejct
    
    // public static jalebi getJabelbi(){
    //     jalebi j= new jalebi();
    //     return j;
    // }


    //lazy way of creating object
    public static jalebi getJabelbi(){
        if(j==null){// will execute on one time, initailly j will be null but after object creation it will not be null
            j= new jalebi();
        }
        return j;
    }
}

