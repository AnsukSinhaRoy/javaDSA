import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2,3,4,45,48,47,65,255);
        multipleArg("nfg", "ksdhfhlsf", "ksudhfkuhsf", "lskdlkfjlk");
    }

    private static void multipleArg(String ...s) {
    }

    static void fun(int ...v) //it can accept any number of arguments, and on the working level, it stores the values in an array
    {
        //variable length arguments always come at the end
        System.out.println(v.length);
        System.out.println(Arrays.toString(v));
    }
}
