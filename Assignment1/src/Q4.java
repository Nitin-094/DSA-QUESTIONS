//Take two numbers and use the operators and calculate the value.

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the operation to be performed - (1.add 2.subtract 3.divide 4.multiply) :");
        int a = input.nextInt();

        System.out.print("Enter the number 1 -");
        int b = input.nextInt();

        System.out.print("Enter the number 2 -");
        int c = input.nextInt();

        if (a == 1) {
            System.out.println("addition of "+b+" & "+c+" = "+(b+c));
        }
        else if (a == 2) {
            System.out.println("Subtraction of "+b+" & "+c+" = "+(b-c));

        }
        else if (a == 3) {
            System.out.println("Division of "+b+" & "+c+" = "+(b/c));

        }
        else if (a == 3) {
            System.out.println("Multiplication of "+b+" & "+c+" = "+(b*c));

        }

    }

}
