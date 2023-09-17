public class pattern3 {
    public static void main(String[] args) {

        int  n=5;

        pattern(n);

//        for (int i = 0; i < 5; i++) {
//
//            for (int j = 5-i; j> 0; j--) {
//
//                System.out.print("* ");
//
//            }
//            System.out.println("");
//
//        }



    }

    static void pattern(int n){
        for (int i = 0; i < n; i++) {

            for (int j = n; j > i ; j--) {

                System.out.print("*");

            }
            System.out.println("");
        }
    }


}
