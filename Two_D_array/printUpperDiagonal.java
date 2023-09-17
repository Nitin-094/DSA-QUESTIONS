import java.util.ArrayList;
import java.util.Arrays;

public class printUpperDiagonal {

    static void printUpDiagonal(int[][] arr){
        //upper traingle printing
        for (int i = 0; i < arr.length; i++) {
            int r=0,c=i;
            while(c>=0){
                System.out.print(arr[r++][c--]+" ");
            }
        }

        //lower traingle printing
        for (int i = 0; i < arr.length; i++) {
            int r=i , c = arr.length-1;
            while(r<arr.length){
                System.out.print(arr[r++][c--]+" ");
            }
        }

    }



    static void setZeros(int[][] arr){
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j]==0){
                    l1.add(i);
                    l2.add(j);
                }
            }
        }


        for (int i = 0; i < l1.size(); i++) {

            int r = l1.get(i);
            int c = l2.get(i);

            int r1 = r , c1 = c;
            //left case
            while(c1!=-1){
                arr[r1][c1--]=0;
            }
            c1=c;
            //right case
            while(c1!=arr[0].length){
                arr[r1][c1++]=0;
            }
            c1=c;
            //up case
            while(r1!=-1){
                arr[r1--][c1]=0;
            }
            r1=r;
            //down case
            while(r1!=arr.length){
                arr[r1++][c1]=0;
            }
        }
    }


    public static void main(String[] args) {

    int arr[][] = {{1,2,3},
                   {4,0,6},
                   {7,8,9}};

//    printUpDiagonal(arr);
        setZeros(arr);


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }


}
