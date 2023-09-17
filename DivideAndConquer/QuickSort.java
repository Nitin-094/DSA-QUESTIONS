public class QuickSort {
    public static void main(String[] args) {

          int[] arr = {6,3,9,8,2,5};
            Quicksortt q1 = new Quicksortt();


        q1.printArr(arr);
        q1.QuickSort(arr,0,arr.length-1);
        q1.printArr(arr);

    }
}

class Quicksortt{

    void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    void QuickSort(int[] arr , int si , int ei){
        if(si>=ei){
            return;
        }
        int pindx = partition(arr,si,ei);
        QuickSort(arr,si,pindx-1);
        QuickSort(arr,pindx+1,ei);
    }

    int partition(int[] arr , int si , int ei){

        int pivot = arr[ei];
        int i = si-1;

        for (int j = si; j < ei; j++) { // ei

            if (arr[j]<=pivot){
                i++;
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j]=temp;
            }
        }

        // Adjusting pivot to the correct location.
        i++;
        //swap
        int temp = pivot;
        // pivot is a variable , we have to reflect the changes in arr not pivot itself.
        arr[ei] = arr[i];
        arr[i]=temp;
    return i;


    }







}