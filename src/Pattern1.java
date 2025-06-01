public class Pattern1 {
    public static void main(String[] args)
    {
        int n=6;
        for(int i=0; i<n;i++)
        {
            for (int j=0;j<n*2;j++)
            {

                if(j<=i || (n*2)-j<=i) System.out.print("  ");
                else System.out.print("* ");
            }
            System.out.println();
        }
        int a=0;
        for(int i=0; i<n;i++)
        {
            for (int j=-n;j<=n;j++)
            {
                int abs_j = Math.abs(j);
                if(abs_j<=a) System.out.print("* ");
                else System.out.print("  ");
            }
            a++;
            System.out.println();

        }
        a=0;
        int b=1;
        for(int i=0; i<n;i++)
        {
            for (int j=-n;j<=n;j++)
            {
                int abs_j = Math.abs(j);
                if(abs_j<=a){
                    System.out.print(b+" ");
                    b++;
                }
                else System.out.print("  ");

            }
            a++;
            System.out.println();

        }
    }
}
