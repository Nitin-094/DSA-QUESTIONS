import java.util.*;
public class Max {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = {34, 2, 3, 4,1,2,2,2,2,22,0};
        System.out.println(max(arr));

    }


    static int max(int[] arr){
        int b = 0;
        for (int i = 0; i < arr.length; i++) {

            int a = arr[i];

           b = Math.max(a,b);



        }


        return b;
    }

    }
