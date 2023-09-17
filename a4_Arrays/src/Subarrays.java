public class Subarrays {
    static void subarray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k]);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }


    static void sub(int[] arr){
            for (int i = 0; i < arr.length; i++) {
                for (int j = i+1; j <= arr.length; j++) {
                    for (int k = i; k <j ; k++) {
                        System.out.print(arr[k]);
                    }
                    System.out.print(" ");
                }

        System.out.println();
            }
       }



    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
//        subarray(arr);
//        System.out.println();
//        sub(arr);

//        int[] arr = {1,2,3,4};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < args.length ; j++) {
                for (int k = i; k <= j; k++) {

                    System.out.print(arr[k]);

                }
                System.out.print(" ");
            }
            System.out.println();
        }



    }
}
