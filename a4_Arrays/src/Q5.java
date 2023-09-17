public class Q5 {


    public static void main(String[] args) {

        int[] arr = {-1, 0, 1, 2, -1, 4};


        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {

                    if (i != j && i != k && j != k) {
                        if ((arr[i] + arr[j] + arr[k]) == 0) {
                            System.out.print("[" + arr[i] + "," + arr[j] + "," + arr[k] + "]");
                        }
                    }

//                    System.out.print(" ");
                }
            }
        }
    }
}
