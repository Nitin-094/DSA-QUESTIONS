public class Repate_val {

    static boolean rep(int[] arr){
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
        int temp = arr[i];
            for (int j = i+1; j < arr.length; j++) {
                if (temp == arr[j]) {
                    flag = true;
                }
            }
        }
    return flag ;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4};

        System.out.println(rep(arr));

    }

}
