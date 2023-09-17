import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.println("Enter a number : ");
            int n = scan.nextInt();
            int neww = 0;
            int nn = n;
            while (nn != 0) {
                int rem = nn % 10;
                neww = neww + (rem * rem * rem);
                nn = nn / 10;
            }
            if (n == neww) {
                System.out.println(neww + " yes "+ n);
            } else System.out.println(neww + " no " + n);
        }
    }
}
