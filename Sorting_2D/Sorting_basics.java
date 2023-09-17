import java.util.*;
public class Sorting_basics {
    static void print_arr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                //jth element is the current or selected element
                if (arr[j]>arr[j+1]){
                        int a = arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=a;
                }
            }
        }
    }

    static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            //assume the ith index to be the index of the smallest element.
            int smallest = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[smallest]>arr[j]){
                    smallest = j;
                }
            }

            int a = arr[i];
            arr[i]=arr[smallest];
            arr[smallest]=a;
        }
    }

    static void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;
            //finding the correct position to insert.
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1]=curr;
        }
    }

    static void counting_sort(int[] arr){
        // for negative case, make a separate array in descending order.

        //finding the range
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length ; i++) {
            max=Math.max(max,arr[i]);
        }
        //we have to include 0 and the last element too.
        int[] count=new int[max+1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        //sorting
        int j =0;
        for (int i = 0; i < count.length; i++) {
            while(count[i]>0){
                arr[j]=i;
                count[i]--;
                j++;
            }
        }
    }


    public static void main(String[] args) {

//        int[] arr = {10,4,2,1,5,9,8,6,1,2,5,3,5,6,7,3,6,9};
        int[] arr={3,6,2,1,8,7,4,3,5,1};
//        bubbleSort(arr);
//        selectionSort(arr);
//        insertionSort(arr);
//        counting_sort(arr);


        print_arr(arr);
    }
}
