import java.util.*;
public class basics {

    static void search(int[][] arr,int key){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {

                if(arr[i][j]==key){
                    System.out.print(i+","+j);
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);



        int[][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {

                System.out.print(arr1[i][j]+" ");

            }
            System.out.println();
        }








        int[][] arr = new int[3][3];
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[0].length; j++) {
//                arr[i][j]=scan.nextInt();
//            }
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[0].length; j++) {
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
//
//        search(arr,123456789);


    }




}

