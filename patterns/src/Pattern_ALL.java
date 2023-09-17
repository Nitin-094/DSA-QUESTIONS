public class Pattern_ALL {
    public static void main(String[] args) {


        pattern_5(5);


    }

    static  void pattern_1(int n){
        for (int i = 0; i < n; i++) { //center mei true condition..
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern_2(int n){
        for (int i = 0; i <= n; i++) { //center mei true condition..
            for (int j = 0; j < i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern_3(int n){
        for (int i = 0; i < n; i++) { //center mei true condition..
            for (int j = 5; j > i ; j--) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    static void pattern_4(int n){
//        int a = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
//                a++;
                System.out.print(j+1+" ");
            }
            System.out.println();
        }
    }


    static void pattern_5(int n){

        for (int i = 0; i < 2*n; i++) {
            if (i<=n){
                for (int j = 0; j < i ; j++) {
                    System.out.print("*");
                }
            }
//
            else {
                for (int j = 2*n - i; j >= 1 ; j--) {
                    System.out.print("*");
                }
            }

            System.out.println();

            
        }
        
        
    }





}
