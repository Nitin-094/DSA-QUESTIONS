public class Pattern5 {

    public static void main(String[] args) {

//        for (int i = 0; i < 5; i++) {
//
//            for (int j = 0; j< i; j++) {
//
//                System.out.print("*");
//
//            }
//            System.out.println();
//
//        }
//
//        for (int i = 0; i < 5; i++) {
//
//
//            for (int j = 5; j > i  ; j--) {
//                System.out.print("*");
//            }
//            System.out.println("");
//
//        }

        for (int i = 0; i < 2*5; i++) {
            if (i <5) {
                    for (int j = 0; j < i; j++) {
                        System.out.print("* ");
                    }
            }

            else{
                for (int j = 2*5 - i; j > 0  ; j--) {
                    System.out.print("* ");
                }
            }

            System.out.println();
        }

    }

}
