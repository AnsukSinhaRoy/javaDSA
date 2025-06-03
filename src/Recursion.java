import java.sql.SQLOutput;

public class Recursion {
    public static void main(String[] args) {
//        Recursion ob = new Recursion();
//        //ob.print(1);
//        System.out.print(0+" ");
//        ob.fibonacci(0,1,0,10);
//        System.out.println();
//        System.out.println("NEW FIBO: "+ ob.fibo(10));
//
//        printNaturalNumbers(10);
//        printNaturalNumbersBOTH(10);

        //System.out.println(factorial(5));

//        System.out.println(sumOfDigits(1342));
//        System.out.println(prodOfDigits(12345));

        reverseNumber(12345);
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
    public int fibo(int n)
    {
        if (n==1) return 1;
        else if (n==0) return 0;
        else return fibo(n-1) + fibo(n-2);
    }

    public static void printNaturalNumbers(int n)
    {
        if(n==0){
            System.out.println(n);
            return;
        }
        else {
            printNaturalNumbers(n-1);
            System.out.println(n);
        }
    }
    //NOT WORKING
    public static void printNaturalNumbersBOTH(int n)
    {
        System.out.println(n);
        if(n==0){
            return;
        }
        System.out.println(n);
        printNaturalNumbers(n-1);
        System.out.println(n);

    }
    public static int factorial(int n)
    {
        if(n==0) return 1;
        else return n*factorial(n-1);

    }

    public static int sumOfDigits(int n)
    {
        if(n==0)return 0;
        else return n%10 + sumOfDigits(n/10);
    }

    public static int prodOfDigits(int n)
    {
        if(n==0) return 1;
        else return n%10 * prodOfDigits(n/10);
    }

    public static void reverseNumber(int n)
    {
        if (n<10) System.out.print(n);
        else {
            System.out.print(n%10);
            reverseNumber(n/10);
        }
    }
}
