public class wrapperClass {

    // wrapper calss is used so that we can create the full object oriented program/ code by the use of refrence variable using objects
    // converting the primitive to object (BOXING)
    
    public static void main(String[] args) {
        Integer i =new Integer (10);
        short s =new Short ((short) 10);
        Byte b =new Byte((byte)5);
        Long L =new Long (10L);
        Float F =new Float (10f);
        Double D =new Double (10);
        Character C =new Character('a');
        Boolean B = new Boolean(true);

        // this method of using constructor is now deprecated from JDK 9.0

        // we have alternatice for this which is valueOf()


        int a=10;
        Integer In= Integer.valueOf(a);
        Short Sh=Short.valueOf((short)a);
        Byte by =Byte.valueOf((byte)5);
        Long Lo =Long.valueOf(a);
        Float Fo =Float.valueOf(a);
        Double Do =Double.valueOf(a);
        Character Ch =Character.valueOf('a');
        Boolean Bo = Boolean.valueOf(true);


        //AutoBoxing OR ANOTHER SHORT MEHTOD OF BOXING

        int Ran=20;
        Integer dom=Ran; // IMPORTANT  NO NEED TO WRITE .valueOF()
        System.out.println(dom);

    }
}
