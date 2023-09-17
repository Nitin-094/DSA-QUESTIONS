public class arrays1 {

    static void BacktrackArr(int[] arr , int i){

        if(i == arr.length){
                    return;
        }

        arr[i] = i+1;
        BacktrackArr(arr,i+1);
        arr[i] = arr[i]-2;

    }
    public static void main(String[] args) {
        int n=3;
        int[][] board = new int[n][n];

    int[] arr = new int[5];

    BacktrackArr(arr,0);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }


    }

}
