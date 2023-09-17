public class Subarray_sum {

    static void sub_sum(int[] arr){

        int maxSum = 0;
        int sum = 0;
        // initialising the starting point.
        for (int i = 0; i < arr.length; i++) {
            // Initialising the end point.
            for (int j = i; j < arr.length ; j++) {
                for (int k = i; k <= j; k++) {
//                    System.out.print(arr[k]);
                    maxSum += arr[k];
                }
                System.out.print(maxSum+ " ");
                if (maxSum > sum) {
                    sum = maxSum;
                }
                maxSum = 0;
//                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.print("the maximum sum is "+ sum);
    }



    public static void main(String[] args) {
//        int[] arr={1,-2,6,-1,3};
        int[] arr = {1,2,3,4};
        sub_sum(arr);
    }
}
