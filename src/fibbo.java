import java.util.Scanner;

public class fibbo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter n : ");
        int n = scan.nextInt();
        int a = 0 , b = 1 ;
        int sum;

        if (n == 0){
            System.out.println(a);
        }
        else if (n == 1){
            System.out.println(a+" "+b);
        }
        else {
            System.out.print(a+" "+b+" ");
            for (int i = 0; i < n-1; i++) {
                sum = a + b;
                a = b;
                b = sum;
                System.out.print(sum + " ");
            }
        }



    }
}
