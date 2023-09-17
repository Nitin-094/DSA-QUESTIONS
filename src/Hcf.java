import java.util.Scanner;
public class Hcf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number 1 : ");
        int n1 = scan.nextInt();
        System.out.println("Enter number 2 : ");
        int n2 = scan.nextInt();
        int hcf = 1;
        for (int i = 1; i <= n1 || i <= n2 ; i++) {
            if (n1%i == 0 && n2%i == 0) {
                hcf = i;
            }
        }
        System.out.println("The Hcf is : "+ hcf);
    }
}
