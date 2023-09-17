import java.util.Scanner;

public class Perfect_num {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("Enter the number : ");
            int n = scan.nextInt();
            int perff = 0;
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    perff = perff + i;
                }
            }
            if (perff == n) {
                System.out.println("perfect number!");
            } else System.out.println("not perfect number!");


        }

    }
}
