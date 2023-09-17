import java.util.*;
public class Largest {
    static int large(int[] arr ){
        int a = arr[0],c;
        for (int i = 1; i < arr.length; i++) {
            c=arr[i];

            a = Math.min(c,a);


        }
        return a;
    }
    public static void main(String[] args) {

        int[] arr = {1,2,3,9993,6,100,1333};

        int c = large(arr);
        System.out.println(c);
    }


}
