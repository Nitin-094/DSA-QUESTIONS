public class Butterfly {

    public static void main(String[] args) {
        int n = 5;

        butter_fly(2*n);

    }

    static void butter_fly(int n){

        for (int i = 1; i <= n/2 ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= 2*(n/2 - i); j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n/2 ; i++) {
            for (int j = n / 2; j >= i; j--) {
                System.out.print("* ");
            }
            for (int j = 1; j < 2 * (i) - 1; j++) {
                System.out.print("  ");
            }
            for (int j = n / 2; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }



    }

    static void butter_fly_1(int n){
        for (int i = 1; i <= n ; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                for (int j = 1; j <= 2 * (n - i); j++) {
                    System.out.print("  ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
            System.out.println();
            }
        for (int i = n; i >= 1 ; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        }

    }


