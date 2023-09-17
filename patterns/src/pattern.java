public class pattern {
    public static void main(String[] args) {
    int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            System.out.print(i);
            for (int j = 2*(n-i); j >0 ; j--) {
                System.out.print(" ");
            }
            System.out.print(i);
            System.out.println();
        }
        for (int i = n; i > 0; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print(i);
            for (int j = 2*(n-i); j >0 ; j--) {
                System.out.print(" ");
            }
            System.out.print(i);
            System.out.println();
        }
    }
}