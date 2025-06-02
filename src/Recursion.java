import java.sql.SQLOutput;

public class Recursion {
    public static void main(String[] args) {
        Recursion ob = new Recursion();
        //ob.print(1);
        System.out.print(0+" ");
            ob.fibonacci(0,1,1,10);
    }
    public void print(int n)
    {
        if (n==5)
        {
            System.out.println(n);
            return; // returning on a void function .. interesting
        }
        System.out.println(n);
        print(n+1);
    }

    public void fibonacci(int a, int b, int i, int target)
    {
        if(i==target)return;
        System.out.print(b+" ");
        fibonacci(b, a+b, i+1, target);
    }
}
