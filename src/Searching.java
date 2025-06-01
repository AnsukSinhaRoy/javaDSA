public class Searching {
    public static void main(String[] args) {
        int a[] = {1, 5, 8, 16, 24, 27, 29, 33, 39, 44,45};

        for (int j : a) {
            System.out.print(BinarySearch(a, j) + " ");
        }
        System.out.println();
        System.out.println(BinarySearch(a,10));
    }
    public static boolean BinarySearch(int [] arr, int target)
    {
        int start=0; int end=arr.length-1; int mid;

        for(int i =0;i<arr.length/2; i++)
        {
            mid = (start+end)/2;// might be possible that this addition exceeds the range of integer in Java hence, use the later:
            mid = start + (end - start)/2;
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
}
