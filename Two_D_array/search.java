public class search {

    public static void main(String[] args) {

        int[][] arr = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};

        int key = 40;

        int i = 0 , j = arr[0].length-1; // co-ordinates of the right most diagonal element.

        while(i<arr.length && j>=0){

            if (key == arr[i][j]) {
                System.out.print("("+i+","+j+")");
                break;
            }

            if (key > arr[i][j]){
                i++;
            }

            if (key < arr[i][j]){
                j--;
            }




        }






    }
}
