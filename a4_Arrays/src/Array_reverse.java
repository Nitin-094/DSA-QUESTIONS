public class Array_reverse {
    static void rev(int[] arr){

        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i]=arr[arr.length-1-i];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr2[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5};
        rev(arr);
    }
    }




