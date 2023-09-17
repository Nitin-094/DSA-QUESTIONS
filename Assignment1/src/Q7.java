import java.util.Scanner;

// To calculate the Fibonacci series.
public class Q7{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("enter n: ");
        int n = input.nextInt();
        int n1=0,n2=1,n3;

        if (n == 0) {
            System.out.print(n1);
        } else if (n == 1) {
            System.out.print(n1+" "+n2);
        }
        else {
            System.out.print(n1+" "+n2);
            for (int i = 2; i < n; i++) {

                n3=n1+n2;
                System.out.print(" "+n3);
                n1=n2;
                n2=n3;

            }


        }


    }




}