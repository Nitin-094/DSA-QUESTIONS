public class Z_O {
    public static void main(String[] args) {

        int row = 5;
//        int a =1;

        for (int i = 1; i <= row ; i++) {

            for (int j = 1; j <= i ; j++) {

                if ((i+j)%2 == 0){
                    System.out.print(1+" ");
                }
                else {
                    System.out.print(0+" ");
                }
//                a++;

            }
            System.out.println();
        }


    }


}
