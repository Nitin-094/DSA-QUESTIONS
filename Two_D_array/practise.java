public class practise {

    static void spiralMatrix(int[][] arr){

        int sRow=0 , sCol=0; int eRow=arr.length-1, eCol = arr[0].length-1;

        while(eRow>=sRow && eCol>=sCol){

            for (int i = sCol; i <= eCol; i++) {
                System.out.print(arr[sRow][i]+" ");
            }
            for (int i = sRow+1; i <= eRow ; i++) {
                System.out.print(arr[i][eCol]+" ");
            }
            for (int i = eCol-1; i >= sCol ; i--) {
                System.out.print(arr[eRow][i]+" ");
            }
            for (int i = eCol-1 ; i >= sCol ; i--) {
                System.out.print(arr[i][sCol]+" ");
            }
            eRow--;eCol--;sRow++;sCol++;
        }
    }

    static int diagonalSum(int[][] arr){
        int sum = 0;
        //primary diagonal - i==j
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
            //secondary diagonal - i+j == n-1
            if(i!=arr.length-i-1){
                sum += arr[i][arr.length-i-1];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i][i]+" ");
            //secondary diagonal - i+j == n-1
            if(i!=arr.length-i-1){
                System.out.print(arr[i][arr.length-i-1]+" ");
            }
            }

        System.out.println("sum is - "+sum);
        return sum;
    }

    public static void main(String[] args) {

//        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
//
//        int sum=0;
//
//        for (int i = 0; i < arr.length; i++) {
//
//
//            if (i!=arr.length-1-i){
//                sum+=arr[i][arr.length-1-i];
//                System.out.print("("+i+","+(arr.length-1-i)+")");
//            }
//        }
//        System.out.println();
//        System.out.println(sum);


//        int arr[][] = {{1,2,3,4,5},{16,17,18,19,6},{15,24,25,20,7},{14,23,22,21,8},{13,12,11,10,9}};
        int arr[][] = {{1},{2}};
        spiralMatrix(arr);


//        diagonalSum(arr);



    }




}
