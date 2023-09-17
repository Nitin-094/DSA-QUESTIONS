
// The array should be sorted.
public class Binary_search {
    static int BinarySearch(int[] arr , int key){
        int start=0     ,    end= arr.length-1 ;
//        while( start <= end )
        for (int i = 0; i < arr.length; i++) {
            int mid = (start + end)/2;
            if (key == arr[mid]) {
                return mid;
            }
            if (key < arr[mid]) {
                end = mid-1;
            }
            else {
                start = mid + 1;
            }
        }
        return 404;
    }

    static void binary_search(int [] arr, int key){
        int start = 0 , end = arr.length-1;

        for (int i = 0; i < arr.length; i++) {

            int mid = (start + end)/2;
            if (key == arr[mid]) {
                System.out.print(mid);
                break;
            }
            if (key > arr[mid]){
                start = mid+1;
            }
            if (key < arr[mid]){
                end = mid-1;
            }
        }
    }



    public static void main(String[] args) {
        int[] arr = {1,2,3,10,100,120,300};
        int k = 1000;
//        int c = BinarySearch(arr,k);
//        System.out.println(c);
     binary_search(arr,120);
    }
}
