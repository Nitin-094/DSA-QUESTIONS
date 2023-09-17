import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.print("enter the number : ");
            int n = scan.nextInt();
            int facto = 1;

            if (n > 0) {
                for (int i = n; i >= 1; i--) {
                    facto = facto * i;
                }
                System.out.println(facto);
            } else {
                System.out.println("1");
            }
        }




    }
}
