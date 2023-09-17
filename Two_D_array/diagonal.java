public class diagonal {


    static int diagonal(int[][] arr){
        int sum=0;

        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i][i];
            if (i!=arr.length-1-i){
                sum+=arr[i][arr.length-1-i];
            }

        }
    return sum;
    }



    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3, 4},
                       {5, 6, 7, 8},
                       {9,10,11,12},
                       {13,14,15,16}};

        // brute force O(n^2)
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (i == j) {
                    sum += arr[i][j];
                    System.out.print(arr[i][j] + " ");
                } else if ((i + j )== arr.length -1) {
                    sum += arr[i][j];
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
        System.out.print("\nThe sum of primary array is : "+sum);



        // linear complexity
        int sum1=0;
        for (int i = 0; i < arr.length; i++) {
            // primary diagonal
           sum1+=arr[i][i];
          //secondary diagonal
            //means i != j
            if(i != arr.length-1-i) {
                sum1 += arr[i][arr.length - 1 - i];
            }
        }
        System.out.println();
        System.out.println(sum1);






    }
}


