//Take two numbers as the input and print the largest number.

import java.util.Scanner;
public class Q5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a = input.nextInt();

        System.out.println("Enter the second number : ");
        int b = input.nextInt();

        if (b<a) {
            System.out.println("greater is a = "+a);
        }
        else {
            System.out.println("greater is b = "+b);
        }





    }



}
