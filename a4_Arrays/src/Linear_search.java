import java.util.*;
public class Linear_search {

    static int LnrSrch(int[] arr , int key){

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return 404;
    }


    static int LinearSrch(int[] arr , int key){

        for (int i = 0; i < arr.length; i++) {
//            int a = arr[i];

            if (arr[i] == key){
                System.out.print(i);

            }
        }
        return 404;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    int[] arr = {1,2,3,5,6,4,10};
    int key = 100;

    int c=LnrSrch(arr,key);

//        System.out.println(c);
        LinearSrch(arr,key);

    }
}
