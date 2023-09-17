import java.util.*;
public class MergeSort {

    public static void main(String[] args) {

        int[] arr = {6,3,9,5,2,8};

        mergerSort(arr,0,arr.length-1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }


    }

   static  void mergerSort(int[] arr , int si , int ei){
        if(si >= ei){
            return;
        }
        int mid = si + (ei - si)/2;
        mergerSort(arr,si,mid);
        mergerSort(arr,mid+1,ei);
        merge(arr, si,mid,ei);
    }

    static void merge(int[] arr , int si , int mid , int ei){
        int[] temp = new int[ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0;
        while(i <= mid && j <= ei) {
            if(arr[i]<arr[j]){
                temp[k++]=arr[i++];
            }else{
                temp[k++]=arr[j++];
            }
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        for (k = 0 ,i = si ;k < temp.length ;i++,k++) {
            arr[i]=temp[k];
        }
    }



//
//    public static void mergeSort(int[] arr , int si , int ei){
//        if(si>=ei){
//            return;
//        }
//        int mid = si+(ei-si)/2;// Better way to calculate the mid rather than simple (SI+EI)/2 .
//
//        mergeSort(arr,si,mid);// Calculating the Left part.
//        mergeSort(arr,mid+1,ei);// Calculating the right part.
//
//        merge(arr,si,mid,ei);
//
//    }
//
//    public static void merge(int[] arr, int si, int mid ,int ei){
//        int[] tempArr = new int[ei-si+1];
//
//        int i = si;// iterator for left.
//        int j = mid+1;// iterator for right.
//        int k = 0 ; // iterator for temp.
//
//        while(i <= mid && j <= ei){
//            if(arr[i] < arr[j]){
//                tempArr[k] = arr[i];
//                i++; k++;
//            }
//            if(arr[j] < arr[i]){
//                tempArr[k] = arr[j];
//                j++; k++;
//            }
//
//        }
//        // considering the leftover elements
//        //left part
//        while(i<=mid){
//            tempArr[k++]=arr[i++];
//        }
//        //Right part
//        while(j<=ei){
//            tempArr[k++]=arr[j++];
//        }
//        // tempArr = arr
//        for (k = 0 , i=si; i < tempArr.length; i++,k++) {
//            arr[i] = tempArr[k];
//        }
//
//
//    }


}
