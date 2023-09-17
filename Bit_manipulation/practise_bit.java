public class practise_bit {

    public static void swap(int n , int m){

        System.out.println( n +" "+m  );

    n = n^m;
    m = n^m;
    n = n^m;

        System.out.println( n +" "+m  );
    }

    public static void main(String[] args) {


swap(13,14);

    }



}
