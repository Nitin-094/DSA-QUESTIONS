import java.util.Scanner;
public class Arm_strong_two {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        System.out.println("Input n1 : ");
//        int n1 = scan.nextInt();
        System.out.println("Input n : ");
        int n = scan.nextInt();
        int neww = 0;
            for (int i = 0; i <= n; i++) {
                int nn = i;
                while (nn != 0) {
                    int rem = nn % 10;
                    neww = neww + (rem * rem * rem);
                    nn = nn / 10;
                }
                if (neww == i) System.out.print(neww + " ");
                neww = 0;
        }
    }
}
