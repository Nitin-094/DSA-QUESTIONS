import java.util.Scanner;

public class Power {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while(true){


            System.out.print("Enter the number and its power : ");
            int n = scan.nextInt();
            int p = scan.nextInt();
            int mul = 1;

            if (n == 0 && p >= 0){
                System.out.println("0");
            }
            if (n != 0 && p == 0) {
                System.out.println("1");
            }
            else {

                for (int i = 0; i < p; i++) {

                    mul = mul * n;


                }
                System.out.println(n + "^" + p + " = " + mul);
            }
        }

    }
}
// Math.pow(base,exponent)