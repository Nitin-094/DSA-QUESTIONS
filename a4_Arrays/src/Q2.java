public class Q2 {
    static int rotated_search(int[] arr , int target){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] nums={1,2,3,4,5};
        System.out.println(rotated_search(nums,5));

    }
}
