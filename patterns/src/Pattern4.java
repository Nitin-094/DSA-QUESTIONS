public class Pattern4 {
    public static void main(String[] args) {
        int n =5;
        int a=1;

        for (int i = 0; i <= n; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(j+1+" ");
//                a++;
            }
            System.out.println("");

        }
    }
}
