import java.util.Scanner;

class product_sum {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;
        int mul = 1;
        while (true) {

            if (n != 0) {
                int num = n % 10;
                sum = sum + num;
                mul = mul * num;
                n = n / 10;

            }
            if (n == 0) {
                System.out.println(mul - sum);
                break;
            }
        }
    }
}