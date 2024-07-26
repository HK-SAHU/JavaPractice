// function is working for the normal for loop 
//call by reference

import java.util.*;

public class arrayargument {
    public static void update(int marks[]){
        for(int i=0; i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String[] args) {
        int marks[]={97,98,99};
        update(marks);

        for (int i=0;i<marks.length;i++) {
            System.out.println(marks[i]+ " ");
        }
        System.out.println();
    }
}


//the function is not working for the foreach loop
/*import java.util.*;

public class arrayargument {
    public static void update(int marks[]){
        for(int n: marks){
            n=n+1;
        }
    }
    public static void main(String[] args) {
        int marks[]={97,98,99};
        update(marks);

        for (int i: marks) {
            System.out.print(i+ " ");
        }
        System.out.println();
    }
}*/
