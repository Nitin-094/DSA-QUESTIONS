public class Hollow_rhombus {

    public static void main(String[] args) {

        int row = 5;

        for (int i = 1; i <= 5 ; i++) {

            for (int j = row - i; j>0 ; j--) {
                System.out.print("  ");
            }

            for (int j = 1; j<=row  ; j++) {
                if (i == 1 || j == 1 || i == row || j == row  ) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }


            }

            System.out.println();



        }




    }


}
