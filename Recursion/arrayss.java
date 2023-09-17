public class arrayss {
    public static void main(String[] args) {
//Check given array is sorted or not.
        int[] arr = {0,1,2,3,1,0,4,4,6,7,8,9};
//        System.out.println(isSorted(arr,0));
//        System.out.println(first_occurance(arr,5,0));
//        System.out.println(last_occurence(arr,0,arr.length-1));
//        System.out.println(lastOccurence(arr,0,0));


//        System.out.println(xPowN(10,5));
        System.out.println(xPOWn(10,5));


    }


    static boolean isSorted(int[] arr , int i){

        if(i == arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr , i+1);

    }

    static int first_occurance(int[] arr , int key ,int i){

        if(arr[i] == key){
            return i;
        }
        if(i==arr.length-1){
            return -1;
        }
        return first_occurance(arr,key,i+1);
    }

    static int last_occurence(int[] arr , int key , int l){
        if(arr[l]==key){
            return l;
        }
        if(l==0){
            return -1;
        }
        return last_occurence(arr, key , l-1);
    }

    static int lastOccurence(int[] arr , int key , int i){
        if(i == arr.length) {
            return -1;
        }
        int found = last_occurence(arr,key ,i+1);

        if(found == -1 && arr[i]==key) {
            return i;
        }
        return found;
    }

//     static int xPowN(int x , int n){
//        if(n==0){
//            return 1;
//        }
//        return x*xPowN(x,n-1);
//     }
     static int xPOWn(int x , int n){
        if(n==0){
            return 1;
        }
//        int cal = xPOWn(x,n/2)*xPOWn(x,n/2); // if this is executed time complexity is O(n).
         //
         int funCall = xPOWn(x,n/2);
         int cal = funCall*funCall;
        // if n is odd
        if(n%2 != 0){
            cal = x*cal;
        }
        return cal;
     }
}

