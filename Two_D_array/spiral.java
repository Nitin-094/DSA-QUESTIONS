import java.util.ArrayList;
import java.util.List;

public class spiral {


    static void spiral(int[][] arr){
        int colStart=0, rowStart=0;
        int colEnd=arr[0].length-1 , rowEnd= arr.length-1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();

        while(colEnd>=colStart && rowEnd>=rowStart){

            for (int i = colStart; i <= colEnd; i++) {
                System.out.print(arr[colStart][i]+" ");
            }
            for (int i = rowStart+1; i <=rowEnd ; i++) {
                System.out.print(arr[i][rowEnd]+" ");
            }
            for (int i = colEnd-1; i >=colStart ; i--) {
                System.out.print(arr[colEnd][i]+" ");
            }
            for (int i = rowEnd-1; i > rowStart ; i--) {
                System.out.print(arr[i][colStart]+" ");
            }

            colEnd--;
            colStart++;
            rowEnd--;
            rowStart++;

        }
    }

    static void spiral1(int[][] arr){

        int startCol = 0;
        int endCol = arr[0].length-1;
        int startRow = 0;
        int endRow = arr.length-1;
        ArrayList<Integer> l1 = new ArrayList<>();
        while(startCol<=endCol && startRow<=endRow){
            //printing the 1st row
            for (int i = startCol; i <= endCol; i++) {
//                System.out.print(arr[startCol][i]+" "); // startRow
                l1.add(arr[startCol][i]);
            }
            //printing last col
            for (int i = startRow+1; i <=endRow ; i++) {
//                System.out.print(arr[i][endRow] + " ");//endcol
                l1.add(arr[i][endRow]);
            }

            //printing last row
            for (int j = endCol-1; j>=startCol ; j--) {
                if(startCol==endCol){
                    return;
                }
//                System.out.print(arr[endRow][j]+" ");//
                l1.add(arr[endRow][j]);
            }

            //printing 1st col
            for (int i = endRow-1; i>startRow ; i--) {
//                System.out.print(arr[i][startCol]+" ");
                l1.add(arr[i][startCol]);
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;

        }
    }


    static List<Integer> spiral3(int[][] arr){

        int eR = arr.length-1 , sR = 0;
        int eCol = arr[0].length-1 , sCol=0;
        ArrayList<Integer> l1 = new ArrayList<>();

        while(eR>=sR && eCol>=sCol){

            //rightside
            for (int i = sCol; i <= eCol; i++) {
                l1.add(arr[sR][i]);
            }
            //downside
            for (int i = sR+1; i <= eR; i++) {
                l1.add(arr[i][eCol]);
            }
            //leftside
            for (int i = eCol-1; i >= sCol ; i--) {
                l1.add(arr[eR][i]);
            }
            //upside
            for (int i = eR-1; i >sR ; i--) {
                l1.add(arr[i][sCol]);
            }

            sCol++;sR++;
            eR--;eCol--;

        }

        return l1;
    }


    public static void main(String[] args) {

//            int arr[][] = {{1,2,3,4,5},{16,17,18,19,6},{15,24,25,20,7},{14,23,22,21,8},{13,12,11,10,9}};
//        int arr[][] = {{1},{2}};
        int arr[][] = {{1 ,2 ,3 ,4},
                       {5 ,6 ,7 ,8},
                       {9,10,11,12}};
//            spiral(arr);

        System.out.println(spiral3(arr));

    }
}
