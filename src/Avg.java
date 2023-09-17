import java.util.Scanner;

public class Avg {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = scan.nextInt();
        float sum=0;

        for (int i = 0; i < n; i++) {
            System.out.println("enter "+(i+1)+" value : ");
            int m = scan.nextInt();

            sum = sum+m;

        }

        System.out.println("The average of the numbers is : "+(sum/n));

    }
}
