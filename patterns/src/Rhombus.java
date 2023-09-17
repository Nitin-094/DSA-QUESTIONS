public class Rhombus {
    public static void main(String[] args) {

        int row = 5;

        for (int i = 1; i <=5 ; i++) {

            for (int j = row - i; j > 0 ; j--) {
                System.out.print("  ");
            }
            for (int j = row; j>0 ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
