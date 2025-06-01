public class Searching {
    public static void main(String[] args) {
        /*int a[] = {1, 5, 8, 16, 24, 27, 29, 33, 39, 44,45};

        for (int j : a) {
            System.out.print(BinarySearch(a, j) + " ");
        }
        System.out.println();
        System.out.println(BinarySearch(a,10));
        ceiling();*/
        System.out.println(mountainPlateauSkewedArray());
    }
    public static boolean BinarySearch(int [] arr, int target)
    {
        int start=0; int end=arr.length-1; int mid;

        for(int i =0;i<arr.length/2; i++)
        {
            mid = (start+end)/2;// might be possible that this addition exceeds the range of integer in Java hence, use the later:
            mid = start + (end - start) / 2;
            if(arr[mid]==target){
                return true;
            }
            if(arr[mid]>=target){
                end=mid-1;
                continue;
            }
            if(arr[mid]<=target){
                start=mid+1;
            }
        }
        return false;



    }
    // find the ceiling of a number in an array
    public static void ceiling()
    {
        int a[] = {4, 5, 8, 16, 24, 27, 29, 33, 39, 44,45};
        int target = 2;
        int start=0; int end=a.length-1; int mid;
        for(int i =0;i<a.length/2; i++)
        {
            mid = (start+end)/2;// might be possible that this addition exceeds the range of integer in Java hence, use the later:
            mid = start + (end - start) / 2;
            if(a[mid]==target){
                System.out.println(a[mid]);
                break;
            }
            if(a[mid]>=target){
                end=mid-1;
                continue;
            }
            if(a[mid]<=target){
                start=mid+1;
            }
        }
        System.out.println(a[start]);
    }
    //print the sub array that contains the same target elements
    public static void printSubarray()
    {
        int arr[]= {1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2,2,2,3,6,6,7,7,7,7,8,8,12,12,12,12,45,45,45,45,45,45,45,45,78};
        int target = 7;
        int start = 0; int end = arr.length; int mid = start+(end-start)/2;
        for(int i=0; i<arr.length/2;i++)
        {
            //if()
        }
    }

    //Search for an element in an array of infinite size. (u cant use the arr.length)
    public static void infiniteArray()
    {
        int arr[]= {1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2,2,2,3,6,6,7,7,7,7,8,8,12,12,12,12,45,45,45,45,45,45,45,45,78};
        int target = 7;
        int start = 0; int end = arr.length; int mid = start+(end-start)/2;
        for(int i=0; i<arr.length/2;i++)
        {
            //if()
        }
    }
    //There is one peak inside the array, you have to find that peak
    //This does not work when there is a plateau
    public static int MountainArray()
    {
        int arr[] = {1, 2, 4, 7, 10, 14, 18, 22, 26, 30, 33, 36, 39, 41, 43, 45, 46,
                47, 48, 49, 50, 49, 48, 47, 45, 43, 40, 38, 35, 32, 29, 26, 22,
                18, 14, 10, 6, 3, 1};

        int pointer = arr.length/2;
        int start = 0; int end = arr.length-1;
        while(true)
        {
            if (arr[pointer]-arr[pointer-1]>0  && arr[pointer]-arr[pointer+1]>0)
                return arr[pointer];
            else if (arr[pointer]-arr[pointer-1]>0) {
                start = pointer;
                pointer = start+(end-start)/2;
            }
            else {
                end = pointer;
                pointer = start+(end-start)/2;
            }
        }
    }
    //doesnot work for skewed  Mountain - plateau array
    public static int mountainPlateauSkewedArray()
    {
        int arr[] = {1, 2, 4, 7, 10, 14, 18, 22, 26, 30, 34, 38, 40, 42, 42, 42, 42, 44, 46, 48,
                49, 50, 50, 50, 50, 50, 50, 49, 48, 46, 1};

        int pointer = arr.length/2;
        int start = 0; int end = arr.length-1;
        while(true)
        {
            if (arr[pointer]-arr[pointer-1]==0  && arr[pointer]-arr[pointer+1]==0)
            {
                //check for ceiling and floor of this plateau
            }
            if (arr[pointer]-arr[pointer-1]>=0  && arr[pointer]-arr[pointer+1]>=0)
                return arr[pointer];
            else if (arr[pointer]-arr[pointer-1]>0) {
                start = pointer;
                pointer = start+(end-start)/2;
            }
            else {
                end = pointer;
                pointer = start+(end-start)/2;
            }
        }
    }
}
