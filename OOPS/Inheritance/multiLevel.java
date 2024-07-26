class demo1{
    void disp(){
        System.out.println("Hi there!!");
    }
}

class demo2 extends demo1{

}

class demo3 extends demo2{

}

public class multiLevel {
    public static void main(String[] args) {
        demo3 d= new demo3();
        d.disp();
    }
}
