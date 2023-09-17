import java.util.Arrays;

public class Reverse_arr {


    static void reverse(int[] arr){
        // start and end are the indices of an array.
        int start = 0 , end = arr.length - 1;


    }


    static void rev_swap(int[] arr){

        for (int i = 0; i < arr.length/2; i++) {

            int c;
            c=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=c;

        }

    }



    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11};

        System.out.print(Arrays.toString(arr)+" ");
        rev_swap(arr);
        System.out.println();
        System.out.print(Arrays.toString(arr)+" ");

    }



}
