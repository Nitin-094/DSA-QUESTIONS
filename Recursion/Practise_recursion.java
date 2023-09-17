public class Practise_recursion {

    public static void main(String[] args) {
//        int n = 10;
//        printInc(n);
//        System.out.println();
//        printDec(n);
//        System.out.println();
//        System.out.println(factorial(5));
//        natural_no(n);
//        System.out.println();
//        System.out.println(fibonacci(25));

        int[] arr = {1,2,3,5,4,5,6,7,8,9};
        System.out.println(first_occurence(arr,5,0));
        System.out.println(last_occurance(arr,5,arr.length-1));

    }

    static void printDec(int n){
        if (n == 1) {
            System.out.print(1);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);

    }
    static void printInc(int n){
        if(n==1){
            System.out.print(1+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }

    static int factorial(int n){
        if (n==1){
            return 1;
        }
        int facto = n*factorial(n-1);

        return facto;
    }

    static void natural_no(int n){
        if (n==1){
            System.out.print(1+" ");
            return;
        }
        natural_no(n-1);
        System.out.print(n+" ");
    }

    static int fibonacci(int n){

        // fibonacci = fib(n-1) + fib(n-2)
        if (n==0 || n==1){
            return n;
        }
        return ( fibonacci(n-2) + fibonacci(n-1));
    }

    static boolean isSorted(int[] arr,int i) {
        if (i==arr.length-1){
         return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }



        return isSorted(arr, i+1);
    }

    static int first_occurence(int[] arr , int key, int i){

        if (i==arr.length-1){
            return -1;
        }

        if(arr[i]==key){
            return i;
        }

        return first_occurence(arr,key,i+1);
    }

    static int last_occurance(int[] arr , int key , int i){

        if(i==0 && arr[i] != key){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return last_occurance(arr, key, i-1);
    }

}