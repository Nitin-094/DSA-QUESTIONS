import java.util.Scanner;

public class palindrome_number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


            System.out.println("Enter the number : ");
            int n = scan.nextInt();
            int neww = 0;

            do {

                int rem = n % 10;
                neww = neww * 10 + rem;
                n = n / 10;

            } while (n != 0);

            if (neww == n) {
                System.out.println("palindrome");

            }else System.out.println("not");
    }

}
