//to create the array

/*public class arraycreation{
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        System.out.println(a[0]);
    }
}*/



// to print the each vlaue of the array 
/*public class arraycreation{
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        for (int i=0;i<=4;i++){
            System.out.println(i);
        }
    }
}*/


//another way to create an array when we don't know the elements but we know the numbers of elements

public class arraycreation{
    public static void main(String[] args) {
        int nums[]= new int[5];
        nums[0]=1;
        nums[1]=2;
        nums[2]=3;
        nums[3]=4;
        nums[4]=5;
        for (int i=0;i<=4;i++){
            System.out.println(i);
        }
    }
}

//memory address in which the elements get stored is hexadecimal
// contigous memory allocation 


// stack = primitive datatype, funtion, refrence variable

//heap=arrays, strings, object