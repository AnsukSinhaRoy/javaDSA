public class bitwise {
    public static void main(String[] args) {
        System.out.println(odd(66));
        int[] arr = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 12};
        findUnique(arr);
        findNthBit(13,4);
    }
    public static boolean odd(int n)
    {
        return (n & 1) == 1;
    }

    public static void findUnique(int[] arr) {
        int xor=0;
        for(int i=0;i<arr.length; i++)
        {
            xor=arr[i]^xor;
        }
        System.out.println(xor);
    }
    public static void findNthBit(int num, int n)
    {
        System.out.println(num & (1<<(n-1)));
        // we generate a mask and then multiply - basically and - that mask with that number and get the decimal number. if the number is more than 0, then the bit was 1 else it was 0
        n = (int)Math.pow(2,n);
        if((num & n)>1) System.out.println(0);
        else System.out.println(1);


    }
}
