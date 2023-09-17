//Take integer inputs till the user enters 0 and print the sum of all numbers

import java.util.Scanner;
public class Int_input {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        for(;;){

            System.out.print("input number : ");
            int n = scan.nextInt();
            if (n != 0) {
                sum = sum + n;
            }
            if (n == 0 ) {
                System.out.println("The sum is : "+ sum);
                break;
            }
        }
    }
}
