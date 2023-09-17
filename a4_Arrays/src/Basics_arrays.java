
import java.util.*;
public class Basics_arrays {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[10];
        int[] arr1 = {1,2,3,4,5,6,7};


        for (int i = 0; i < arr.length; i++) {
                arr[i] = scan.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i]+" ");
//            System.out.println();


        }


    }





}
