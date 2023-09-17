public class Recursionfunctions {

    public static void main(String[] args) {
//        printDec(10);
//        increasingOrder(10);
//        System.out.println(facto(5));
//        System.out.println(natural_no(10));
        int n = 8;
        System.out.println(fibo(n));
        Fibo_iter(n);
    }
    static void printDec(int n){
    if (n==1){
        System.out.print(1);
        return;
    }
        System.out.print(n+" ");
        printDec(n-1);
    }
    static void increasingOrder(int n){
        if(n==1){
            System.out.print(1+" ");
            return;
        }
// It will print the value of n after getting poped!
        increasingOrder(n-1);
        System.out.print(n+" ");
    }
    static int facto(int n){
        if (n == 0){
            return 1;
        }
        int facto_val = n * facto(n-1);
        return facto_val;
    }
    static int natural_no(int n){
        if(n==1){
            return 1;
        }
        int sum = n+natural_no(n-1);
                return sum;
    }
    static int fibo(int n){

        if (n==0 || n==1){
            return n;
        }

//        int fibo_cal = fibo(n-1) + fibo(n-2);
//        System.out.print(fibo_cal+" ");
//        return fibo_cal;

        return fibo(n-1) + fibo(n-2);

    }

    static void Fibo_iter(int n){
//        if(n==1){
//            System.out.print(1);
//        }
//        if(n==2){
//            System.out.print(1+" "+2+" ");
//        }
        if(n>2){
            int[] arr=new int[n+1];
            arr[0]=0; arr[1]=1;
            System.out.print(0+" "+1+" ");
            for (int i = 2; i <= n; i++) {
                arr[i] = arr[i - 1] + arr[i-2];
                System.out.print(arr[i] + " ");
            }
        }
    }
}
