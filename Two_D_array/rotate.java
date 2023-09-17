import java.util.Arrays;

public class rotate {


    static void printArr(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] arr1 = new int[arr.length][arr[0].length];
        printArr(arr);
        System.out.println();
        //transpose
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr1[i][j]=arr[j][i];
            }
        }

        printArr(arr1);



    }
}
