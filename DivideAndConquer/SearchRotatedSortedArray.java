public class SearchRotatedSortedArray {
    public static void main(String[] args) {

        int[] arr = {4,5,6,7,0,1,2,3};//{4,5,6,7,0,1,2};
        RotatedSortedArray r1 = new RotatedSortedArray();
        int c=r1.search(arr,7,0,arr.length-1);
        System.out.println(c);
    }
}
class RotatedSortedArray{
    int search(int[] arr , int target , int si , int ei){
        if(si>ei){
            return -1;
        }
        int mid = si + (ei-si)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[si]<=arr[mid]){
            if (arr[si] <= target && target <= arr[mid]) {
                return  search(arr, target, si, mid-1);//left L1
            } else {
                return  search(arr, target, mid+1, ei); // right L1
            }
        } else{
            if (arr[mid]<=target && target <= arr[ei]) {
                return  search(arr, target, mid+1, ei);//Right L2
            } else {
                return  search(arr, target, si, mid-1);//Left L2
            }
        }
    }
}



