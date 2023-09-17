import java.util.Scanner;

public class sum_function {
    public static void main(String[] args) {
        sum();
    }
    static void sum(){

        Scanner scan = new Scanner(System.in);

        System.out.print("Input 1st number : ");
        int n = scan.nextInt();
        System.out.print("Input 2nd number : ");
        int m = scan.nextInt();

        System.out.println("The sum of the two numbers is : " + (n+m));

    }

}
