public class transpose {

    public static void main(String[] args) {

        int[][] arr= {{1,2},{3,4},{5,6}};

        int[][] arrT = new int[arr[0].length][arr.length];

//        System.out.println(arrT.length +","+arrT[0].length+","+arr[0].length+","+arr.length);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arrT[j][i] = arr[i][j];
            }
        }


        for (int i = 0; i <= arr.length; i++) {
            for (int j = 0; j <= arr[0].length; j++) {
                System.out.print(arrT[i][j]+" ");
            }
            System.out.println();
        }


    }
}
