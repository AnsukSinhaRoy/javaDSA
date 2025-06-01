import java.util.Arrays;

public class NewClass {
    public static void main(String[] args) {
        int a = 100;
        change(a);
        System.out.println(a);
        int []arr ={1,2,3,4,5};
        changearr(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void changearr(int [] a) {
        a[0] = 99;// here, its pass by reference

    }

    private static void change(int b) {
        b=50;//we are creating a new object here. they dont point towards the same object they also might, that will depend on the memory management of the OS, but any changes will be made on a separate object
    }



}
