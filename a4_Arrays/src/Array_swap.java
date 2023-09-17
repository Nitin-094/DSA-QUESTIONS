public class Array_swap {
    static void swap(int[] arr , int index1, int index2){
        int a = arr[index1];
        arr[index1]=arr[index2]; // arr[1] ko arr[2] bna de!!
        arr[index2]=a;

    }

    static void swap1(int[] arr,int a , int b){
        int c;

        c = arr[a];
        arr[a]=arr[b];
        arr[b]=c;
    }



    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }

        swap1(arr,0,4);
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");

        }
    }
//    static void swap(int[] arr , int index1, int index2){
//        int a = arr[index1];
//        int b = arr[index2];
//
//        arr[index1]=b;
//        arr[index2]=a;
//
//    }
}
