// class ke instance variable ke jab hum object banate hai toh toh har object class ki copy banata hai 

// par static variable mien esa nhi hota hai, usme class ki ek hi copy hoti hai 



public class staticmethod {
     static  void welcome(){
        System.out.println("hello everyone");
     }

     public static void main(String[] args) {
        welcome();
     }
}

//agar static keyword nhi hota toh hume main class ka object banana padhta tab hum welcome method ko call kar pate 

// par static keyword ki wajah se hum directly call kar sakte hai