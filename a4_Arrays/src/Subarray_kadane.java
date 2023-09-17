public class Subarray_kadane {

    static int kadane(int[] arr){
        int curSum = 0 , maxSum = 0;
        for (int i = 0; i < arr.length; i++) {

            curSum += arr[i];
            curSum = curSum<0 ? 0 : curSum;

            maxSum = Math.max(curSum,maxSum);
        }

    return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
//        int[] arr = {1, -2, 6, -1, 3};
//        int[] arr = {-2,-3,4,-1,-2,1,5,-3};

        System.out.println(kadane(arr));

        System.out.println();
        System.out.println();
        int prefix =0 , max = 0;

        for (int i = 0; i < arr.length; i++) {

            prefix += arr[i];

            if (prefix<0){
                prefix = 0;
            }

            max=Math.max(prefix,max);

        }

        System.out.println(max);



    }


}
